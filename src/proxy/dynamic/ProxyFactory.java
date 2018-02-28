package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import proxy.ITarget;

public class ProxyFactory {
	public static ITarget getProxy(ITarget target) {
		ITarget proxy = (ITarget) Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, 
							Object[] args) throws Throwable {
						System.out.println("start run");
						target.run();
						System.out.println("stop run");
						return null;
					}
			
		});
		return proxy;
	}
}
