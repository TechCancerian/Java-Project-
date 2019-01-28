import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import java.util.*;
import java.text.*;
public class login extends JFrame implements ActionListener
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	int sch1,sch6;
	String sch2,sch3,sch4,sch5,s2,s3,dt_cmp,dt_get;
	JLabel l1,l2,l3,l4;
	JPasswordField p;
	JTextField t1;
	JRadioButton b1,b2,b3;
	ButtonGroup bg=new ButtonGroup();
	JButton b4,b5;
	String u,pas,td;
	int cad=0;
	DateFormat date_cmp=new SimpleDateFormat("dd-MM-yy");
	DateFormat date_get=new SimpleDateFormat("h:mm:ss");
	
	public login()
	{
		setLayout(null);
		l1=new JLabel(" LOGIN ");
		l2=new JLabel("USERNAME");
		l3=new JLabel("PASSWORD");
		l4=new JLabel("");
		t1=new JTextField(30);
		p=new JPasswordField(30);
		b1=new JRadioButton("Student");
		b2=new JRadioButton("Admin");
		b3=new JRadioButton("Teacher");
		b4=new JButton("LOGIN");
		b5=new JButton("RESET");
		
		l1.setBounds(110,40,240,50);
		l2.setBounds(100,100,100,40);
		t1.setBounds(220,105,135,30);
		l3.setBounds(100,160,100,40);
		p.setBounds(220,166,135,30);
		b1.setBounds(100,220,85,30);
		b2.setBounds(190,220,75,30);
		b3.setBounds(268,220,85,30);
		b4.setBounds(100,270,105,40);
		b5.setBounds(250,270,105,40);
		l4.setBounds(100,300,200,50);

		setBackground(Color.white);
		l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,44));
		l2.setFont(new Font("Courier New",Font.BOLD,20));
		l3.setFont(new Font("Courier New",Font.BOLD,20));
		b1.setFont(new Font("Courier New",Font.BOLD,13));
		b2.setFont(new Font("Courier New",Font.BOLD,13));
		b3.setFont(new Font("Courier New",Font.BOLD,13));
		
		
		l1.setForeground(Color.red);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.blue);
		
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		add(l1);
		add(t1);
		add(l2);
		add(p);
		add(l3);
		add(l4);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		setSize(450,400);
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
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{cad=1;}
		else if(e.getSource()==b2)
		{cad=2;}
		else if(e.getSource()==b3)
		{cad=3;}
		else if(e.getSource()==b4)
		{
			u=t1.getText();
			pas=p.getText();
			System.out.println(u);
			System.out.println(pas);
			if(cad==1)
			{
				try
				{
					String ss="select * from regist where RollNo='"+u+"' and Password='"+pas+"'";
					rs=stmt.executeQuery(ss);
					if (rs.next())
					{
								System.out.println("ok");
							   String q="SELECT * FROM schedule WHERE Roll="+u+"";
							   System.out.println(q);
							   rs= stmt.executeQuery(q);
							   
							   while(rs.next())
							   {
									System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getInt(6));
									   
									sch1=rs.getInt(1);
									sch2=rs.getString(2);
									sch3=rs.getString(3);
									
									sch5=rs.getString(5);//exam date
									sch6=rs.getInt(6);
									  System.out.println(sch6);
									 
									 Calendar cal=Calendar.getInstance();
									 dt_cmp=date_cmp.format(cal.getTime());
									 dt_get=date_get.format(cal.getTime());
									 s2=String.valueOf(dt_cmp);
									 s3=String.valueOf(dt_get);//start time
									 System.out.println(s2);
									 System.out.println(s3);
									 
									
									 if(sch5.equals(s2))
									 {
										 
											   sch4=rs.getString("Exam_Name");
											   
											   if(sch6==1)
											   {
											   mst ob1=new mst(sch1,sch2,sch3,sch4,sch5,s3);
											   }
											   else
											   {
											   JOptionPane.showMessageDialog(null,"You have already Attempted Test","Information",JOptionPane.INFORMATION_MESSAGE);
											   }
											   
											  
											   System.out.println("--------------\n"+sch1+"\n "+sch2+"\n "+sch3+"\n "+sch4+"\n "+sch5+"\\\\\\\\");
											  
									  
									} 
									else
									{
										l4.setText("You dont have exam today");
									}
									
									
							   }
							  
						   
					}
					else
					{l4.setText("wrong username or password");}
				}
				catch(SQLException ee)
				{
					
				}
			}
			else if(cad==2)
			{
				try
				{
					String ss="select * from admin where Username='"+u+"' and Password='"+pas+"'";
					rs=stmt.executeQuery(ss);
					if (rs.next())
					{
						admin ob1=new admin();
						System.out.println("admin logged in");
					}
					else
					{l4.setText("wrong username or password");}
				}
				catch(SQLException ee)
				{
					
				}
			}
			else if(cad==3)
			{
				try
				{
					
					String ss="select * from teacherregst where UserID='"+u+"' and Password='"+pas+"'";
					rs=stmt.executeQuery(ss);
					
					if (rs.next())
					{
						
						td=rs.getString("Department");
						System.out.println(td);
						
						
						teacher ob1=new teacher(td);
					}
					else
					{l4.setText("wrong username or password");}
				}
				catch(SQLException ee)
				{
					
				}
			}
		}
		else if(e.getSource()==b5)
		{
			bg.clearSelection();
			t1.setText("");
			p.setText("");
		}	
		
	}
	public static void main(String args[])
	{
		
	}
	
}