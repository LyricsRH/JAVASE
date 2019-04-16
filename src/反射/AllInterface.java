package 反射;
/*
 * 获取一个Class的全部接口，getInterface()方法。返回一个Class<?>[]数组包括所有接口。
 */

public class AllInterface implements firstInterface,secondInterface,thirdInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?>[] inter=Class.forName("反射.AllInterface").getInterfaces();
			for (Class<?> class1 : inter) {
				System.out.println(class1.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

interface firstInterface{};
interface secondInterface{};
interface thirdInterface{};