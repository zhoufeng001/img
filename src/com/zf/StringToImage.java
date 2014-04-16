package com.zf;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class StringToImage {

	public static final int IMG_HEIGHT = 80 ;         
	public static final int IMG_WIDTH = 80 ;         
	public static final int FONT_WIDTH = 80 ;  //每个文字在图片中的宽度
	public static final int FONT_SIZE = 70; //文字大小  
	public static final int FONT_X = 8 ;      
    public static final int FONT_Y = 70 ;  

	public BufferedImage charToImage(String str){
		BufferedImage bi = new BufferedImage(  FONT_WIDTH * str.length()  , IMG_HEIGHT , BufferedImage.TYPE_INT_RGB ) ;  
		Graphics g = bi.getGraphics() ;  
		Font font = new Font("楷体" , Font.BOLD , FONT_SIZE );  
		g.setFont(font); 
		g.drawString( str , FONT_X , FONT_Y);  
		try {
			ImageIO.write(bi, "jpg", new File("C:/Users/wb-zhoufeng/Desktop/tmp.jpg")) ;
		} catch (IOException e) {
			e.printStackTrace();   
		}
		return  bi ;
	}

}
