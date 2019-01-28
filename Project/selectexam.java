import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class selectexam extends JFrame implements ActionListener
{
	Connection con;
	Statement stmt;
	ResultSet rs;
		
		String papers[]={"C","C++","JAVA","HTML"};
		JComboBox cb=new JComboBox(papers);
		JLabel l1,l2;
		JButton b1,b2;
	public selectexam()
	{	
	setLayout(null);
		l1=new JLabel("SELECT EXAM");
		l2=new JLabel("Paper Name:");
		b1=new JButton("SELECT");
		b2=new JButton("EXIT");
		l1.setBounds(140,80,400,100);
		l2.setBounds(140,180,200,50);
		b1.setBounds(120,260,180,50);
		b2.setBounds(330,260,180,50);
		cb.setBounds(300,189,150,30);
		
		l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,48));
		l2.setFont(new Font("Courier New",Font.BOLD,20));
		
		add(l1);
		add(l2);
		add(b1);
		add(b2);
		add(cb);
		setSize(650,400);
	setVisible(true);
	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from regist");
			
		}
	catch(Exception e)
		{	
			System.out.println(e);
		}
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{}
	}
	public static void main(String args[])
	{
		selectexam ob1=new selectexam();
	
	}
	
}