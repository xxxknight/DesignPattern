package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {
	private Object obj;

	public DynamicSubject(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		preInvoke();
		System.out.println("before calling... "+method);
		
		method.invoke(obj, args);
		System.out.println(args==null);
		
		System.out.println("after calling... "+method);
		afterInvoke();
		return null;
	}
	
	private void preInvoke(){
		System.out.println("preInvoke method...");
	}
	
	private void afterInvoke(){
		System.out.println("afterInvoke method...");
	}

}
