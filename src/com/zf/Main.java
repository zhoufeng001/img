package com.zf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {


	public static final int IMG_HEIGHT = 80 ;         
	public static final int IMG_WIDTH = 80 ;         
	public static final int FONT_WIDTH = 80 ; 
	public static final int FONT_SIZE = 70; 
	public static final int FONT_X = 8 ;      
	public static final int FONT_Y = 70 ;  
	public static final int ZOOM = 5 ;  	//Ëõ·Å±¶Êý
	public static final String BACKGROUND = " ";
	public static final String FOREGROUND = "*";
	
	//[img=http://forum.csdn.net/PointForum/ui/scripts/csdn/Plugin/003/monkey/16.gif][/img]

	
	public static BufferedImage charToImage(String str){
		BufferedImage bi = new BufferedImage(  FONT_WIDTH * str.length()  , IMG_HEIGHT , BufferedImage.TYPE_INT_RGB ) ;  
		Graphics g = bi.getGraphics() ;  
		Font font = new Font("¿¬Ìå" , Font.BOLD , FONT_SIZE );  
		g.setFont(font); 
		g.drawString( str , FONT_X , FONT_Y);  
		return  bi ;
	}

	public static String imageToString(BufferedImage image){
		StringBuilder sb = new StringBuilder() ;
		StringBuilder line = null ;
		Color  color =  null ;
		int r = 0 ;
		for (int i = 0; i <image.getHeight() ; i += ZOOM) {
			line = new StringBuilder() ;
			for (int j = 0; j < image.getWidth() ; j += ZOOM) {
				color = new Color(image.getRGB(j , i));
				r = color.getRed() ;
				if(r == 0){
					line.append(BACKGROUND) ;
				}else{
					line.append(FOREGROUND) ;
				}  
			}
			sb.append(line.toString().trim())  ;
			sb.append("\n");
		}
		return sb.toString().trim() ;
	}
	

	public static void main(String[] args) {
		
/*		String str = 
				"*   *   *   *\n"
				+"*   *   *   *"
				;
		System.out.println(str);*/

		BufferedImage bi = charToImage("LV") ;

		String result = imageToString(bi) ;
		
		System.out.println(result);  

	}

}
