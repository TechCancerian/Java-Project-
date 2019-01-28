import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class createpaper extends JFrame  implements ActionListener 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String p,b,s11,s1,u,td;
	String y[]={""};
	JComboBox cb;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JTextField t2,t3;
	
	public createpaper()
	{}
	public createpaper(String s)
	{
		setLayout(null);
		cb=new JComboBox(y);
		td=s;	
	
	System.out.println(s);
	
	
	
	
	l1=new JLabel("CREATE PAPER");
	l3=new JLabel("Paper Name:");
	b1=new JButton(" CREATE ");
	
	
	cb.setBounds(240,260,150,30);
	l1.setBounds(90,70,500,100);
	
	l3.setBounds(115,250,200,50);
	
	b1.setBounds(150,330,220,50);
	
	
	l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,50));
	
	l3.setFont(new Font("Courier New",Font.BOLD,20));
	
	
	
	add(cb);
	add(l1);
	
	add(l3);
	
	add(b1);
	
	
	setSize(500,750);
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
			
		try	{
				
				s11="select * from tablelist where Department='"+s+"'";
				System.out.println(s11);
				rs=stmt.executeQuery(s11);
				while(rs.next())
				{
				   String a=rs.getString("Paper_Name");	
				   String b=rs.getString("Department");	
				   
					System.out.println("value of a : "+ a);
					System.out.println("value of b : "+ b);
					
					//t2.setText(a);
					cb.addItem(a);
				
				}
			}
		catch(Exception e3)
			{	
				System.out.println(e3);
			}
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)//create
		{
			//p=t2.getText();
			//b=t3.getText();
			u=cb.getSelectedItem().toString();		
			
			try
			{
				
				/*String ss1;
				ss1="insert into tablelist values('"+u+"','"+td+"')";
				stmt.executeUpdate(ss1);
				*/
				s1="create table "+u+" ("+"Ques VARCHAR(100),Ans1 VARCHAR(100),Ans2 VARCHAR(100),Ans3 VARCHAR(100),Ans4 VARCHAR(100),Rans INTEGER,Active INTEGER)";
				
				stmt.executeUpdate(s1);
				System.out.println("but1");
				JOptionPane.showMessageDialog(this,"PAPER CREATED","Info",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(SQLException ee)
			{
				System.out.println(ee.getMessage());
			}
			papermanip ob1=new papermanip(u);
		}
		
	}
public static void main(String args[])
	{
		createpaper ob1=new createpaper();
		
	}
}	