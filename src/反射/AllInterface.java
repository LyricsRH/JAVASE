package ����;
/*
 * ��ȡһ��Class��ȫ���ӿڣ�getInterface()����������һ��Class<?>[]����������нӿڡ�
 */

public class AllInterface implements firstInterface,secondInterface,thirdInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?>[] inter=Class.forName("����.AllInterface").getInterfaces();
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