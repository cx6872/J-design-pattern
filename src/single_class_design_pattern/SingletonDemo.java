package single_class_design_pattern;

class Singleton {
	private static Singleton instance = new Singleton();// 在内部产生本类的实例化对象

	public static Singleton getInstance() { // 通过静态方法返回instance对象
		return instance;
	}

	private Singleton() { // 将构造方法封装为私有化
	}

	public void print() {
		System.out.println("Hello World!!!");
	}
}

public class SingletonDemo {
	public static void main(String[] args) {
		Singleton s1 = null; // 声明对象
		Singleton s2 = null; // 声明对象
		Singleton s3 = null; // 声明对象
		s1 = Singleton.getInstance(); // 取得实例化对象
		s2 = Singleton.getInstance(); // 取得实例化对象
		s3 = Singleton.getInstance(); // 取得实例化对象
		s1.print(); // 调用方法
		s2.print(); // 调用方法
		s3.print(); // 调用方法
	}
}
/*
 单例设计模式

       所谓单例设计模式简单说就是无论程序如何运行，采用单例设计模式的类（Singleton类）永远只会有一个实例化对象产生。具体实现步骤如下：

      (1) 将采用单例设计模式的类的构造方法私有化（采用private修饰）。

      (2) 在其内部产生该类的实例化对象，并将其封装成private static类型。

      (3) 定义一个静态方法返回该类的实例。


 
 */


