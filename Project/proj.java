import javax.swing.*;
import java.awt.event.*;


public class proj implements ActionListener
{
	JFrame f;
	JMenuBar mb;
	JMenu exam,admin,teacher;
	JMenuItem demo,mst,result,practicetest,createlogin,modifylogin,deletelogin,createpaper,deletepaper,modifypapaer,teacherreg;
	
	proj()
	{
		f=new JFrame();
		
		/*demo=new JMenuItem("demo");
		mst=new JMenuItem("mst");
		result =new JMenuItem("result");
		practicetest=new JMenuItem("practicetest");
		*/
		createlogin=new JMenuItem("Login");
		result=new JMenuItem("Result");
		modifylogin=new JMenuItem("modifylogin");
		deletelogin=new JMenuItem("deletelogin");
		teacherreg=new JMenuItem("Teacher Registration");
		/*createpaper=new JMenuItem("createpaper");
		deletepaper=new JMenuItem("deletepaper");
		modifypapaer=new JMenuItem("modifypapaer");
		*/
		/*demo.addActionListener(this);
		mst.addActionListener(this);
		result.addActionListener(this);
		practicetest.addActionListener(this);
		*/
		createlogin.addActionListener(this);
		result.addActionListener(this);
		modifylogin.addActionListener(this);
		deletelogin.addActionListener(this);
		teacherreg.addActionListener(this);
		/*createpaper.addActionListener(this);
		deletepaper.addActionListener(this);
		modifypapaer.addActionListener(this);
			*/
		mb=new JMenuBar();
		mb.setBounds(10,10,500,50);

		//exam=new JMenu("Exam");
		admin=new JMenu("Admin");
		teacher=new JMenu("Teacher");
		
		
		/*exam.add(demo);
		exam.add(mst);
		exam.add(result);
		exam.add(practicetest);
		*/
		admin.add(createlogin);
		admin.add(result);
		admin.add(modifylogin);
		admin.add(deletelogin);
		teacher.add(teacherreg);
		/*teacher.add(createpaper);
		teacher.add(modifypapaer);
		teacher.add(deletepaper);
		*/
		//mb.add(exam);
		mb.add(admin);
		mb.add(teacher);
		
		f.add(mb);
		
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		/*if(e.getSource()==demo)
		{}
		else if(e.getSource()==mst)
		{
			mst s=new mst();
		}
		else if(e.getSource()==result)
		{}
		else if(e.getSource()==practicetest)
		{}
		*/
		 if(e.getSource()==createlogin)
		{
			login ob1=new login();
		}
		else if(e.getSource()==result)
		{
			report_form ob1=new report_form();
		}
		else if(e.getSource()==modifylogin)
		{}
		else if(e.getSource()==deletelogin)
		{}
		else if(e.getSource()==teacherreg)
		{
			teacherregist ob1=new teacherregist();
		}
		/*else if(e.getSource()==createpaper)
		{}
		else if(e.getSource()==modifypapaer)
		{}
		else if(e.getSource()==deletepaper)
		{}
		*/
		
	}	
	
	public static void main(String[] args)
	{
		new proj();
	}
}
