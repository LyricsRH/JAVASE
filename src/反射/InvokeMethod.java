package 反射;

import java.lang.reflect.Method;

//用Method实现调用类中方法。通过利用method的invoke方法。

public class InvokeMethod {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class c=LoaderClas.class;
		LoaderClas clas=(LoaderClas)c.newInstance();
		Method[]methods=c.getDeclaredMethods();
		
		for (int i=0;i<methods.length;i++) {
			methods[i].setAccessible(true);
			System.out.println(methods[i].getName());
			try {
				if(i==0){
					System.out.println(methods[0].invoke(clas));
				}else if (i==1) {
					System.out.println(methods[1].invoke(clas, 2));
				}else if (i==2) {
					System.out.println(	methods[2].invoke(clas, 3.4f,12));
				}else if (i==3) {
					//这个写法。。。。
					Object[]strings=new Object[]{new String[]{ "a","b","c"}};
					System.out.println(methods[3].invoke(clas, strings));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("---------------");
		}
		
	}

}
