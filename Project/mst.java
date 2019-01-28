import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.*;
import java.util.*;

public class mst extends JFrame implements ActionListener 
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	int sch1,tq=10;
	String sch2,sch3,sch4,sch5,s3,s4,dt_get,rm;
	
	int x,i,q,j,p;
	int cnt=0,rec=0;
	int rans1=0,wans1=0;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JRadioButton b1,b2,b3,b4;
	JButton b5,b6,b7,b8;
	ButtonGroup bg=new ButtonGroup();
	String  ques[]=new String[10];
	String  ans1[]=new String[10];
	String  ans2[]=new String[10];
	String  ans3[]=new String[10];
	String  ans4[]=new String[10];
	int rans[]=new int [10];
	int tempans[]=new int [10];
	
	ArrayList<Integer>list = new ArrayList<Integer>(); 
	DateFormat date_get=new SimpleDateFormat("h:mm:ss");
	
	mst()
	  {
	   
	  }
	public mst(int sch1,String sch2,String sch3,String sch4,String sch5,String s3 )
	{

	setLayout(null);
	setTitle("Exam");
			this.sch1=sch1;
	        this.sch2=sch2;
	         this.sch3=sch3;
	         this.sch4=sch4;
	         this.sch5=sch5;
	         this.s3=s3;
	
	b1=new JRadioButton("");
	b2=new JRadioButton("");
	b3=new JRadioButton("");
	b4=new JRadioButton("");
	b5=new JButton("NEXT");
	b6=new JButton("PREVIOUS");
	b7=new JButton("FINISH");
	b8=new JButton("YES");
	
	l1=new JLabel("MULTIPLE CHOICE QUESTIONS");
	//l2=new JLabel("Date:");
	//l3=new JLabel("Name:");
	l4=new JLabel("Roll No:");
	l5=new JLabel("Time:");
	//l6=new JLabel("Day:");
	l7=new JLabel("Branch:");
	l8=new JLabel("Semester:");
	
	//l9=new JLabel("4/7/18");
	//l10=new JLabel("Jasdeep");
	l11=new JLabel("101706080");
	l12=new JLabel("12:30");
	//l13=new JLabel("Tuesday");
	l14=new JLabel("ECE");
	l15=new JLabel("2");
	l16=new JLabel("");
	l17=new JLabel("");
	l18=new JLabel("");
	l19=new JLabel("");
	l20=new JLabel("");
	
	
	bg.add(b1);
	bg.add(b2);
	bg.add(b3);
	bg.add(b4);
	
	l1.setBounds(500,150,700,50);
	
	//l2.setBounds(1500,90,60,50);
	//l3.setBounds(1500,140,60,50);
	l4.setBounds(1500,190,90,50);
	l5.setBounds(1500,240,60,50);
	//l6.setBounds(1500,290,60,50);
	l7.setBounds(1500,290,60,50);
	l8.setBounds(1500,340,75,50);
	
	//l9.setBounds(1575,90,60,50);
	//l10.setBounds(1575,140,60,50);
	l11.setBounds(1575,190,80,50);
	l12.setBounds(1575,240,60,50);
	//l13.setBounds(1575,290,60,50);
	l14.setBounds(1575,290,60,50);
	l15.setBounds(1575,340,60,50);
	
	l18.setBounds(170,300,30,50);
	l16.setBounds(200,300,1200,50);
	b1.setBounds(230,360,300,30);
	b2.setBounds(230,400,300,30);
	b3.setBounds(230,440,300,30);
	b4.setBounds(230,480,300,30);
	b5.setBounds(400,540,110,40);
	b6.setBounds(270,540,100,40);
	b7.setBounds(540,540,100,40);
	
	
	l17.setBounds(270,650,200,50);
	l19.setBounds(1300,650,400,50);
	l20.setBounds(1300,700,400,50);
	
	
	l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,44));
	l16.setFont(new Font("Courier New",Font.BOLD,22));
	//l2.setFont(new Font("Courier New",Font.BOLD,14));
	//l3.setFont(new Font("Courier New",Font.BOLD,14));
	l4.setFont(new Font("Courier New",Font.BOLD,14));
	l5.setFont(new Font("Courier New",Font.BOLD,14));
	//l6.setFont(new Font("Courier New",Font.BOLD,14));
	l7.setFont(new Font("Courier New",Font.BOLD,14));
	l8.setFont(new Font("Courier New",Font.BOLD,14));
	
	add(l1);
	//add(l2);
	//add(l3);
	add(l4);
	add(l5);
	//add(l6);
	add(l7);
	add(l8);
//	add(l9);
	//add(l10);
	add(l11);
	add(l12);
	//add(l13);
	add(l14);
	add(l15);
	add(l16);
	add(l17);
	add(l18);
	add(l19);
	add(l20);
	
	
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(b7);
	
	setSize(2000,1100);
	setVisible(true);
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
		stmt=con.createStatement();
		/*rs=stmt.executeQuery("select * from paperm");
		while(rs.next())
			{
			ques[cnt]=rs.getString("Ques");
			ans1[cnt]=rs.getString("Ans1");
			ans2[cnt]=rs.getString("Ans2");
			ans3[cnt]=rs.getString("Ans3");
			ans4[cnt]=rs.getString("Ans4");
			rans[cnt]=rs.getInt("Rans");
			cnt++;
			}	
			cnt--;
			*/
	}
	
	catch(Exception e)
		{
			System.out.println(e);
		}
		
			System.out.println("OK");
			
			list = new ArrayList<Integer>();
		
	         for(q=1;q<=20;q++)
		      { 
				list.add(new Integer(q));
		      }
		   
			Collections.shuffle(list);
			String d="";
			int k;
			
			for( j=0;j<10;j++)
			{
				 k=list.get(j);
				 
				 if(j<9)
				 d=d+k+",";
				 else if(j==9)
				 d=d+k;
				
			}
			System.out.println("qe:"+d);
		


	try
			{
			
			String s="SELECT * FROM "+sch4+" WHERE Ques_No in("+d+")";
		
			System.out.println(s);
			rs= stmt.executeQuery(s);
			
			while(rs.next())
			{
			//System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
			
			ques[cnt]=rs.getString("Ques");
			ans1[cnt]=rs.getString("Ans1");
			ans2[cnt]=rs.getString("Ans2");
			ans3[cnt]=rs.getString("Ans3");
			ans4[cnt]=rs.getString("Ans4");
			rans[cnt]=rs.getInt("Rans");
			cnt++;
			}	
			cnt--;
			
			}
	catch(Exception e6)
		{
			System.out.println(e6);
		}
			
	l18.setText("Q"+(rec+1));	
	l16.setText(ques[0]);
	b1.setText(ans1[0]);
	b2.setText(ans2[0]);
	b3.setText(ans3[0]);
	b4.setText(ans4[0]);
	
		l11.setText(String.valueOf(sch1));
	   l14.setText(sch2);
	   l15.setText(sch3);
	   l12.setText(s3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			tempans[rec]=1;
		}
		else if(e.getSource()==b2)
		{
			tempans[rec]=2;
		}
		else if(e.getSource()==b3)
		{
			tempans[rec]=3;
		}
		else if(e.getSource()==b4)
		{
			tempans[rec]=4;
		}
		else if(e.getSource()==b5)
		{
			l17.setText("");
			if(rec<cnt)
			{
				bg.clearSelection();
				++rec;
				l18.setText("Q"+(rec+1));
				l16.setText(ques[rec]);
				b1.setText(ans1[rec]);
				b2.setText(ans2[rec]);
				b3.setText(ans3[rec]);
				b4.setText(ans4[rec]);
				
			}
			else
			{
				l17.setText("Last question reached");
				
			}
			
		}
		else if(e.getSource()==b6)
		{
			l17.setText("");
			if(rec>0)
			{
				--rec;
				l18.setText("Q"+(rec+1));
				l16.setText(ques[rec]);
				b1.setText(ans1[rec]);
				b2.setText(ans2[rec]);
				b3.setText(ans3[rec]);
				b4.setText(ans4[rec]);
				
				
			}
			else
			{
				l17.setText("First question reached");
				
			}
		}
		else if(e.getSource()==b7)
		{
	
				System.out.println("*****"+sch1+" "+sch2+" "+sch3+" "+sch4+" "+sch5+" "+s3);
		        Calendar cal=Calendar.getInstance();
                dt_get=date_get.format(cal.getTime());
                s4=String.valueOf(dt_get);//finish time
				System.out.println(s4);
				
			for(int i=0;i<=cnt;i++)
			{
				if(rans[i]==tempans[i])
				{rans1++;}
				else
				{wans1++;}
			}
			l19.setText("Total Right Answer="+(rans1));
			l20.setText("Total Wrong Answer="+(wans1));
			System.out.println(rans1+"\n"+wans1);
			 if(rans1<=3)
              rm="D Grade";
              else if(rans1>3 && rans1<=5)
              rm="C Grade";
              else if(rans1>5 && rans1<=7)
              rm="B Grade";
               else if(rans1>7 && rans1<10)
              rm="A Grade";			   
		  System.out.println(rm);
	   try
			{
				String sql="INSERT INTO report VALUES("+sch1+",'"+sch2+"','"+sch3+"','"+sch4+"','"+sch5+"','"+s3+"','"+s4+"','"+tq+"','"+rans1+"','"+wans1+"','"+rans1+"','"+rm+"')";
				System.out.println(sql);
				stmt.executeUpdate(sql); 
				 
				String sql1="UPDATE  schedule SET Active=0 WHERE Roll="+sch1+" && Exam_Date='"+sch5+"'";
				System.out.println(sql1);
				stmt.executeUpdate(sql1); 
			}
					
	   catch(Exception se)
			{
				
				System.out.println(se);
			}
		}
		
	}
		
	public static void main(String args[])
	{
		mst ob1=new mst();
	}
}