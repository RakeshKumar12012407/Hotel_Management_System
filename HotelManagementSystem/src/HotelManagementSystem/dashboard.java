package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;

public class dashboard extends JFrame {
	private static final long serialVersionUID = 1L;
	 dashboard(){
	    setSize(1375,740);
		setLocation(0,0);//location w.r.to screen 
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon("D:\\Eclipse link and files\\HotelManagementSystem\\Images\\Hospitality-Customer-Service.jpg");
		JLabel Image = new JLabel(i1);  //side use of JLabel
		Image.setBounds(0, 0, 1370, 730);//Location w.r.to frame
		add(Image);
		
		JLabel text = new JLabel("WELCOME");
		text.setBounds(500,0,600,100);
	    text.setForeground(Color.blue);
		text.setFont(new Font("serif", Font.ITALIC, 80));
	    Image.add(text);
	    
	    JMenuBar hm = new JMenuBar();
	    hm.setBounds(0,0,172,25);
	    Image.add(hm);
	    
	    JMenu hotel = new JMenu("HOTEL MANAGEMENT");
	    hotel.setFont(new Font("Plain", Font.PLAIN, 15));
	    hotel.setForeground(Color.RED);
	    hm.add(hotel);
	    
	    JMenuItem reception = new JMenuItem("RECEPTION");
	    reception.setFont(new Font("serif", Font.PLAIN, 12));
	    reception.setForeground(Color.MAGENTA);
	    hotel.add(reception);
	    
	    JMenuBar ad = new JMenuBar();
	    ad.setBounds(1195,0,172,25);
	    Image.add(ad);
	    
	    JMenu admin = new JMenu("ADMIN");
	    admin.setBounds(1000,0,600,100);
	    admin.setFont(new Font("Plain", Font.PLAIN, 15));
	    admin.setForeground(Color.red);
	    ad.add(admin);
	    
	    JMenuItem employee = new JMenuItem("ADD_EMPLOYEE");
	    employee.setFont(new Font("serif", Font.PLAIN, 12));
	    employee.setForeground(Color.MAGENTA);
	    admin.add(employee);
	    
	    JMenuItem rooms = new JMenuItem("ADD_ROOMS");
	    rooms.setFont(new Font("serif", Font.PLAIN, 12));
	    rooms.setForeground(Color.MAGENTA);
	    admin.add(rooms);
	    
	    JMenuItem drivers = new JMenuItem("ADD_DRIVERS");
	    drivers.setFont(new Font("serif", Font.PLAIN, 12));
	    drivers.setForeground(Color.MAGENTA);
	    admin.add(drivers);
	    
	    JMenuItem numbers = new JMenuItem("EMPLOYEE_PHONE_NO.");
	    numbers.setFont(new Font("serif", Font.PLAIN, 12));
	    numbers.setForeground(Color.MAGENTA);
	    admin.add(numbers);
	     
	    setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new dashboard();

	}

}
