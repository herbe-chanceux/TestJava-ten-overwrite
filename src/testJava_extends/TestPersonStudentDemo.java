package testJava_extends;

class Person{
	String name;
	int age;
	public Person(){
		System.out.println("1.public Person(){}");
	}
}
class Student extends Person{
	String school;
	public Student(){
		super();//隐含了这样一条语句
		//super的主要功能是完成子类调用父类中的内容，即调用父类中的属性或方法
		System.out.println("2.public Student(){}");
	}
}
//当父类里面有构造方法时，程序先去调用父类中的无参构造方法，再去调用子类本身的构造方法。其实，在子类中，默认加了super();
public class TestPersonStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.name="张三";
		s.age=25;
		s.school="北京";
		System.out.println("姓名："+s.name+",年龄："+s.age+",学校:"+s.school);
	}

}
