package testJava_overwrite;

class Person{
	String name;
	int age;
	public String talk(){
		return "����"+this.name+"������"+this.age;
	}
}
class Student extends Person{
	String school;
	public Student(String name,int age,String school){
		this.name=name;
		this.age=age;
		this.school=school;
	}
	//�˴���дPerson�е�talk()����
	public String talk(){    
		return super.talk()+",����"+this.school+"��ѧ";
	}
}
public class TestOverDmeo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("����",25, "����");
		System.out.println(s.talk());
	}

}
