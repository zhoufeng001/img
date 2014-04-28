package com.zf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class Test06 {
	
	public static void main(String[] args) {
		
		final List<Integer> list = new ArrayList<Integer>() ;
		
		List<Object> objList = new ArrayList<Object>() ;
		Object o = null ;
		while(true){
			
			o = Proxy.newProxyInstance(Test06.class.getClassLoader(),new Class[]{List.class},new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
					return method.invoke(list, args) ;
				}
			}) ;
			
			objList.add(o) ;
		}
		
	}

}
