package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DuiHua extends Thread{

	public void run(){
		String name1=QQchushi.j[1].getText();
		JFrame frame1=new JFrame(name1);
		frame1.setLayout(null);
		//各个面板
		JScrollPane p1=new JScrollPane();
		{
			JTextArea output=new JTextArea();
			output.setLineWrap(true);
			output.setRows(13);
			output.setColumns(2);
			output.setEditable(false);
			p1.setViewportView(output);	
			p1.setBounds(5, 5, 485, 250);
		}
		JScrollPane p2=new JScrollPane();
		{
			JTextArea input=new JTextArea();
			input.setLineWrap(true);
			input.setRows(4);
			input.setColumns(20);
			input.setEditable(true);
			p2.setViewportView(input);	
			p2.setBounds(5, 260, 485, 120);
		}
		JButton fasong=new JButton("发送");
		fasong.setBounds(405, 385, 80, 30);
		fasong.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		frame1.getContentPane().add(p1);
		frame1.getContentPane().add(p2);
		frame1.getContentPane().add(fasong);
        frame1.setBounds(400, 100, 500, 450);
		
		frame1.setResizable(false);
		frame1.setVisible(true);
	}
}
