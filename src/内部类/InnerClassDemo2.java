package �ڲ���;

//�ⲿ���  ʵ�������;�̬������ȥ�����ڲ��࣬ʵ������ֱ�Ӵ���ʵ������̬�����������ⲿ���ʵ����
//�ڲ������ֱ��ȥ�����ⲿ�����г�Ա�����ⲿ�����ͨ���ڲ���ʵ��ȥ����/
//ʵ���ڲ����в��ܶ���static��Ա
//���Ƕ���в���Խ�����ʣ�����һ��һ������ʵ��
//���ڲ������ⲿ������ͬ���Ƴ�Աi����ô���ڲ�����i,this.i,inner.this.i����ʾ�ڲ����i
//ֻ��Outer.this.i�ű�ʾ�ⲿ���i.

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer1 outer1=new Outer1();
		outer1.getAdd();
		outer1.getMul();
		//�ⲿ������ʵ�����ڲ��࣬Ҫ�����ⲿ�ࡣ
		Outer1.Inner1 in=new Outer1().new Inner1();
		in.add(1, 2);
		in.multip(3, 4);
		in.sys();
	}

}

//������ ֻ��public��Ĭ��
class Outer1{
	//���˶����࣬�������������η�������
	//����һ��ʵ���ڲ���
	int a=10;
	public class Inner1{
		//ʵ���ڲ����в��ܺ��о�̬��Ա
		//public static int num=1;
		public void add(int x,int y){
			System.out.println(x+y);
		}
		
		public void multip(int x,int y){
			System.out.println(x*y);
		}
		int a=20;
		//�ڲ������ⲿ����ͬ����Ա�����ڲ����� a,this.a,�ڲ���.this.a�����ڲ����Ա��ֻ���ⲿ������this.a�����ⲿ���Ա��
		public void sys(){
			System.out.println("a"+a);
			System.out.println("this.a"+this.a);
			System.out.println("Inner1.this.a"+Inner1.this.a);
			System.out.println("Outer1.this.a"+Outer1.this.a);
		}
	}

	//�ⲿ���ʵ�������з����ڲ��࣬�����ⲿ��ʵ����
	public void getAdd(){
		//ֱ�Ӵ���ʵ��
		Inner1 inner=new Inner1();
		inner.add(1, 1);
		inner.multip(1, 1);
	}
	
	//���ⲿ�ྲ̬�����з����ڲ���
	public static void getMul(){
		//�������ⲿ��ʵ�����ܴ���
		Inner1 inner=new Outer1().new Inner1();
		inner.add(2, 2);
		inner.multip(2, 2);
		
	}
}
