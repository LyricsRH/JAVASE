package ����;

import java.lang.reflect.Field;
/*
 * ÿһ��field��ʾһ��������
 */

public class AboutField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?> class1=Class.forName("����.loaderClass");
			//��ȡ����fields,����һ������
			Field[] fields=class1.getDeclaredFields();
			for (Field field : fields) {
			//����Ϊtrue,���ɷ������С�
				field.setAccessible(true);
				//��ȡ������
				System.out.println(field.getName());
				//��ȡ��������
				System.out.println(field.getType());
				try {
					//field.get(object).���object��field��ֵ��
					System.out.println(field.get(class1.newInstance()));
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class loaderClass{
	private int num=101;
	protected boolean b=true;
	public long l=123L;
	String  string="java";
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
