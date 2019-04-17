package 内部类;

//外部类的  实例方法和静态方法中去调用内部类，实例方法直接创建实例，静态方法必须有外部类的实例。
//内部类可以直接去访问外部类所有成员，而外部类必须通过内部类实例去访问/
//实例内部类中不能定义static成员
//多层嵌套中不能越级访问，必须一级一级创建实例
//若内部类与外部类由相同名称成员i，那么在内部类中i,this.i,inner.this.i都表示内部类的i
//只有Outer.this.i才表示外部类的i.

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer1 outer1=new Outer1();
		outer1.getAdd();
		outer1.getMul();
		//外部类外面实例化内部类，要带上外部类。
		Outer1.Inner1 in=new Outer1().new Inner1();
		in.add(1, 2);
		in.multip(3, 4);
		in.sys();
	}

}

//顶级类 只能public和默认
class Outer1{
	//除了顶级类，其他类所有修饰符都可以
	//这是一个实例内部类
	int a=10;
	public class Inner1{
		//实例内部类中不能含有静态成员
		//public static int num=1;
		public void add(int x,int y){
			System.out.println(x+y);
		}
		
		public void multip(int x,int y){
			System.out.println(x*y);
		}
		int a=20;
		//内部类与外部类由同名成员，在内部类中 a,this.a,内部类.this.a都是内部类成员。只有外部类名。this.a才是外部类成员。
		public void sys(){
			System.out.println("a"+a);
			System.out.println("this.a"+this.a);
			System.out.println("Inner1.this.a"+Inner1.this.a);
			System.out.println("Outer1.this.a"+Outer1.this.a);
		}
	}

	//外部类的实例方法中访问内部类，不用外部类实例，
	public void getAdd(){
		//直接创建实例
		Inner1 inner=new Inner1();
		inner.add(1, 1);
		inner.multip(1, 1);
	}
	
	//从外部类静态方法中访问内部类
	public static void getMul(){
		//必须有外部类实例才能创建
		Inner1 inner=new Outer1().new Inner1();
		inner.add(2, 2);
		inner.multip(2, 2);
		
	}
}
