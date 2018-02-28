package proxy.static_;

import proxy.ITarget;

public class Target2Proxy implements ITarget {
	private ITarget target;
	
	public Target2Proxy(ITarget target) {
		this.target = target;
	}

	@Override
	public void run() {
		System.out.println("start run");
		target.run();
		System.out.println("stop run");
	}
}
