package observer_design_pattern;

import java.util.Observable;
import java.util.Observer;

class House extends Observable {
	private float price;

	public void setPrice(float price) {
		this.setChanged();// 设置变化点
		this.notifyObservers(price);// 通知所有观察者价格改变
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}

	public House(float price) {
		this.price = price;
	}

	public String toString() {
		return "房子价格为: " + this.price;
	}
}

class HousePriceObserver implements Observer {
	private String name;

	public HousePriceObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {// 只要改变了 observable 对象就调用此方法
		if (arg instanceof Float) {
			System.out.println(this.name + "观察的价格更改为:"
					+ ((Float) arg).floatValue());
		}

	}

}

public class ObserDeom {
	public static void main(String[] args) {
		House h = new House(1000000);
		HousePriceObserver hpo1 = new HousePriceObserver("购房者A");
		HousePriceObserver hpo2 = new HousePriceObserver("购房者B");
		HousePriceObserver hpo3 = new HousePriceObserver("购房者C");
		h.addObserver(hpo1);// 给房子注册观察者
		h.addObserver(hpo2);// 给房子注册观察者
		h.addObserver(hpo3);// 给房子注册观察者
		System.out.println(h);// 输出房子价格
		// 修改房子价格，会触发update(Observable o, Object arg)方法通知购房者新的房价信息
		h.setPrice(2222222);// 
		System.out.println(h);// 再次输出房子价格
	}
}

/*
观察者设计模式

       所谓观察者模式，举个例子现在许多购房者都密切观察者房价的变化，当房价变化时，所有购房者都能观察到，以上的购房者属于观察者，这便是观察者模式。

       java中可以借助Observable类和Observer接口轻松实现以上功能。当然此种模式的实现也不仅仅局限于采用这两个类。




*/
