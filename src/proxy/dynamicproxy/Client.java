package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		RealSubject realsubject =new RealSubject();
		InvocationHandler handler = new DynamicSubject(realsubject);
		Class<?> classType = handler.getClass();
		Subject sub = (Subject) Proxy.newProxyInstance(classType.getClassLoader(), 
				realsubject.getClass().getInterfaces(), handler);
		sub.request();
		System.out.println(sub.getClass());
	}
}
