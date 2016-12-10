package testJava_extends;
class Person2{
	String name;
	int age;
	public Person2(){
		
	}
	public String talk(){
		return"我是："+this.name+",今年"+this.age+"岁";
	}
}
class Student2 extends Person2{
	String school;
	public Student2(String name,int age,String school){
		super.name=name;//用super调用父类中的属性
		super.age=age;
		this.school=school;
		System.out.println(super.talk());//调用父类中的talk()方法
	}
}

public class TestPersonStudentDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s=new Student2("张三", 25, "北京");
		System.out.println(",学校："+s.school);
	}

}
