package ����;
/*
 * ����newInstance()�����޲ι��캯����������Ӧclass����
 */

public class NoparanConstruc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1����ȡclass����
		Class stu=Student.class;
		try {
			//����newInstance()����class��Ӧ�������Ҫǿ������ת����newInstance����
			//student��Ĭ�Ϲ��캯����ɶ��󴴽���
			Student student1=(Student)stu.newInstance();
			student1.setAge(1);
			student1.setGrade(1);
			student1.setName("a");
			//��д��toString������
			System.out.print(student1);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}

class Student{
	//��д���캯����ʹ��Ĭ�Ϲ��캯�������д�˺��ι��캯����һ��Ҫдһ���޲ι��캯��
	
	private int age;
	private int grade;
	private String  name;
	//д���вι��캯�����򲻻����Ĭ���޲ι��캯����newInstance()���д���
	public Student(int age){
		this.age=1;
	}
	//����дһ���޲ι��캯������
	public Student(){
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//��дtostring()������println(����)���������ʽ�����
	public String toString(){
		return this.name+this.age+this.grade;
	}
}
