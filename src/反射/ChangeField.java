package ����;

import java.lang.reflect.Field;

//ͨ�������޸�field��ֵ

public class ChangeField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class class1=loaderClass.class;
		loaderClass lClass;
		try {
			lClass = (loaderClass) class1.newInstance();
			Field field;
			try {
				//���("String")�������֡�sting��field
				field = class1.getDeclaredField("num");
				field.setAccessible(true);
				//�޸�lClass��field��ֵ��
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
