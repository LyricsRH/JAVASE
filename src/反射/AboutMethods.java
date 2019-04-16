package 反射;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//访问成员方法1，class对象--getDeclaredMethods(),getDeclaredMethod
//2,返回Method[],Method
//3每一个Method对象都对应类中一个方法
public class AboutMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class class1=LoaderClas.class;
		Method[]methods=class1.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println("-----------------------");
			//获取方法名
			System.out.println(method.getName());
			//获取方法修饰符
			int mod=method.getModifiers();
			System.out.println(Modifier.toString(mod));
			//获取返回值类型
			Class<?> returnClass=method.getReturnType();
			System.out.println(returnClass.getName());
			//获取方法参数类型
			Class<?>[] para=method.getParameterTypes();
			System.out.println("参数类型");
			for (Class<?> class2 : para) {
				System.out.print(class2.getName());
			}
			//方法异常
			System.out.println("方法抛出异常");
			Class<?>[] exceptClasses=method.getExceptionTypes();
			for (Class<?> class2 : exceptClasses) {
				System.out.print(class2.getName());
			}
		}
	}

}

class LoaderClas{
	public void  staticMethod(){
		System.out.println("Hellow world!");
	}
	
	public int publicMethod(int i) throws ClassCastException,NumberFormatException{
		 return i*2;
	}
	
	protected float protectedMethod(float f,int i){
		return f+i;
	}
	
	public String privateMethod(String...str){
		return str[0];
	}
	
}
