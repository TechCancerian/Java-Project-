import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class teacher extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3,b4,b5;
	String td;
	public teacher()
	{
			
	}	
	public teacher(String  s1)
	{
	td=s1;
	System.out.println(td);
	setLayout(null);
	
	
	
	l1=new JLabel("TEACHER");

	b1=new JButton("SELECT EXAM");
	b2=new JButton("CREATE PAPER");
	b3=new JButton("LOCK ROLLNO");
	b4=new JButton("XYZ");
	b5=new JButton("LOGOUT");
	
	
	l1.setBounds(100,80,250,100);
	b1.setBounds(120,200,200,50);
	b2.setBounds(120,260,200,50);
	b3.setBounds(120,320,200,50);
	b4.setBounds(120,380,200,50);
	b5.setBounds(120,440,200,50);
	
	
	
	l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,54));
	
	add(l1);	
	
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	
	setSize(450,600);
	setVisible(true);
	b1.addActionListener(this);
	b2.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			selectexam ob1=new selectexam();
		}
		else if(e.getSource()==b2)
		{
			createpaper ob1=new createpaper(td);
		}
	}
	public static void main(String args[])
	{
		teacher ob1=new teacher();
		
	}
	
}