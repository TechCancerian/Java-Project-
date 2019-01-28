import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.sql.*;
public class report_form extends JFrame implements ActionListener
{
JLabel l1;
JButton b1;
JTextField t1;
Connection con;
Statement stmt;
ResultSet rs;
int a,x=0,c=0,i=0;
 
report_form()
  {
//  super(s);
           setLayout(null);
		   setLocationRelativeTo(null);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setVisible(true);
  // Get the container and set the background
 getContentPane().setBackground(Color.orange);
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            stmt=con.createStatement();
   			}
	
			catch(ClassNotFoundException e)
			{
			System.out.println(e.getMessage());
			}
			catch(SQLException se)
             {
			 System.out.println(se.getMessage());
			}
			
			System.out.println("OK");
			
l1 =new JLabel("Roll No : ");
t1=new JTextField(50);
b1=new JButton("Search");

l1.setBounds(50,50,200,40);
t1.setBounds(180,50,150,40);
b1.setBounds(150,140,100,40);

add(l1);
add(t1);
add(b1);
l1.setFont(new Font("Courier New",Font.BOLD,22));
setSize(400,300);
setVisible(true);

b1.addActionListener(this);

}

public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
      {
         
              a=Integer.parseInt(t1.getText());  
             
             table_report ob= new table_report(a);
 
           

         }    
 
       }
	   public static void main(String args[])
	{
		report_form ob1=new report_form();

	}

    }