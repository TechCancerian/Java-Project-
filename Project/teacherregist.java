import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class teacherregist extends JFrame implements ActionListener 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String dept[]={"CSE","ECE","MEC","ELE"};
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField t2,t3,t4,t5,t6,t7,t8,t9;
	JPasswordField p;
	JButton b1,b2,b3,b4,b5,b6;
	JComboBox cb=new JComboBox(dept);
	String n,dpt,doj,u,user,pas,ph,em,a,s;
	int flag=0,flag1=0; 
	
	public teacherregist()
	{
	setLayout(null);
	getContentPane().setBackground(Color.pink);
	
	l1=new JLabel("TEACHER REGISTRATION");
	p=new JPasswordField(20);
	l2=new JLabel("NAME:");
	l3=new JLabel("DEPARTMENT:");
	l4=new JLabel("DATE OF JOINING:");
	l10=new JLabel("USER ID:");
	l5=new JLabel("PASSWORD:");
	l6=new JLabel("PHONE:");
	l7=new JLabel("EMAIL:");
	l8=new JLabel("ADDRESS:");
	l9=new JLabel("USER ID:");
	t2=new JTextField(20);
	l11=new JLabel("");
	t3=new JTextField(20);
	t4=new JTextField(20);
	//t5=new TextField(20);
	t6=new JTextField(20);
	t7=new JTextField(20);
	t8=new JTextField(20);
	t9=new JTextField(20);
	b1=new JButton(" ADD RECORD ");
	b2=new JButton(" SAVE RECORD ");
	b3=new JButton(" DELETE RECORD ");
	b4=new JButton(" UPDATE RECORD ");
	b5=new JButton(" EXIT ");
	b6=new JButton(" SEARCH ");
	
	p.setBounds(290,510,200,30);
	l1.setBounds(160,100,700,100);
	l2.setBounds(100,300,100,50);
	l3.setBounds(100,350,150,50);
	l4.setBounds(100,400,190,50);
	l10.setBounds(100,450,100,50);
	l5.setBounds(100,500,100,50);
	l6.setBounds(100,550,100,50);
	l7.setBounds(100,600,100,50);
	l8.setBounds(100,650,100,50);
	l9.setBounds(600,410,150,50);
	t2.setBounds(290,310,200,30);
	t3.setBounds(290,410,200,30);
	t4.setBounds(290,460,200,30);
	//t5.setBounds(220,460,200,30);
	t6.setBounds(290,560,200,30);
	t7.setBounds(290,610,200,30);
	t8.setBounds(290,660,200,30);
	t9.setBounds(690,420,130,30);
	b1.setBounds(600,300,220,50);
	b2.setBounds(600,360,220,50);
	b3.setBounds(600,520,220,50);
	b4.setBounds(600,580,220,50);
	b5.setBounds(600,640,220,50);
	b6.setBounds(600,460,220,50);
	cb.setBounds(290,360,200,30);
	l11.setBounds(600,700,100,50);
	
	
	l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,54));
	l2.setFont(new Font("Courier New",Font.BOLD,18));
	l3.setFont(new Font("Courier New",Font.BOLD,18));
	l4.setFont(new Font("Courier New",Font.BOLD,18));
	l5.setFont(new Font("Courier New",Font.BOLD,18));
	l6.setFont(new Font("Courier New",Font.BOLD,18));
	l7.setFont(new Font("Courier New",Font.BOLD,18));
	l8.setFont(new Font("Courier New",Font.BOLD,18));
	l9.setFont(new Font("Courier New",Font.BOLD,18));
	l10.setFont(new Font("Courier New",Font.BOLD,18));
	
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
	add(l11);
	add(t2);
	add(t3);
	add(t4);
	add(p);
	add(t6);
	add(t7);
	add(t8);
	add(t9);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(cb);
	
	setSize(1000,1200);
	setVisible(true);
	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from teacherregst");
			
		}
	catch(Exception e)
		{	
			System.out.println(e);
		}
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t2.setText("");
			t3.setText("");
			t4.setText("");
			cb.setSelectedItem("CSE");
			p.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
		}
		else if(e.getSource()==b2)
		{
			n=t2.getText();
			dpt=cb.getSelectedItem().toString();
			doj=t3.getText();
			user=t4.getText();
			pas=p.getText();
			ph=t6.getText();
			em=t7.getText();
			a=t8.getText();
			try
			{
				if(n.equals(""))
				{
					System.out.println("No Name");
					JOptionPane.showMessageDialog(this,"Name not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(doj.equals(""))
				{
					System.out.println("No Date of Joining");
					JOptionPane.showMessageDialog(this,"Date of Joining No not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(dpt.equals(""))
				{
					System.out.println("No Department");
					JOptionPane.showMessageDialog(this,"Department not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(user.equals(""))
				{
					System.out.println("No Password");
					JOptionPane.showMessageDialog(this,"UserID not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(pas.equals(""))
				{
					System.out.println("No Password");
					JOptionPane.showMessageDialog(this,"Password not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(ph.equals(""))
				{
					System.out.println("No PhoneNo");
					JOptionPane.showMessageDialog(this,"PhoneNo not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}
				else if(em.equals(""))
				{
					System.out.println("No Email");
					JOptionPane.showMessageDialog(this,"Email not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}else if(a.equals(""))
				{
					System.out.println("No Address");
					JOptionPane.showMessageDialog(this,"Address not Entered !","Info",JOptionPane.INFORMATION_MESSAGE);
					flag1=0;
				}	
				else{flag1=1;}
				
				if(flag1==1)		
				{
					String ss1;
					ss1="insert into teacherregst values('"+n+"','"+dpt+"','"+doj+"','"+user+"','"+pas+"','"+ph+"','"+em+"','"+a+"')";
					stmt.executeUpdate(ss1);
						
					System.out.println(n);
					System.out.println(dpt);
					System.out.println(doj);
					System.out.println(user);
					System.out.println(pas);
					System.out.println(ph);
					System.out.println(em);
					System.out.println(a);
				
				}
			}
					catch(SQLException ee)
					{
						System.out.println(ee.getMessage());
					}
			
		}
		else if(e.getSource()==b6)
		{
			flag=1;
			u=t9.getText();
			System.out.println(u);
			try
				{
					if(u.equals(""))
					{
						System.out.println("No UserID");
						JOptionPane.showMessageDialog(this,"UserID not Entered for Search!","Info",JOptionPane.INFORMATION_MESSAGE);
						flag1=0;
					}
					else{flag1=1;}
				
					if(flag1==1)
					{
						l11.setText("");
						String ss="select * from teacherregst where UserID='"+u+"'";
						rs=stmt.executeQuery(ss);
						
						if (rs.next())
						{
							n=rs.getString("Name");
							dpt=rs.getString("Department");
							doj=rs.getString("Date_Of_Joining");
							user=rs.getString("UserID");
							pas=rs.getString("Password");
							ph=rs.getString("Phone_No");
							em=rs.getString("Email");
							a=rs.getString("Address");
							
				
							t2.setText(n);
							t3.setText(doj);
							t4.setText(user);
							cb.setSelectedItem(dpt);
							p.setText(pas);
							t6.setText(ph);
							t7.setText(em);
							t8.setText(a);
						}
						else
						{l11.setText("Wrong User ID.......");}
					}
				}
			catch(Exception e2)
			{
				System.out.println(e2);
			}		
		}
		else if(e.getSource()==b3)
		{
			try
				{
					String ss="select * from teacherregst where UserID='"+u+"'";
					rs=stmt.executeQuery(ss);
					if (rs.next())
					{
						l11.setText("");
						if(flag==1)
						{
							u=t9.getText();
							s="delete from teacherregst where UserID='"+u+"'";
							stmt.executeUpdate(s);
						 
						}
						else
						{}
					}
					else
					{l11.setText("Wrong User ID.......");}
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
					dpt=cb.getSelectedItem().toString();
					doj=t3.getText();
					user=t4.getText();
					pas=p.getText();
					ph=t6.getText();
					em=t7.getText();
					a=t8.getText();
					
					s="update teacherregst set Name='"+n+"',Department='"+dpt+"',Date_Of_Joining='"+doj+"',UserID='"+user+"',Password='"+pas+"',Phone_No='"+ph+"',Email='"+em+"',Address='"+a+"' where UserID='"+u+"'";
					stmt.executeUpdate(s);
					
					System.out.println(n);
					System.out.println(dpt);
					System.out.println(doj);
					System.out.println(user);
					System.out.println(pas);
					System.out.println(ph);
					System.out.println(em);
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
		teacherregist ob1=new teacherregist();
	
	}
	
}