import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class studentregist extends JFrame implements ActionListener
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String u,n,r,b,p,bat,a,c,pas,s;
	String branch[]={"CSE","ECE","MEC","ELE"};
	JComboBox cb=new JComboBox(branch);
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t2,t3,t5,t6,t7,t8,t9;
	JPasswordField pwd;
	JButton b1,b2,b3,b4,b5,b6;
	int flag=0,flag1=0;
	
	public studentregist()
	{
	setLayout(null);
	getContentPane().setBackground(Color.pink);
	
	pwd=new JPasswordField(20);
	l1=new JLabel("STUDENT REGISTRATION");
	l2=new JLabel("NAME:");
	l3=new JLabel("ROLL NO:");
	l4=new JLabel("BRANCH:");
	l5=new JLabel("PASSWORD:");
	l6=new JLabel("PHONE:");
	l7=new JLabel("BATCH:");
	l8=new JLabel("ADDRESS:");
	l9=new JLabel("ROLL NO:");
	l10=new JLabel("");
	b6=new JButton("SEARCH:");
	t2=new JTextField(20);
	t3=new JTextField(20);

	//t5=new TextField(20);
	t6=new JTextField(20);
	t7=new JTextField(20);
	t8=new JTextField(20);
	t9=new JTextField(20);
	b1=new JButton(" CLEAR ");
	b2=new JButton(" SAVE RECORD ");
	b3=new JButton(" DELETE RECORD ");
	b4=new JButton(" UPDATE RECORD ");
	b5=new JButton(" EXIT ");
	
	pwd.setBounds(220,460,200,30);
	l1.setBounds(210,100,700,100);
	l2.setBounds(100,300,100,50);
	l3.setBounds(100,350,100,50);
	l4.setBounds(100,400,100,50);
	l5.setBounds(100,450,150,50);
	l6.setBounds(100,500,100,50);
	l7.setBounds(100,550,100,50);
	l8.setBounds(100,600,100,50);
	l9.setBounds(600,385,100,40);
	l10.setBounds(600,680,200,50);
	b6.setBounds(600,430,220,50);
	t2.setBounds(220,310,200,30);
	t3.setBounds(220,360,200,30);
	cb.setBounds(220,410,200,30);
	//t5.setBounds(220,460,200,30);
	t6.setBounds(220,510,200,30);
	t7.setBounds(220,560,200,30);
	t8.setBounds(220,610,200,30);
	t9.setBounds(700,390,120,30);
	b1.setBounds(600,270,220,50);
	b2.setBounds(600,330,220,50);
	b3.setBounds(600,490,220,50);
	b4.setBounds(600,550,220,50);
	b5.setBounds(600,610,220,50);
	
	
	l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,54));
	l2.setFont(new Font("Courier New",Font.BOLD,20));
	l3.setFont(new Font("Courier New",Font.BOLD,20));
	l4.setFont(new Font("Courier New",Font.BOLD,20));
	l5.setFont(new Font("Courier New",Font.BOLD,20));
	l6.setFont(new Font("Courier New",Font.BOLD,20));
	l7.setFont(new Font("Courier New",Font.BOLD,20));
	l8.setFont(new Font("Courier New",Font.BOLD,20));
	l9.setFont(new Font("Courier New",Font.BOLD,20));
	//b6.setFont(new Font("Courier New",Font.BOLD,20));
	
	add(l1);	
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(l7);
	add(l8);
	add(l9);
	add(l10);
	add(b6);
	add(t2);
	add(t3);
	add(cb);
	add(pwd);
	add(t6);
	add(t7);
	add(t8);
	add(t9);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	
	setSize(1000,1200);
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
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)//clear
		{
			t2.setText("");
			t3.setText("");
			cb.setSelectedItem("CSE");
			pwd.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
		}
		else if(e.getSource()==b2)//add record
		{
			n=t2.getText();
			r=t3.getText();
			
			c=cb.getSelectedItem().toString();
			pas=pwd.getText();
			p=t6.getText();
			bat=t7.getText();
			a=t8.getText();
			try
			{
			
				if(n.equals(""))
				{
					System.out.println("No Name");
					JOptionPane.showMessageDialog(this,"Name not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(r.equals(""))
				{
					System.out.println("No RollNo");
					JOptionPane.showMessageDialog(this,"Roll No not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(cb.getSelectedItem().toString().equals(""))
				{
					System.out.println("No Branch");
					JOptionPane.showMessageDialog(this,"Branch not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(pas.equals(""))
				{
					System.out.println("No Password");
					JOptionPane.showMessageDialog(this,"Password not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(p.equals(""))
				{
					System.out.println("No PhoneNo");
					JOptionPane.showMessageDialog(this,"PhoneNo not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(bat.equals(""))
				{
					System.out.println("No Batch");
					JOptionPane.showMessageDialog(this,"Batch not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}else if(a.equals(""))
				{
					System.out.println("No Address");
					JOptionPane.showMessageDialog(this,"Address not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}	
				else{flag1=1;}
				
				if(flag1==1)		
				{	String ss1;
					ss1="insert into regist values('"+n+"','"+r+"','"+c+"','"+pas+"','"+p+"','"+bat+"','"+a+"')";
					stmt.executeUpdate(ss1);
					
				System.out.println(n);
				System.out.println(r);
				System.out.println(c);
				System.out.println(pas);
				System.out.println(p);
				System.out.println(bat);
				System.out.println(a);
				
				}
			}
			catch(SQLException ee)
			{
				System.out.println(ee.getMessage());
			}
			
		}
		else if(e.getSource()==b6)//search
		{
			flag=1;
			u=t9.getText();
			System.out.println(u);
			try
				{
					if(u.equals(""))
					{
						System.out.println("No RollNo");
						JOptionPane.showMessageDialog(this,"Roll No not Entered for Search!","Info",JOptionPane.INFORMATION_MESSAGE);
						flag1=0;
					}
					else{flag1=1;}
				
					if(flag1==1)
					{
						String ss="select * from regist where RollNo='"+u+"'";
						rs=stmt.executeQuery(ss);
						if (rs.next())
						{
							n=rs.getString("Name");
							r=rs.getString("RollNo");
							c=rs.getString("Branch");
							pas=rs.getString("Password");
							p=rs.getString("Phone");
							bat=rs.getString("Batch");
							a=rs.getString("Address");
							
				
							t2.setText(n);
							t3.setText(r);
							cb.setSelectedItem(c);
							pwd.setText(pas);
							t6.setText(p);
							t7.setText(bat);
							t8.setText(a);
						}
						else
						{l10.setText("Wrong RollNo.......");
					}
				}
				}
			catch(Exception e2)
			{
				System.out.println(e2);
			}			
		}
		else if(e.getSource()==b3)//delete
		{
			try
				{
					String ss="select * from regist where RollNo='"+u+"'";
					rs=stmt.executeQuery(ss);
					if (rs.next())
					{
						if(flag==1)
						{u=t9.getText();
						 s="delete from regist where RollNo='"+u+"'";
						 stmt.executeUpdate(s);
						 t2.setText("");
						t3.setText("");
						cb.setSelectedItem("");
						pwd.setText("");
						t6.setText("");
						t7.setText("");
						t8.setText("");
						}
						else
						{}
					}
					else
					{}
				}
			catch(Exception e3)
				{
					System.out.println(e3);
				}
		}
		else if(e.getSource()==b4)//update
		{
			try
				{
					u=t9.getText();
					n=t2.getText();
					r=t3.getText();
					c=cb.getSelectedItem().toString();
					pas=pwd.getText();
					p=t6.getText();
					bat=t7.getText();
					a=t8.getText();
					
					s="update regist set Name='"+n+"',RollNo='"+r+"',Branch='"+c+"',Password='"+pas+"',Phone='"+p+"',Batch='"+bat+"',Address='"+a+"' where RollNo='"+u+"'";
					System.out.println(s);
					stmt.executeUpdate(s);
				
					System.out.println(n);
					System.out.println(r);
					System.out.println(c);
					System.out.println(pas);
					System.out.println(p);
					System.out.println(bat);
					System.out.println(a);
				}
			catch(Exception e4)
				{
					System.out.println(e4);
				}
		}
		else if(e.getSource()==b5)//exit
		{System.exit(0);}
	}
		
	public static void main(String args[])
	{
		studentregist ob1=new studentregist();
	
	}
	
}