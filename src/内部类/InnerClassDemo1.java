package 内部类;

//内部类的声明，在外部类中可以直接new Inner().在外部类外，必须要new Outer().new Inner()。

public class InnerClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer outer=new Outer();
		outer.getInfo();
		Outer.Inner inner=new Outer().new Inner();//创建内部类对象,因为是实例内部类，所以创建内部类实例必须要有外部类对象
		inner.add(1, 1);//用内部类对象调用内部类方法。
		outer.new Inner().add(2, 2);
		inner.getStr();
	}

}

class Outer{
	
	public  class Inner{
		
		private String string="这是外部类的private变量";
		
		public void  add(int x,int y){
			System.out.println(x+y);
		}
		
		public void getStr(){
			System.out.println(string);
		}
	}

	//在外部类调用内部类方法
	public void getInfo(){
		new Inner().getStr();
	}
}
