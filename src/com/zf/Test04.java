package com.zf;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>() ;
		
		int i = 0 ;
		while(true){
			System.out.println(++i);
			list.add( String.valueOf(i).intern() ) ;
		}
		
	}

}
