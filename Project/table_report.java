import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.sql.*;

public class table_report extends JFrame 
{

Connection con;
Statement stmt;
ResultSet rs;
int x=0, c=0,i=0;

table_report(int a)
{
         //  setLayout(null);
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
			
     try
	 {
       String sql="SELECT * FROM report WHERE Roll_no="+a+"";
       System.out.println(sql);
       rs = stmt.executeQuery(sql);
	  while(rs.next())
	  {
	   /* System.out.println(rs.getInt(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n"+rs.getString(6)+"\n"+rs.getString(7)+rs.getInt(8)+"\n"+rs.getInt(9)+"\n"+rs.getInt(10)+"\n"+rs.getInt(11)+"\n"+rs.getString(12)+"***********\n");*/
       x++;
	   System.out.println(x);
	  }
	String ar[][]=new String[x][12];
	String column[]={"Roll_No","Branch","Semester","Exam_Name","E_Date","Start_time","End_time","Total_question","Correct","Incorrect","Marks","Remarks"};		 
	String sql1="SELECT * FROM report WHERE Roll_no="+a+"";
    System.out.println(sql1);
	rs= stmt.executeQuery(sql1);
			
	  while(rs.next())
		 { 
			 c=0;
			 
			 ar[i][c]=String.valueOf(rs.getInt(1));
			 c++;
			 ar[i][c]=rs.getString(2);
			 c++;
			 ar[i][c]=rs.getString(3);
			 c++;
			 ar[i][c]=rs.getString(4);
			 c++;
			 ar[i][c]=rs.getString(5);
			 c++;
			 ar[i][c]=rs.getString(6);
			 c++;
			 ar[i][c]=rs.getString(7);
			 c++;
			 ar[i][c]=String.valueOf(rs.getInt(8));
			 c++;
			 ar[i][c]=String.valueOf(rs.getInt(9));
			 c++;
			 ar[i][c]=String.valueOf(rs.getInt(10));
			 c++;
			 ar[i][c]=String.valueOf(rs.getInt(11));
			 c++;
			 ar[i][c]=rs.getString(12);
			 c++;
			 
			 i++;
			  
			 }
		 for(int j=0;j<x;j++)
		 {
		   for(int q=0;q<12;q++)
		   {
				System.out.println(ar[j][q]);       
         }
		 }
		 JTable j1=new JTable(ar,column);
		 j1.setBounds(30,40,600,300);

         JScrollPane sp=new JScrollPane(j1);
         add(sp);
		 
       }
	   
	  
			catch(SQLException se)
             {
			 System.out.println(se.getMessage());
			}
			
       
     setSize(800,600);
     setVisible(true);
    }


}