package proxy;

import org.junit.Test;

import proxy.ITarget;
import proxy.Target;
import proxy.Target2;
import proxy.dynamic.ProxyFactory;
import proxy.static_.Target2Proxy;
import proxy.static_.TargetProxy;

public class ProxyTest {
	
	@Test
	public void testStaticProxy() {
		ITarget target = new Target();
		ITarget proxy = new TargetProxy(target);
		proxy.run();
		
		ITarget target2 = new Target2();
		ITarget proxy2 = new Target2Proxy(target2);
		proxy2.run();
	}
	
	@Test
	public void testDynamicProxy() {
		ITarget target = new Target();
		ITarget proxy = ProxyFactory.getProxy(target);
		proxy.run();
		
		ITarget target2 = new Target2();
		ITarget proxy2 = ProxyFactory.getProxy(target2);
		proxy2.run();
	}
	
}
