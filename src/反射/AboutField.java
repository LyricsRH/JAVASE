package 反射;

import java.lang.reflect.Field;
/*
 * 每一个field表示一个变量。
 */

public class AboutField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?> class1=Class.forName("反射.loaderClass");
			//获取所有fields,返回一个数组
			Field[] fields=class1.getDeclaredFields();
			for (Field field : fields) {
			//设置为true,即可访问所有。
				field.setAccessible(true);
				//获取变量名
				System.out.println(field.getName());
				//获取变量类型
				System.out.println(field.getType());
				try {
					//field.get(object).获得object中field的值。
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
