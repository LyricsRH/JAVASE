package 反射;

/*使用Object类的getClass()方法获取类信息
 */

public class useGetClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superClass sup=new superClass();
		subclass sub=new subclass();
		Class c1=sup.getClass();
		Class c2=sub.getClass();
		System.out.println(c1.getName());
		System.out.println(c2.getName());
	}
}

class superClass{
	public void show(){
		System.out.println("这是superclass类的show()方法");
	}
}

class subclass extends superClass{
	public void shoe(){
		System.out.println("这是subclass类的show()方法");
	}
}
