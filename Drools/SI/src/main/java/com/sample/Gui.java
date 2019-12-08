package com.sample;

import java.awt.Font;
import javax.swing.*; 
import java.awt.event.*;  

public class Gui {
	
	public String answer = null;

	public Gui(String question, String[] answers){
		int width = 1500, height;
        if(answers.length <= 3) {
        	height = 400;
        }
        else {
        	height = 600;
        }
		JFrame f=new JFrame("Which horror movie should you watch?");
		JLabel label1 = new JLabel(question, SwingConstants.CENTER); 
		label1.setFont(new Font("Courier", Font.BOLD,30));
		
        JPanel panel = new JPanel();
		panel.setBounds(0, 70, 1500, 200);
		
		if(answers.length == 3) {
			JButton b1=new JButton(answers[0]);    
			b1.setBounds(0,height / 2,500,100);
			JButton b2=new JButton(answers[1]);    
			b2.setBounds(width / 3,height / 2,500,100);
			JButton b3=new JButton(answers[2]);    
			b3.setBounds(width / 3 * 2,height / 2,500,100);
			
		    b1.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[0];
		        	f.dispose();
		        }
		    });
		    
		    b2.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[1];
		        	f.dispose();
		        }
		    }); 
		    
		    b3.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[2];
		        	f.dispose();
		        }
		    }); 
		    
			f.add(b1); 
			f.add(b2);
			f.add(b3);
		}
		else if(answers.length == 2) {
			JButton b1=new JButton(answers[0]);    
			b1.setBounds(0,height / 2,750,100);
			JButton b2=new JButton(answers[1]);    
			b2.setBounds(width / 2,height / 2,750,100);
			
		    b1.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[0];
		        	f.dispose();
		        }
		    });
		    
		    b2.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[1];
		        	f.dispose();
		        }
		    }); 
		    
			f.add(b1); 
			f.add(b2);
		}
		else if(answers.length == 5) {
			JButton b1=new JButton(answers[0]);    
			b1.setBounds(0,height / 2,500,100);
			JButton b2=new JButton(answers[1]);    
			b2.setBounds(width / 3,height / 2,500,100);
			JButton b3=new JButton(answers[2]);    
			b3.setBounds(width / 3 * 2,height / 2,500,100);
			JButton b4=new JButton(answers[3]);    
			b4.setBounds(250,height / 2 + 100,500,100);
			JButton b5=new JButton(answers[4]);    
			b5.setBounds(width / 3 + 250,height / 2 + 100,500,100);

			
		    b1.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[0];
		        	f.dispose();
		        }
		    });
		    
		    b2.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[1];
		        	f.dispose();
		        }
		    });
		    
		    b3.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[2];
		        	f.dispose();
		        }
		    });
		    
		    b4.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[3];
		        	f.dispose();
		        }
		    }); 
		    b5.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[4];
		        	f.dispose();
		        }
		    }); 
		    
		    
			f.add(b1); 
			f.add(b2);
			f.add(b3); 
			f.add(b4);
			f.add(b5);
		}
		else if(answers.length == 6) {
			JButton b1=new JButton(answers[0]);    
			b1.setBounds(0,height / 2,500,100);
			JButton b2=new JButton(answers[1]);    
			b2.setBounds(width / 3,height / 2,500,100);
			JButton b3=new JButton(answers[2]);    
			b3.setBounds(width / 3 * 2,height / 2,500,100);
			JButton b4=new JButton(answers[3]);    
			b4.setBounds(0,height / 2 + 100,500,100);
			JButton b5=new JButton(answers[4]);    
			b5.setBounds(width / 3,height / 2 + 100,500,100);
			JButton b6=new JButton(answers[5]);    
			b6.setBounds(width / 3 * 2,height / 2 + 100,500,100);

			
		    b1.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[0];
		        	f.dispose();
		        }
		    });
		    
		    b2.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[1];
		        	f.dispose();
		        }
		    });
		    
		    b3.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[2];
		        	f.dispose();
		        }
		    });
		    
		    b4.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[3];
		        	f.dispose();
		        }
		    }); 
		    b5.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[4];
		        	f.dispose();
		        }
		    }); 
		    b6.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){
		        	answer = answers[5];
		        	f.dispose();
		        }
		    }); 
		    
		    
			f.add(b1); 
			f.add(b2);
			f.add(b3); 
			f.add(b4);
			f.add(b5);
			f.add(b6);

		}
		
		
		panel.add(label1);
		f.add(panel);
		f.setSize(width, height);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		}

 }