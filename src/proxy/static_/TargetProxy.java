package proxy.static_;

import proxy.ITarget;

public class TargetProxy implements ITarget {
	private ITarget target;
	
	public TargetProxy(ITarget target) {
		this.target = target;
	}

	@Override
	public void run() {
		System.out.println("start run");
		target.run();
		System.out.println("stop run");
	}
}
