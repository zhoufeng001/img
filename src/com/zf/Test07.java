package com.zf;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Test07 {


	public static void main(String[] args) {
		
//		final Test07 t = new Test07();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("开始");
		while (true){
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(Test07.class);    
			enhancer.setUseCache(false);  

			enhancer.setCallback(new MethodInterceptor() {  
				public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {  
					return proxy.invokeSuper(obj, args);    }    
			});  
			
			enhancer.create();   
		}  

	}

}
