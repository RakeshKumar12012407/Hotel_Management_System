package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class add_employee extends JFrame {
	private static final long serialVersionUID = 1L;

	add_employee(){
		setLayout(null);
		
		JLabel lblname = new JLabel("NAME");
		lblname.setBounds(80,0,130,100);
	    lblname.setForeground(Color.BLACK);
		lblname.setFont(new Font("serif", Font.PLAIN, 20));
	    add(lblname);
		
	    JTextField tfname = new JTextField();
	    tfname.setBounds(230,33,300,30);
	    add(tfname);
	    
	    JLabel lblgender = new JLabel("GENDER");
		lblgender.setBounds(80,50,130,100);
	    lblgender.setForeground(Color.BLACK);
		lblgender.setFont(new Font("serif", Font.PLAIN, 20));
	    add(lblgender);
	    
	    JRadioButton rbmale = new JRadioButton("Male");
	    rbmale.setFont(new Font("serif", Font.PLAIN, 20));
	    rbmale.setBackground(Color.cyan);
	    rbmale.setBounds(230,65,80,70);
	    add(rbmale);
	    
	    JRadioButton rbfemale = new JRadioButton("Female");
	    rbfemale.setFont(new Font("serif", Font.PLAIN, 20));
	    rbfemale.setBackground(Color.cyan);
	    rbfemale.setBounds(340,65,100,70);
	    add(rbfemale);
	    
	    JRadioButton rbother = new JRadioButton("Other");
	    rbother.setFont(new Font("serif", Font.PLAIN, 20));
	    rbother.setBackground(Color.cyan);
	    rbother.setBounds(460,65,100,70);
	    add(rbother);
	    
	    JLabel lblage = new JLabel("AGE");
		lblage.setBounds(80,100,130,100);
	    lblage.setForeground(Color.BLACK);
		lblage.setFont(new Font("serif", Font.PLAIN, 20));
	    add(lblage);
		
	    JTextField tfage = new JTextField();
	    tfage.setBounds(230,135,300,30);
	    add(tfage);
	    
	    JLabel lbljob = new JLabel("JOB");
		lbljob.setBounds(80,150,130,100);
	    lbljob.setForeground(Color.BLACK);
		lbljob.setFont(new Font("serif", Font.PLAIN, 20));
	    add(lbljob);
	    
	    JTextField tfjob = new JTextField();
	    tfjob.setBounds(230,185,300,30);
	    add(tfjob);
	    
	    JLabel lblsalary = new JLabel("SALARY");
		lblsalary.setBounds(80,200,130,100);
	    lblsalary.setForeground(Color.BLACK);
		lblsalary.setFont(new Font("serif", Font.PLAIN, 20));
	    add(lblsalary);
	    
	    JTextField tfsalary = new JTextField();
	    tfsalary.setBounds(230,235,300,30);
	    add(tfsalary);
	    
	    JLabel lblphone = new JLabel("PHONE_NO");
		lblphone.setBounds(80,250,130,100);
	    lblphone.setForeground(Color.BLACK);
		lblphone.setFont(new Font("serif", Font.PLAIN, 20));
	    add(lblphone);
	    
	    JTextField tfphone = new JTextField();
	    tfphone.setBounds(230,285,300,30);
	    add(tfphone);
	    
	    JLabel lblemail = new JLabel("EMAIL");
		lblemail.setBounds(80,300,130,100);
	    lblemail.setForeground(Color.BLACK);
		lblemail.setFont(new Font("serif", Font.PLAIN, 20));
	    add(lblemail);
	    
	    JTextField tfemail = new JTextField();
	    tfemail.setBounds(230,335,300,30);
	    add(tfemail);
	    
	    JLabel lblaadhar = new JLabel("AADHAR_NO");
		lblaadhar.setBounds(80,350,130,100);
	    lblaadhar.setForeground(Color.BLACK);
		lblaadhar.setFont(new Font("serif", Font.PLAIN, 20));
	    add(lblaadhar);
	    
	    JTextField tfaadhar = new JTextField();
	    tfaadhar.setBounds(230,385,300,30);
	    add(tfaadhar);
	    
	    
		getContentPane().setBackground(Color.cyan);
		setBounds(330, 100, 850, 540);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new add_employee();
		

	}

}
