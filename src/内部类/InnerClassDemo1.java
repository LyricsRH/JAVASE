package �ڲ���;

//�ڲ�������������ⲿ���п���ֱ��new Inner().���ⲿ���⣬����Ҫnew Outer().new Inner()��

public class InnerClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer outer=new Outer();
		outer.getInfo();
		Outer.Inner inner=new Outer().new Inner();//�����ڲ������,��Ϊ��ʵ���ڲ��࣬���Դ����ڲ���ʵ������Ҫ���ⲿ�����
		inner.add(1, 1);//���ڲ����������ڲ��෽����
		outer.new Inner().add(2, 2);
		inner.getStr();
	}

}

class Outer{
	
	public  class Inner{
		
		private String string="�����ⲿ���private����";
		
		public void  add(int x,int y){
			System.out.println(x+y);
		}
		
		public void getStr(){
			System.out.println(string);
		}
	}

	//���ⲿ������ڲ��෽��
	public void getInfo(){
		new Inner().getStr();
	}
}
