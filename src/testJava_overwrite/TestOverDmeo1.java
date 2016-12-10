package testJava_overwrite;

class Person{
	String name;
	int age;
	public String talk(){
		return "我是"+this.name+"，今年"+this.age;
	}
}
class Student extends Person{
	String school;
	public Student(String name,int age,String school){
		this.name=name;
		this.age=age;
		this.school=school;
	}
	//此处覆写Person中的talk()方法
	public String talk(){    
		return super.talk()+",我在"+this.school+"上学";
	}
}
public class TestOverDmeo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("张三",25, "北京");
		System.out.println(s.talk());
	}

}
