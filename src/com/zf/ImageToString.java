package com.zf;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class ImageToString {



	public String imageToString(BufferedImage image){

		Color  color =  null ;
		int r = 0 ;
		for (int i = 0; i <image.getHeight() ; i += 1) {
			for (int j = 0; j < image.getWidth() ; j += 1) {
				try {
					color = new Color(image.getRGB(j , i));
				} catch (Exception e) {
					System.err.println(i + " " + j);  
				}  
				r = color.getRed() ;
				if(r == 0){
					System.out.print("   ");
				}else{
					System.out.print(" # ");
				}  
			}
			System.out.println("");
		}
		
		return null ;
	}

}
