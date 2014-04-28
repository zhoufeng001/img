package com.zf;

public class Test03 {
	
	public int i = 0 ;
	
	public void add(){
		i++ ;
		System.out.println(i);
		add();
	}

	public static void main(String[] args) {
		
		Test03 t3 = new Test03();
		
		t3.add(); 
		
	}
	
}
