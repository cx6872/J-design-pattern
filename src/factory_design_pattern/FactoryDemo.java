package factory_design_pattern;

interface Animal { // 定义一个动物的接口
	public void say(); // 说话方法
}

class Cat implements Animal { // 定义子类Cat
	@Override
	public void say() { // 覆写say()方法
		System.out.println("我是猫咪，喵呜！");
	}
}

class Dog implements Animal { // 定义子类Dog

	@Override
	public void say() { // 覆写say()方法
		System.out.println("我是小狗，汪汪！");
	}
}

class Factory { // 定义工厂类
	public static Animal getInstance(String className) {
		Animal a = null; // 定义接口对象
		if ("Cat".equals(className)) { // 判断是哪个子类的标记
			a = new Cat(); // 通过Cat子类实例化接口
		}
		if ("Dog".equals(className)) { // 判断是哪个子类的标记
			a = new Dog(); // 通过Dog子类实例化接口
		}
		return a;
	}
}

public class FactoryDemo {

	public static void main(String[] args) {
		Animal a = null; // 定义接口对象
		a = Factory.getInstance("Cat"); // 通过工厂获取实例
		if (a != null) { // 判断对象是否为空
			a.say(); // 调用方法
		}
	}
}
/*
 工厂设计模式

       程序在接口和子类之间加入了一个过渡端，通过此过渡端可以动态取得实现了共同接口的子类实例化对象。


 
 */
 