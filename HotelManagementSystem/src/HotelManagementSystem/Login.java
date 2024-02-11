package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login  extends JFrame implements ActionListener {
	JTextField Username;
	JPasswordField Password;
	JButton login, cancel;

private static final long serialVersionUID = 1L;

Login(){
	getContentPane().setBackground(Color.CYAN);
	
	setLayout(null);
	
    JLabel user = new JLabel("Username");
	user.setBounds(40,30,100,30);
	add(user);
	
    Username = new JTextField();
    Username.setBounds(120,30,250,30);
    add(Username);
	
	JLabel pass = new JLabel("Password");
	pass.setBounds(40,80,100,30);
	add(pass);
	
    Password = new JPasswordField();
	Password.setBounds(120,80,250,30);
	add(Password);
	
    login = new JButton("Login");
	login.setBounds(35,150,120,30);
	login.setBackground(Color.blue);
	login.setForeground(Color.cyan);
	login.setFont(new Font("serif", Font.PLAIN,18));
	login.addActionListener(this);
	add(login);
	
    cancel = new JButton("Cancel");
	cancel.setBounds(250,150,120,30);    
	cancel.setBackground(Color.blue);
	cancel.setForeground(Color.cyan);
	cancel.setFont(new Font("serif", Font.PLAIN,18));
	cancel.addActionListener(this);
	add(cancel);
	
	
	ImageIcon i1 = new ImageIcon ("D:\\Eclipse link and files\\HotelManagementSystem\\Images\\icons8-administrator-male-80 (1).jpg");
	Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
	ImageIcon i3 = new ImageIcon(i2);   //ImageIcon i3 = new ImageIcon(i2);
	JLabel Image = new JLabel(i3);  //side use of JLabel
	Image.setBounds(300, 30, 360, 150);//Location w.r.to frame
	add(Image);	
	setBounds(500, 200,600, 300);
	setVisible(true);
}

		public void actionPerformed(ActionEvent ae ) {
			if (ae.getSource()== login) { 
				String user = Username.getText();
				@SuppressWarnings("deprecation")
				String pass = Password.getText() ;
				
				try {
					Conn c = new Conn();
					
					String query = "SELECT * FROM login where Username = '" + user + "' AND Password = '" + pass + "' ";
					
					
					ResultSet rs = c.s.executeQuery(query);
					
					if (rs.next()) {
						setVisible(false);
						new dashboard();
						
					}else {
						JOptionPane.showMessageDialog(null , "Invalid Username or Password" );
						setVisible(false);
					}
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}	
				
			}
			else if (ae.getSource()== cancel) {
			   setVisible(false);
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Login();

	}

}
