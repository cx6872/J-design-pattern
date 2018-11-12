package factory_design_pattern;

interface Animal { // ����һ������Ľӿ�
	public void say(); // ˵������
}

class Cat implements Animal { // ��������Cat
	@Override
	public void say() { // ��дsay()����
		System.out.println("����è�䣬���أ�");
	}
}

class Dog implements Animal { // ��������Dog

	@Override
	public void say() { // ��дsay()����
		System.out.println("����С����������");
	}
}

class Factory { // ���幤����
	public static Animal getInstance(String className) {
		Animal a = null; // ����ӿڶ���
		if ("Cat".equals(className)) { // �ж����ĸ�����ı��
			a = new Cat(); // ͨ��Cat����ʵ�����ӿ�
		}
		if ("Dog".equals(className)) { // �ж����ĸ�����ı��
			a = new Dog(); // ͨ��Dog����ʵ�����ӿ�
		}
		return a;
	}
}

public class FactoryDemo {

	public static void main(String[] args) {
		Animal a = null; // ����ӿڶ���
		a = Factory.getInstance("Cat"); // ͨ��������ȡʵ��
		if (a != null) { // �ж϶����Ƿ�Ϊ��
			a.say(); // ���÷���
		}
	}
}
/*
 �������ģʽ

       �����ڽӿں�����֮�������һ�����ɶˣ�ͨ���˹��ɶ˿��Զ�̬ȡ��ʵ���˹�ͬ�ӿڵ�����ʵ��������


 
 */
 