package ����;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//���ʳ�Ա����1��class����--getDeclaredMethods(),getDeclaredMethod
//2,����Method[],Method
//3ÿһ��Method���󶼶�Ӧ����һ������
public class AboutMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class class1=LoaderClas.class;
		Method[]methods=class1.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println("-----------------------");
			//��ȡ������
			System.out.println(method.getName());
			//��ȡ�������η�
			int mod=method.getModifiers();
			System.out.println(Modifier.toString(mod));
			//��ȡ����ֵ����
			Class<?> returnClass=method.getReturnType();
			System.out.println(returnClass.getName());
			//��ȡ������������
			Class<?>[] para=method.getParameterTypes();
			System.out.println("��������");
			for (Class<?> class2 : para) {
				System.out.print(class2.getName());
			}
			//�����쳣
			System.out.println("�����׳��쳣");
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
