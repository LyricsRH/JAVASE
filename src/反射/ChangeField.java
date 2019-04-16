package 反射;

import java.lang.reflect.Field;

//通过反射修改field的值

public class ChangeField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class class1=loaderClass.class;
		loaderClass lClass;
		try {
			lClass = (loaderClass) class1.newInstance();
			Field field;
			try {
				//获得("String")变量名字。sting的field
				field = class1.getDeclaredField("num");
				field.setAccessible(true);
				//修改lClass中field的值。
				field.set(lClass, 1021);
				System.out.println(field.get(lClass));
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}		
}
