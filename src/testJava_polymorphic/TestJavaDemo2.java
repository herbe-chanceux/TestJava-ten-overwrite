package testJava_polymorphic;

class Person{
	public void fun1(){
		System.out.println("11111111111111");
	}
	public void fun2(){
		System.out.println("22222222222222222");
	}
}
class Student extends Person{
	public void fun1(){
		System.out.println("33333333333");
	}
	public void fun3(){
		System.out.println("4444444444444444");
	}
}
public class TestJavaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Student();//���д��Person p=new Person()ֻ�ǽ��������䱾��ʵ�������Լ��Ķ��󣬸��������֪��˭����������
		Student s=(Student)p;
		p.fun1();
		p.fun2();

	}

}
