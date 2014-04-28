package com.zf;

public class Test08 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(10000);
		
		System.out.println("¿ªÊ¼");
		
		int j = 0 ;
		while(j <= 3000){
			
			new Thread(){
				@Override
				public void run() {
					int i  = 0 ;
					while(true){
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						i++ ;
//						System.out.println("  ");
					}
				}
			}.start();; 
			
			System.out.println(j++);
		}
		
		Thread.sleep(10000000);
		
	}

}
