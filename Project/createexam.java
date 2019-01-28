import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class createexam extends JFrame 
{
	public createexam()
	{
	setLayout(null);
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4,b5;
	JTextField t2,t3,t4;
	
	t2=new JTextField(20);
	t3=new JTextField(20);
	t4=new JTextField(20);
	l1=new JLabel("CREATE EXAM");
	l2=new JLabel("Paper Name:");
	l3=new JLabel("Paper ID:");
	l4=new JLabel("Search:");
	b1=new JButton(" ADD RECORD ");
	b2=new JButton(" SAVE RECORD ");
	b3=new JButton(" DELETE RECORD ");
	b4=new JButton(" UPDATE RECORD ");
	b5=new JButton(" EXIT ");
	
	t2.setBounds(250,200,140,30);
	t3.setBounds(240,250,150,30);
	t4.setBounds(220,440,170,30);
	l1.setBounds(90,70,500,100);
	l2.setBounds(115,190,200,50);
	l3.setBounds(115,240,200,50);
	b1.setBounds(150,310,220,50);
	b2.setBounds(150,370,220,50);
	l4.setBounds(120,430,220,50);
	b3.setBounds(150,490,220,50);
	b4.setBounds(150,550,220,50);
	b5.setBounds(150,610,220,50);
	
	l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,50));
	l2.setFont(new Font("Courier New",Font.BOLD,20));
	l3.setFont(new Font("Courier New",Font.BOLD,20));
	l4.setFont(new Font("Courier New",Font.BOLD,20));
	
	add(t2);
	add(t3);
	add(t4);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	
	setSize(500,750);
	setVisible(true);
	}

public static void main(String args[])
	{
		createexam ob1=new createexam();
		
	}
}	