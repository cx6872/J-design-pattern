package adapter_pattern;

interface Window {// 定义Window窗口接口，表示窗口操作
	public void open();// 窗口打开

	public void close();// 窗口关闭

	public void iconified();// 窗口最小化

	public void deiconified();// 窗口恢复

	public void activated();// 窗口活动
}

// 定义抽象类实现接口，在此类中覆写方法，但是所有的方法体为空
abstract class WindowAdapter implements Window {
	public void open() {
	};// 窗口打开

	public void close() {
	};// 窗口关闭

	public void iconified() {
	};// 窗口最小化

	public void deiconified() {
	};// 窗口恢复

	public void activated() {
	};// 窗口活动
}

// 子类继承WindowAdapter抽象类，选择性实现需要的方法
class WindowImpl extends WindowAdapter {
	public void open() {
		System.out.println("窗口打开");// 实现open()方法
	}

	public void close() {
		System.out.println("窗口关闭");// 实现close()方法
	}
}

public class AdapterDemo {
	public static void main(String args[]) {
		Window win = new WindowImpl(); // 实现接口对象
		// 调用方法
		win.open();
		win.close();
	}
}
/*
 
 适配器模式

        如果一个类要实现一个具有很多抽象方法的接口，但是本身只需要实现接口中的部分方法便可以
        达成目的，所以此时就需要一个中间的过渡类，但此过渡类又不希望直接使用，所以将此类定义
        为抽象类最为合适，再让以后的子类直接继承该抽象类便可选择性的覆写所需要的方法，而此抽
        象类便是适配器类。

 */
