package 反射;
/*
 * 利用newInstance()调用无参构造函数，创建相应class对象。
 */

public class NoparanConstruc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1，获取class对象
		Class stu=Student.class;
		try {
			//利用newInstance()创建class对应类对象，需要强制类型转换，newInstance利用
			//student类默认构造函数完成对象创建。
			Student student1=(Student)stu.newInstance();
			student1.setAge(1);
			student1.setGrade(1);
			student1.setName("a");
			//重写了toString方法。
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
	//不写构造函数，使用默认构造函数。如果写了含参构造函数，一定要写一个无参构造函数
	
	private int age;
	private int grade;
	private String  name;
	//写了有参构造函数，则不会调用默认无参构造函数，newInstance()运行错误
	public Student(int age){
		this.age=1;
	}
	//可以写一个无参构造函数即可
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
	
	//重写tostring()方法，println(对象)按照这个格式输出。
	public String toString(){
		return this.name+this.age+this.grade;
	}
}
