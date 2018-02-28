package singleton;

public class Singleton1 {
	// 1.私有化构造器
	private Singleton1() {}
	// 2.在内部创建一个对象
	private static Singleton1 instance = new Singleton1();
	// 3.提供一个公共的方法用于获取对象
	public static Singleton1 getInstance() {
		return instance;
	}
}
