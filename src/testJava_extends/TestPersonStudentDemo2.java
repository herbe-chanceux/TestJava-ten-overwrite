package testJava_extends;
class Person1{
	  String name;
	  int age;
	public Person1(String name, int age){
		this.name=name;
		this.age =age;
	}
}
class Student1 extends Person1{
	String school;
	public Student1(){
		super("����",25);//���ø����еĹ��췽��
	}
}

public class TestPersonStudentDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		s.school="����";
		System.out.println("������"+s.name+",���䣺"+s.age+",ѧУ:"+s.school);
		
	}

}
