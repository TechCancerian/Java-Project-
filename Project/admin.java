import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class admin extends JFrame implements ActionListener 
{
	JLabel l1;
	JButton b1,b2,b3,b4,b5;
	public admin()
	{
	setLayout(null);
	
	
	
	l1=new JLabel("ADMIN");

	b1=new JButton("STUDENT REGISTRATION");
	b2=new JButton("TEACHER REGISTRATION");
	b3=new JButton("ABC");
	b4=new JButton("XYZ");
	b5=new JButton("LOGOUT");
	
	
	l1.setBounds(135,80,200,100);
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
			studentregist ob1=new studentregist();
		}
		else if(e.getSource()==b2)
		{
			teacherregist ob1=new teacherregist();
		}
	}
	public static void main(String args[])
	{
		admin ob1=new admin();
		
	}
	
}