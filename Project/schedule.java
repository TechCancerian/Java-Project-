import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class schedule extends JFrame 
{
	
	String p,b,s11,s1,u,td;
	JComboBox cb;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	
	JTextField t2,t3,t5,t4,t6,t7,t8;
	JButton b1,b2,b3,b4,b5,b6;
	
	public schedule()
	{
		setLayout(null);
	getContentPane().setBackground(Color.orange);
	l1=new JLabel("SCHEDULE");
	l2=new JLabel("ROLL NO:");
	l3=new JLabel("BRANCH:");
	l4=new JLabel("SEMESTER:");
	l5=new JLabel("EXAM NAME:");
	l6=new JLabel("EXAM DATE:");
	l7=new JLabel("ACTIVE:");
	
	t2=new JTextField(20);
	t3=new JTextField(20);
	t4=new JTextField(20);
	t5=new JTextField(20);
	t6=new JTextField(20);
	t7=new JTextField(20);
	t8=new JTextField(20);
	b1=new JButton(" ADD RECORD ");
	b2=new JButton(" SAVE RECORD ");
	b3=new JButton(" DELETE RECORD ");
	b4=new JButton(" UPDATE RECORD ");
	b5=new JButton(" EXIT ");
	b6=new JButton(" SEARCH ");
	
	l1.setBounds(360,70,700,100);
	l2.setBounds(100,200,140,60);
	l3.setBounds(100,260,140,60);
	l4.setBounds(100,320,140,60);
	l5.setBounds(100,380,140,60);
	l6.setBounds(100,440,140,60);
	l7.setBounds(100,500,140,60);
	
	t2.setBounds(240,210,200,40);
	t3.setBounds(240,270,200,40);
	t4.setBounds(240,330,200,40);
	t5.setBounds(240,390,200,40);
	t6.setBounds(240,450,200,40);
	t7.setBounds(240,510,200,40);
	
	b1.setBounds(600,190,220,50);
	b2.setBounds(600,250,220,50);
	t8.setBounds(600,306,220,38);
	b3.setBounds(600,410,220,50);
	b4.setBounds(600,470,220,50);
	b5.setBounds(600,530,220,50);
	b6.setBounds(600,350,220,50);
	
	l1.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,60));
	l2.setFont(new Font("Courier New",Font.BOLD,20));
	l3.setFont(new Font("Courier New",Font.BOLD,20));
	l4.setFont(new Font("Courier New",Font.BOLD,20));
	l5.setFont(new Font("Courier New",Font.BOLD,20));
	l6.setFont(new Font("Courier New",Font.BOLD,20));
	l7.setFont(new Font("Courier New",Font.BOLD,20));
	
	add(l1);	
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(l7);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
	add(t6);
	add(t7);
	add(t8);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	
	setSize(1000,750);
	setVisible(true);
	}
	public static void main(String args[])
	{
		schedule ob1=new schedule();
	
	}
	
}