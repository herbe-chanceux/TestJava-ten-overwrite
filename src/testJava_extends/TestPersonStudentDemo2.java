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
		super("张三",25);//调用父类中的构造方法
	}
}

public class TestPersonStudentDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		s.school="北京";
		System.out.println("姓名："+s.name+",年龄："+s.age+",学校:"+s.school);
		
	}

}
