package com.sample;

import java.awt.Font;
import javax.swing.*; 

public class DecisionGui {
	

	public DecisionGui(String title){
		JFrame f=new JFrame("Decision");
		JLabel label1 = new JLabel(title, SwingConstants.CENTER); 
		label1.setFont(new Font("Courier", Font.BOLD,50));
		
        JPanel panel = new JPanel();
		panel.setBounds(0, 130, 800, 400);
		
		panel.add(label1);
		f.add(panel);
		f.setSize(800, 400);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	}

 }