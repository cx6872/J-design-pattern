package observer_design_pattern;

import java.util.Observable;
import java.util.Observer;

class House extends Observable {
	private float price;

	public void setPrice(float price) {
		this.setChanged();// ���ñ仯��
		this.notifyObservers(price);// ֪ͨ���й۲��߼۸�ı�
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}

	public House(float price) {
		this.price = price;
	}

	public String toString() {
		return "���Ӽ۸�Ϊ: " + this.price;
	}
}

class HousePriceObserver implements Observer {
	private String name;

	public HousePriceObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {// ֻҪ�ı��� observable ����͵��ô˷���
		if (arg instanceof Float) {
			System.out.println(this.name + "�۲�ļ۸����Ϊ:"
					+ ((Float) arg).floatValue());
		}

	}

}

public class ObserDeom {
	public static void main(String[] args) {
		House h = new House(1000000);
		HousePriceObserver hpo1 = new HousePriceObserver("������A");
		HousePriceObserver hpo2 = new HousePriceObserver("������B");
		HousePriceObserver hpo3 = new HousePriceObserver("������C");
		h.addObserver(hpo1);// ������ע��۲���
		h.addObserver(hpo2);// ������ע��۲���
		h.addObserver(hpo3);// ������ע��۲���
		System.out.println(h);// ������Ӽ۸�
		// �޸ķ��Ӽ۸񣬻ᴥ��update(Observable o, Object arg)����֪ͨ�������µķ�����Ϣ
		h.setPrice(2222222);// 
		System.out.println(h);// �ٴ�������Ӽ۸�
	}
}

/*
�۲������ģʽ

       ��ν�۲���ģʽ���ٸ�����������๺���߶����й۲��߷��۵ı仯�������۱仯ʱ�����й����߶��ܹ۲쵽�����ϵĹ��������ڹ۲��ߣ�����ǹ۲���ģʽ��

       java�п��Խ���Observable���Observer�ӿ�����ʵ�����Ϲ��ܡ���Ȼ����ģʽ��ʵ��Ҳ�����������ڲ����������ࡣ




*/
