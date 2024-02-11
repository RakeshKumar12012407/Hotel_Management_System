package HotelManagementSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Conn extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	Connection c;
	Statement s;
	
	Conn(){
		
		try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   c = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagementSystem","root","MySql");
		   s = c.createStatement();
		   
		   //System.out.println("JDBC driver registered successfully!");
		}
		catch (Exception e){
			
			//System.err.println("Error: JDBC driver not found!");
			
		    e.printStackTrace()	;
		}
		
	 }
	
	
		

	//@override
		public void actionPerformed(ActionEvent ae) {
			
		}
 
}


