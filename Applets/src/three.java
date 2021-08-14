import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.xml.stream.util.EventReaderDelegate;

import java.applet.*;
public class three extends Applet implements ActionListener,Runnable {
Label l1,l2,l3,l4,l5,l6,l7,l8;
TextField t1,t2,t3,t4,t5,timer;
Button b1,b2;
CheckboxGroup c,c1;
Checkbox a,b,d,e;
Checkbox f,g,h,i;
int count=0;
int randd=0;
Font u;

ItemEvent e12;
int counter1=0;
String s1,s2; Date d1,d2;
int k=0;
int m=0;
int ho=0;
Thread th;
int st=0;
public void init()
{setBackground(Color.cyan);
	timer=new TextField("");
	timer.setBounds(700,400,100,30);
	add(timer);
   setLayout(null);
   u=new Font("Serif",Font.BOLD,18);
   this.setFont(u);
   l1=new Label("CHOOSE A TYPE");
   l2=new Label("CHOOSE A LEVEL ");
   l3=new Label("QUESTION");
   l4=new Label("ANSWER");
   l5=new Label("Correct answers=0");
   l7=new Label(" ");
  // l8=new Lable("");
   CheckboxGroup c=new CheckboxGroup();
   CheckboxGroup c1=new CheckboxGroup();
   a=new Checkbox("ADDITION",false,c);
   b=new Checkbox("SUBTRACTION",false,c);
   d=new Checkbox("MULTIPLICATION",false,c);
   e=new Checkbox("DIVISION",false,c);
   f=new Checkbox("NUMBERS FROM O TO 5",false ,c1);
   g=new Checkbox("NUMBERS FROM 3 TO 9",false ,c1);
   h=new Checkbox("NUMBERS FROM O TO 20",false,c1);
   i=new Checkbox("ANY TWO DIGITS",false,c1);

   b1=new Button("START");
   b2=new Button("STOP");
   t1=new TextField(100);
   t2=new TextField(100);
   t4=new TextField("");
   add(t4);
   t4.setBounds(700,350,300,30);
   t4.setVisible(true);
   l5.setBounds(300,600,190,30);
	  add(l5);
   a.setBounds(200,200,150,30);
   b.setBounds(200,250,150,30);
   d.setBounds(200,300,190,30);
   e.setBounds(200,350,150,30);
   
   f.setBounds(400,200,220,30);
   g.setBounds(400,250,220,30);
   h.setBounds(400,300,270,30);
   i.setBounds(400,350,200,30);

   l1.setBounds(200,150,180,30);
   l2.setBounds(400,150,180,30);
   l3.setBounds(250,400,100,30);
   t1.setBounds(250,440,100,30);
   l4.setBounds(360,400,100,30);
   t2.setBounds(360,440,100,30);
  b1.setBounds(200,500,100,30);
  b2.setBounds(400,500,100,30);

   add(l1); add(l2); add(l3); add(l4); //add(l5);
    add(a); add(b); add(e); add(d); add(c);
    add(f); add(g); add(h); add(i); add(c1);
   add(t1); add(t2); add(b1); add(b2);
   add(l7);// add(l8);
   l7.setBounds(300,650,260,40);
   //l8.setBounds();
   b1.addActionListener(this);
   b2.addActionListener(this);
   t2.addActionListener(this);
  // a.addItemListener(this);
   //b.addItemListener(this);
   
}
	
private void add(CheckboxGroup c2) {
	// TODO Auto-generated method stub
	
}
String time1=null;
public void run()
{
	String s=null;
	try {
		
		 Class.forName("com.mysql.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
		 PreparedStatement statement = con.prepareStatement("select curtime() ");
		 ResultSet result=statement.executeQuery();
		 
		while(result.next())
		  {
			  s=result.getString(1);
		  }
		timer.setText(s);
		con.close();
//		 statement = con.prepareStatement("select timediff(curtime(),'"+s3+"') from logged");
//		 result=statement.executeQuery();
//		 
//		while(result.next())
//		  {
//			  s4=result.getString(1);
//		  }
	
		
	 }
	  catch (SQLException | ClassNotFoundException e1) {
			e1.printStackTrace();
//		} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
}
	while(st==0)	{
	try {
		 String s3=null;
		 String s4=null,s5=null;
		 Class.forName("com.mysql.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
		 PreparedStatement statement = con.prepareStatement("select timediff(curtime(),'"+s+"'); ");
		 ResultSet result=statement.executeQuery();
		 
		while(result.next())
		  {
			  s3=result.getString(1);
		  }
		timer.setText(s3);
		con.close();
//		 statement = con.prepareStatement("select timediff(curtime(),'"+s3+"') from logged");
//		 result=statement.executeQuery();
//		 
//		while(result.next())
//		  {
//			  s4=result.getString(1);
//		  }
	
		
	 }
	  catch (SQLException | ClassNotFoundException e1) {
			e1.printStackTrace();
//		} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
}finally
	  {
	
	  }}
//	}
}
public void actionPerformed(ActionEvent e2)
{  
	Random ran=new Random();
	
	int counter=1;
	int rand3,rand4;
	double randdd=0;
  if(b1==e2.getSource())
  {
	 d1=new Date();
	 String etime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());	
	 System.out.println(d1);
	  th=new Thread(this);
	 th.start();
	if(a.getState())
	{
		if(f.getState())
		{
			 int rand1=ran.nextInt(6);
			 int rand2=ran.nextInt(6);
			 int c=rand1+rand2;
			 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
			 randd=c;
		}
		if(g.getState())
		{
			 int rand1=ran.nextInt(7);
			 int rand2=ran.nextInt(7);
			 rand1=rand1+3;
			 rand2=rand2+3;
			 int c=rand1+rand2;
			 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
			 randd=c;
		}
		if(h.getState())
		{
			 int rand1=ran.nextInt(20);
			 int rand2=ran.nextInt(20);
			 int c=rand1+rand2;
			 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
			 randd=c;
		}
		if(i.getState())
		{
			 int rand1=ran.nextInt(99);
			 int rand2=ran.nextInt(99);
			 int c=rand1+rand2;
			 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
			 randd=c;
		}
	}
	if(b.getState())
	{
		if(f.getState())
		{
			 int rand1=ran.nextInt(6);
			 int rand2=ran.nextInt(6);
			 int c=rand1-rand2;
			 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
			 randd=c;
		}
		if(g.getState())
		{
			 int rand1=ran.nextInt(7);
			 int rand2=ran.nextInt(7);
			 rand1=rand1+3;
			 rand2=rand2+3;
			 int c=rand1-rand2;
			 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
			 randd=c;
		}
		if(h.getState())
		{
			 int rand1=ran.nextInt(20);
			 int rand2=ran.nextInt(20);
			 int c=rand1-rand2;
			 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
			 randd=c;
		}
		if(i.getState())
		{
			 int rand1=ran.nextInt(99);
			 int rand2=ran.nextInt(99);
			 int c=rand1+rand2;
			 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
			 randd=c;
		}
	}
		if(d.getState())
		{
			if(f.getState())
			{
				 int rand1=ran.nextInt(6);
				 int rand2=ran.nextInt(6);
				 int c=rand1*rand2;
				 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
				 randd=c;
			}
			if(g.getState())
			{
				 int rand1=ran.nextInt(7);
				 int rand2=ran.nextInt(7);
				 rand1=rand1+3;
				 rand2=rand2+3;
				 int c=rand1*rand2;
				 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
				 randd=c;
			}
			if(h.getState())
			{
				 int rand1=ran.nextInt(20);
				 int rand2=ran.nextInt(20);
				 int c=rand1*rand2;
				 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
				 randd=c;
			}
			if(i.getState())
			{
				 int rand1=ran.nextInt(99);
				 int rand2=ran.nextInt(99);
				 int c=rand1*rand2;
				 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
				 randd=c;
			}
		}
		if(e.getState())
		{
			if(f.getState())
			{
				 int rand1=ran.nextInt(6);
				 int rand2=ran.nextInt(6);
				 int c=rand1/rand2;
				 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
				 randd=c;
			}
			if(g.getState())
			{
				 int rand1=ran.nextInt(7);
				 int rand2=ran.nextInt(7);
				 rand1=rand1+3;
				 rand2=rand2+3;
				 int c=rand1/rand2;
				 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
				 randd=c;
			}
			if(h.getState())
			{
				 int rand1=ran.nextInt(20);
				 int rand2=ran.nextInt(20);
				 int c=rand1/rand2;
				 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
				 randd=c;
			}
			if(i.getState())
			{
				 int rand1=ran.nextInt(99);
				 int rand2=ran.nextInt(99);
				 int c=rand1/rand2;
				 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
				 randd=c;
			}
		}
	}
  
  if(b2==e2.getSource())
  {
	 
	  
	  t1.setText("");
	  t2.setText("");
	  d2=new Date();
	  l5.setText("Correct Answers="+count+"/"+counter1);
	  long b=(d1.getTime()-d2.getTime());
	   if(b<0) b=b*-1; 
	   b=b/1000;
	   System.out.println(b);
	 	  t4.setText("TIME TAKEN="+ b  +"Seconds");
	 	  t4.setVisible(true);
	 	  st=1;
//	 	 try {
//			th.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	 System.exit(0);  
  }
  if(t2==e2.getSource())
  {  // System.out.println("gsg");
	  int m=Integer.parseInt(t2.getText());
	  counter1++;
	  t2.setText("");
	//  System.out.println(m);
	  //System.out.println(randd);
	  if(m==randd)
	  {
		  count++;  
		//  System.out.println("gsg");
		  l5.setText("Correct Answers="+count);
		  if(a.getState())
			{
				if(f.getState())
				{
					 int rand1=ran.nextInt(6);
					 int rand2=ran.nextInt(6);
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
					 randd=c;
				}
				if(g.getState())
				{
					 int rand1=ran.nextInt(7);
					 int rand2=ran.nextInt(7);
					 rand1=rand1+3;
					 rand2=rand2+3;
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
					 randd=c;
				}
				if(h.getState())
				{
					 int rand1=ran.nextInt(20);
					 int rand2=ran.nextInt(20);
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
					 randd=c;
				}
				if(i.getState())
				{
					 int rand1=ran.nextInt(99);
					 int rand2=ran.nextInt(99);
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
					 randd=c;
				}
			}
			if(b.getState())
			{
				if(f.getState())
				{
					 int rand1=ran.nextInt(6);
					 int rand2=ran.nextInt(6);
					 int c=rand1-rand2;
					 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
					 randd=c;
				}
				if(g.getState())
				{
					 int rand1=ran.nextInt(7);
					 int rand2=ran.nextInt(7);
					 rand1=rand1+3;
					 rand2=rand2+3;
					 int c=rand1-rand2;
					 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
					 randd=c;
				}
				if(h.getState())
				{
					 int rand1=ran.nextInt(20);
					 int rand2=ran.nextInt(20);
					 int c=rand1-rand2;
					 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
					 randd=c;
				}
				if(i.getState())
				{
					 int rand1=ran.nextInt(99);
					 int rand2=ran.nextInt(99);
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
					 randd=c;
				}
			}
				if(d.getState())
				{
					if(f.getState())
					{
						 int rand1=ran.nextInt(6);
						 int rand2=ran.nextInt(6);
						 int c=rand1*rand2;
						 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
						 randd=c;
					}
					if(g.getState())
					{
						 int rand1=ran.nextInt(7);
						 int rand2=ran.nextInt(7);
						 rand1=rand1+3;
						 rand2=rand2+3;
						 int c=rand1*rand2;
						 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
						 randd=c;
					}
					if(h.getState())
					{
						 int rand1=ran.nextInt(20);
						 int rand2=ran.nextInt(20);
						 int c=rand1*rand2;
						 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
						 randd=c;
					}
					if(i.getState())
					{
						 int rand1=ran.nextInt(99);
						 int rand2=ran.nextInt(99);
						 int c=rand1*rand2;
						 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
						 randd=c;
					}
				}
				if(e.getState())
				{
					if(f.getState())
					{
						 int rand1=ran.nextInt(6);
						 int rand2=ran.nextInt(6);
						 int c=rand1/rand2;
						 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
						 randd=c;
					}
					if(g.getState())
					{
						 int rand1=ran.nextInt(7);
						 int rand2=ran.nextInt(7);
						 rand1=rand1+3;
						 rand2=rand2+3;
						 int c=rand1/rand2;
						 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
						 randd=c;
					}
					if(h.getState())
					{
						 int rand1=ran.nextInt(20);
						 int rand2=ran.nextInt(20);
						 int c=rand1/rand2;
						 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
						 randd=c;
					}
					if(i.getState())
					{
						 int rand1=ran.nextInt(99);
						 int rand2=ran.nextInt(99);
						 int c=rand1/rand2;
						 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
						 randd=c;
					}
				}
	  }
	  else
	  {
		  if(a.getState())
			{
				if(f.getState())
				{
					 int rand1=ran.nextInt(6);
					 int rand2=ran.nextInt(6);
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
					 randd=c;
				}
				if(g.getState())
				{
					 int rand1=ran.nextInt(7);
					 int rand2=ran.nextInt(7);
					 rand1=rand1+3;
					 rand2=rand2+3;
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
					 randd=c;
				}
				if(h.getState())
				{
					 int rand1=ran.nextInt(20);
					 int rand2=ran.nextInt(20);
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
					 randd=c;
				}
				if(i.getState())
				{
					 int rand1=ran.nextInt(99);
					 int rand2=ran.nextInt(99);
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"+"+Integer.toString(rand2));
					 randd=c;
				}
			}
			if(b.getState())
			{
				if(f.getState())
				{
					 int rand1=ran.nextInt(6);
					 int rand2=ran.nextInt(6);
					 int c=rand1-rand2;
					 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
					 randd=c;
				}
				if(g.getState())
				{
					 int rand1=ran.nextInt(7);
					 int rand2=ran.nextInt(7);
					 rand1=rand1+3;
					 rand2=rand2+3;
					 int c=rand1-rand2;
					 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
					 randd=c;
				}
				if(h.getState())
				{
					 int rand1=ran.nextInt(20);
					 int rand2=ran.nextInt(20);
					 int c=rand1-rand2;
					 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
					 randd=c;
				}
				if(i.getState())
				{
					 int rand1=ran.nextInt(99);
					 int rand2=ran.nextInt(99);
					 int c=rand1+rand2;
					 t1.setText(Integer.toString(rand1)+"-"+Integer.toString(rand2));
					 randd=c;
				}
			}
				if(d.getState())
				{
					if(f.getState())
					{
						 int rand1=ran.nextInt(6);
						 int rand2=ran.nextInt(6);
						 int c=rand1*rand2;
						 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
						 randd=c;
					}
					if(g.getState())
					{
						 int rand1=ran.nextInt(7);
						 int rand2=ran.nextInt(7);
						 rand1=rand1+3;
						 rand2=rand2+3;
						 int c=rand1*rand2;
						 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
						 randd=c;
					}
					if(h.getState())
					{
						 int rand1=ran.nextInt(20);
						 int rand2=ran.nextInt(20);
						 int c=rand1*rand2;
						 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
						 randd=c;
					}
					if(i.getState())
					{
						 int rand1=ran.nextInt(99);
						 int rand2=ran.nextInt(99);
						 int c=rand1*rand2;
						 t1.setText(Integer.toString(rand1)+"*"+Integer.toString(rand2));
						 randd=c;
					}
				}
				if(e.getState())
				{
					if(f.getState())
					{
						 int rand1=ran.nextInt(6);
						 int rand2=ran.nextInt(6);
						 int c=rand1/rand2;
						 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
						 randd=c;
					}
					if(g.getState())
					{
						 int rand1=ran.nextInt(7);
						 int rand2=ran.nextInt(7);
						 rand1=rand1+3;
						 rand2=rand2+3;
						 int c=rand1/rand2;
						 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
						 randdd=c;
					}
					if(h.getState())
					{
						 int rand1=ran.nextInt(20);
						 int rand2=ran.nextInt(20);
						 int c=rand1/rand2;
						 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
						 randd=c;
					}
					if(i.getState())
					{
						 int rand1=ran.nextInt(99);
						 int rand2=ran.nextInt(99);
						 int c=rand1/rand2;
						 t1.setText(Integer.toString(rand1)+"/"+Integer.toString(rand2));
						 randd=c;
					}
				}
	  }
  }
 
}
}

	



























