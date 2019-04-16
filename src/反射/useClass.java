package 反射;
/*
 * 用Class类来加载对象。forName()
 */

public class useClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c=null;
		try {
			c=Class.forName("反射.loadeclass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(c.getName());
	}
}

class loadeclass{
	static{
		System.out.print("static 代码块11 ");
	}
}
