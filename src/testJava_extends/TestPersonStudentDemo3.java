package testJava_extends;
class Person2{
	String name;
	int age;
	public Person2(){
		
	}
	public String talk(){
		return"���ǣ�"+this.name+",����"+this.age+"��";
	}
}
class Student2 extends Person2{
	String school;
	public Student2(String name,int age,String school){
		super.name=name;//��super���ø����е�����
		super.age=age;
		this.school=school;
		System.out.println(super.talk());//���ø����е�talk()����
	}
}

public class TestPersonStudentDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s=new Student2("����", 25, "����");
		System.out.println(",ѧУ��"+s.school);
	}

}
