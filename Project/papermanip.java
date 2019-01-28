import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class papermanip extends JFrame  implements ActionListener 
{

	Connection con;
	Statement stmt;
	ResultSet rs;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t2,t3,t4,t5,t6,t7,t8,t9,t10;
	String q,a1,a2,a3,a4,ra,u,a;
	JButton b1;
	public papermanip()
	{}	
	public papermanip(String s)
	{u=s;
	System.out.println(s);	
	//setLayout(new FlowLayout());
	//setContentPane(new JLabel(new ImageIcon("C:\\Users\\Mandeep\\Downloads\\th.jpg")));
	setLayout(null);
	
	
	
	
	l1=new JLabel("PAPER MANIPULATION");
	l2=new JLabel("Paper Name:");
	l3=new JLabel("Made By:");
	l4=new JLabel("Question:");
	l5=new JLabel("Ans1-");
	l6=new JLabel("Ans2-");
	l7=new JLabel("Ans3-");
	l8=new JLabel("Ans4-");
	l9=new JLabel("Right Ans:");
	l10=new JLabel("Active:");
	t2=new JTextField(20);
	t3=new JTextField(20);
	t4=new JTextField(100);
	t5=new JTextField(30);
	t6=new JTextField(30);
	t7=new JTextField(30);
	t8=new JTextField(30);
	t9=new JTextField(30);
	t10=new JTextField(30);
	b1=new JButton(" SAVE ");
	
	l1.setBounds(250,100,700,100);
	l2.setBounds(100,250,140,50);
	l3.setBounds(100,300,100,50);
	l4.setBounds(100,400,150,50);
	l5.setBounds(100,450,100,50);
	l6.setBounds(100,500,100,50);
	l7.setBounds(100,550,100,50);
	l8.setBounds(100,600,100,50);
	l9.setBounds(100,650,170,50);
	l10.setBounds(100,700,170,50);
	t2.setBounds(230,260,200,30);
	t3.setBounds(230,310,200,30);
	t4.setBounds(230,410,700,30);
	t5.setBounds(230,460,300,30);
	t6.setBounds(230,510,300,30);
	t7.setBounds(230,560,300,30);
	t8.setBounds(230,610,300,30);
	t9.setBounds(230,660,300,30);
	t10.setBounds(230,710,300,30);
	b1.setBounds(240,750,150,50);
	
	l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,54));
	l2.setFont(new Font("Courier New",Font.BOLD,20));
	l3.setFont(new Font("Courier New",Font.BOLD,20));
	l4.setFont(new Font("Courier New",Font.BOLD,20));
	l5.setFont(new Font("Courier New",Font.BOLD,20));
	l6.setFont(new Font("Courier New",Font.BOLD,20));
	l7.setFont(new Font("Courier New",Font.BOLD,20));
	l8.setFont(new Font("Courier New",Font.BOLD,20));
	l9.setFont(new Font("Courier New",Font.BOLD,20));
	
	l1.setForeground(Color.green);
	
	add(l1);	
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(l7);
	add(l8);
	add(l9);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
	add(t6);
	add(t7);
	add(t8);
	add(t9);
	add(t10);
	add(b1);
	
	t2.setText(s);
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
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			
			q=t4.getText();
			a1=t5.getText();
			a2=t6.getText();
			a3=t7.getText();
			a4=t8.getText();
			ra=t9.getText();
			a=t10.getText();
			try
			{
				String ss1;
				ss1="insert into  "+u+" values('"+q+"','"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+ra+"','"+a+"')";
				System.out.println(ss1);
				stmt.executeUpdate(ss1);
				
			System.out.println(q);
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			System.out.println(ra);
			
			}
			catch(SQLException ee)
			{
				System.out.println(ee.getMessage());
			}
		}
	}
	public static void main(String args[])
	{
		papermanip ob1=new papermanip();

	}
	
}