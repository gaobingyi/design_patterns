package singleton;

public class Singleton4 {
	
	private static Singleton4 instance;
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		// 双重判断，提高效率
		if (instance == null) {
			// 同步代码块
			synchronized (Singleton4.class) {
				if (instance == null)
					instance = new Singleton4();
			}
		}
		return instance;
	}

}
