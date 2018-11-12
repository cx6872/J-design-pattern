package single_class_design_pattern;

class Singleton {
	private static Singleton instance = new Singleton();// ���ڲ����������ʵ��������

	public static Singleton getInstance() { // ͨ����̬��������instance����
		return instance;
	}

	private Singleton() { // �����췽����װΪ˽�л�
	}

	public void print() {
		System.out.println("Hello World!!!");
	}
}

public class SingletonDemo {
	public static void main(String[] args) {
		Singleton s1 = null; // ��������
		Singleton s2 = null; // ��������
		Singleton s3 = null; // ��������
		s1 = Singleton.getInstance(); // ȡ��ʵ��������
		s2 = Singleton.getInstance(); // ȡ��ʵ��������
		s3 = Singleton.getInstance(); // ȡ��ʵ��������
		s1.print(); // ���÷���
		s2.print(); // ���÷���
		s3.print(); // ���÷���
	}
}
/*
 �������ģʽ

       ��ν�������ģʽ��˵�������۳���������У����õ������ģʽ���ࣨSingleton�ࣩ��Զֻ����һ��ʵ�����������������ʵ�ֲ������£�

      (1) �����õ������ģʽ����Ĺ��췽��˽�л�������private���Σ���

      (2) �����ڲ����������ʵ�������󣬲������װ��private static���͡�

      (3) ����һ����̬�������ظ����ʵ����


 
 */


