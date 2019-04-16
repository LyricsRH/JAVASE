package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



//调用有参构造函数创建对象

public class HasParaConstruc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Class class1=Student1.class;
//		try {
//			//getConstructor里面要声明选择构造函数的参数列表，类型。
//			Constructor constructor=class1.getConstructor(int.class,String.class);
//			try {
//				Student1 student1=(Student1)constructor.newInstance(1,"aa");
//				System.out.println(student1);
//			} catch (InstantiationException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InvocationTargetException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//利用getConstructors()
		Class class1=Student1.class;
		Constructor<?>[] constructors=class1.getConstructors();
		
		for(int i=0;i<constructors.length;i++){
			System.out.println(i+"--"+constructors[i]);
		}
		
		try {
			Student1 student11=(Student1)constructors[1].newInstance(1,"aa");
			Student1 student12=(Student1)constructors[0].newInstance();
			System.out.println(student11);
			System.out.println(student12);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Student1 {
	 private int age;
	 private String name;
	
//	 public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public int  getName() {
//		return name;
//	}
//
//	public void setName(int name) {
//		this.name = name;
//	}

	public Student1(){
		 
	 }
	 
	 public Student1(int age,String name){
		 this.age=age;
		 this.name=name;
	 }
	 
	 public String toString(){
		 return "age"+age+"name"+name;
	 }
}
