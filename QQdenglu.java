package gui;

import java.io.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.*;


public class QQdenglu {
	public static void main(String[] args){
		// TODO Auto-generated method stub	
	
		final JFrame frame1=new JFrame("");
		frame1.setLayout(null);
		
		ImagePanel ip1=new ImagePanel();//
		{
			ip1.setBounds(0, 0, 435, 159);
		}
		TopicPanel ip2=new TopicPanel();//Í·Ïñ
		{
			ip2.setBounds(0, 170, 120, 120);
		}
		JComboBox zhanghao=new JComboBox();
		{    
		    zhanghao.setEditable(true);
		    zhanghao.setBounds(135, 170, 195, 30);
		}    		    		    
		JButton zhuce=new JButton("×¢²áÕËºÅ");
		{
			zhuce.setBounds(330, 170, 100, 30);	
		    zhuce.setBorderPainted(false);
		}
		JPasswordField mima=new JPasswordField();
		{
			mima.setBounds(135, 200, 195, 30);
		
		}    
		JButton zhaohui=new JButton("ÕÒ»ØÃÜÂë");
		{
			zhaohui.setBounds(330, 200, 100, 30);	
		    zhaohui.setBorderPainted(false);
		}    
		JButton denglu=new JButton("µÇ  Â¼");
		{
			denglu.setBounds(135, 250, 195, 30);
		}
		//µÇÂ¼°´Å¥ÊÂ¼þ
		denglu.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				QQchushi q = new QQchushi();
				q.start();
				frame1.dispose();
			}
			 
	    });
		    
		frame1.getContentPane().add(ip1);
		frame1.getContentPane().add(ip2);
		frame1.getContentPane().add(zhanghao);
		frame1.getContentPane().add(zhuce);
		frame1.getContentPane().add(mima);
		frame1.getContentPane().add(zhaohui);
		frame1.getContentPane().add(denglu);
		frame1.setBounds(460, 210, 435, 335);
			
		frame1.setResizable(false);
		frame1.setVisible(true);
	}
}

class ImagePanel extends JPanel{
	Image img;
	Image img1;
	MediaTracker mt=new MediaTracker(this);
	public void paint(Graphics g){
		try {
			img=ImageIO.read(new File(".\\¶¥¶Ë.png"));
			img1=ImageIO.read(new File(".\\Í·Ïñ.png"));
			mt.addImage(img, 1);
			mt.addImage(img1, 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		g.drawImage(img, 0, 0, 435, 159,null);
		g.drawImage(img1, 0, 170, 120, 120,null);
	}
}


class TopicPanel extends JPanel{//Í·Ïñ
	Image img1;
	public void paint(Graphics g1){
		try {
			img1=ImageIO.read(new File(".\\Í·Ïñ.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	
}
