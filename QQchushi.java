package gui;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class QQchushi extends Thread{

	public static JButton j[]=new JButton[100];
	public void run(){
	
		JFrame frame1=new JFrame("QQ");
		frame1.setLayout(null);
		JScrollPane p=new JScrollPane();
		
		IPanel p1=new IPanel();
		
		
		Insets i=new Insets(5,0,5,140);
	    
		j[1]=new JButton("   ³ÉÊËÎ°");
		{
			j[1].setBounds(0, 0, 250, 50);
			//Ìí¼ÓÍ·Ïñ	
			ImageIcon icon1 = new ImageIcon(".\\2.png");
			j[1].setIcon(icon1);
			j[1].setMargin(i);
		}
		//¼àÌýÆ÷
		j[1].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DuiHua d1 = new DuiHua();
			    d1.start();
			}
		});
		
		p.add(j[1]);
		p.setBounds(0, 100, 300, 500);
		frame1.getContentPane().add(p);
		frame1.getContentPane().add(p1);
		frame1.setBounds(1000, 60, 250, 550);
		
		frame1.setResizable(false);
		frame1.setVisible(true);
	}
}

class IPanel extends JPanel{
	Image img;
	public void paint(Graphics g){
		try {
			img=ImageIO.read(new File(".\\¶¥¶Ë.png"));//Ö÷½çÃæÌùÍ¼
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		g.drawImage(img, 0, 0, 250, 100,null);
	}
}





















