package adapter_pattern;

interface Window {// ����Window���ڽӿڣ���ʾ���ڲ���
	public void open();// ���ڴ�

	public void close();// ���ڹر�

	public void iconified();// ������С��

	public void deiconified();// ���ڻָ�

	public void activated();// ���ڻ
}

// ���������ʵ�ֽӿڣ��ڴ����и�д�������������еķ�����Ϊ��
abstract class WindowAdapter implements Window {
	public void open() {
	};// ���ڴ�

	public void close() {
	};// ���ڹر�

	public void iconified() {
	};// ������С��

	public void deiconified() {
	};// ���ڻָ�

	public void activated() {
	};// ���ڻ
}

// ����̳�WindowAdapter�����࣬ѡ����ʵ����Ҫ�ķ���
class WindowImpl extends WindowAdapter {
	public void open() {
		System.out.println("���ڴ�");// ʵ��open()����
	}

	public void close() {
		System.out.println("���ڹر�");// ʵ��close()����
	}
}

public class AdapterDemo {
	public static void main(String args[]) {
		Window win = new WindowImpl(); // ʵ�ֽӿڶ���
		// ���÷���
		win.open();
		win.close();
	}
}
/*
 
 ������ģʽ

        ���һ����Ҫʵ��һ�����кܶ���󷽷��Ľӿڣ����Ǳ���ֻ��Ҫʵ�ֽӿ��еĲ��ַ��������
        ���Ŀ�ģ����Դ�ʱ����Ҫһ���м�Ĺ����࣬���˹������ֲ�ϣ��ֱ��ʹ�ã����Խ����ඨ��
        Ϊ��������Ϊ���ʣ������Ժ������ֱ�Ӽ̳иó�������ѡ���Եĸ�д����Ҫ�ķ��������˳�
        ��������������ࡣ

 */
