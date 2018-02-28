package proxy;

public class Target implements ITarget {

	@Override
	public void run() {
		System.out.println("target running...");
	}
	
}
