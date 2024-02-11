package HotelManagementSystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	HotelManagementSystem(){
		setSize(1370,730);
		setLocation(0,0);//location w.r.to screen 
		setLayout(null);
		
  
		ImageIcon i1 = new ImageIcon("D:\\Eclipse link and files\\HotelManagementSystem\\Images\\2690553.jpg");
		JLabel Image = new JLabel(i1);  //side use of JLabel
		Image.setBounds(0, 0, 1366, 730);//Location w.r.to frame
		add(Image);
		
		
		JLabel text = new JLabel("PLEASANTRY HOTEL");
		text.setBounds(400,40,600,100);
	    text.setForeground(Color.YELLOW);
		text.setFont(new Font("serif", Font.ITALIC, 60));
	    Image.add(text);
	    
	    JButton next = new JButton ("Next");
	    next.setBounds(1210,629,138,60);
	    next.setBackground(Color.blue);
	    next.setForeground(Color.cyan);
	    next.addActionListener(this);
	    next.setFont(new Font("serif", Font.PLAIN,16));
	    Image.add(next);
		
		setVisible(true);
		
		while(true) {
			text.setVisible(false);
			next.setVisible(false);
			try {
				Thread.sleep(500);
			} 
			catch ( Exception e){
				e.printStackTrace();
			}
			text.setVisible(true);
			next.setVisible(true);
			try {
				Thread.sleep(700);
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	 //@override
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
	    new Login();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new HotelManagementSystem();
	}

}
