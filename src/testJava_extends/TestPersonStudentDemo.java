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
		super();//����������һ�����
		//super����Ҫ���������������ø����е����ݣ������ø����е����Ի򷽷�
		System.out.println("2.public Student(){}");
	}
}
//�����������й��췽��ʱ��������ȥ���ø����е��޲ι��췽������ȥ�������౾��Ĺ��췽������ʵ���������У�Ĭ�ϼ���super();
public class TestPersonStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.name="����";
		s.age=25;
		s.school="����";
		System.out.println("������"+s.name+",���䣺"+s.age+",ѧУ:"+s.school);
	}

}
