package ∑¥…‰;

public class ParentClass  extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class class1=new ParentClass().getClass();
		Class pClass=class1.getSuperclass();
		System.out.println(pClass.getName());
		
		
	}

}
class Parent{}
