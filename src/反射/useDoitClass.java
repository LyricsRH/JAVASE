package 反射;
/*
 * 使用类标记
 */

public class useDoitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class c1=loadeclaa.class;
		System.out.println(c1.getName());
	}

}

class loadeclaa{
	static {
		System.out.println("代码块");
	}
} 
