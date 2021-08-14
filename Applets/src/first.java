import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class first extends Applet  implements ActionListener {
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2;
   public void init()
   {   setLayout(null);
   
	   l1=new Label("Annual Interest Rate");
	   l2=new Label("Number Of Years");
	   l3=new Label("Loan Amount");
	   l4=new Label("Monthly Payment");
	   l5=new Label("Total Payment");
	   t1=new TextField(30);
	   t2=new TextField(30);
	   t3=new TextField(30);
	   t4=new TextField(30);
	   t5=new TextField(30);
	   b1=new Button("Compute Payment");
	   b2=new Button("Exit");
	   add(l1);
	   add(t1);
	   add(l2);
	   add(t2);
	   add(l3);
	   add(t3);
	   add(l4);
	   add(t4);
	   add(l5);
	   add(t5);
	   add(b1); add(b2);
	   l1.setBounds(100,100,110,30);
	   l2.setBounds(100,150,110,30);
	   l3.setBounds(100,200,110,30);
	   l4.setBounds(100,250,110,30);
	   l5.setBounds(100,300,110,30);
       t1.setBounds(220,100,100,30);
       t2.setBounds(220,150,100,30);
       t3.setBounds(220,200,100,30);
       t4.setBounds(220,250,100,30);
       t5.setBounds(220,300,100,30);
       b1.setBounds(100,370,100,30);
       b2.setBounds(220,370,100,30);


	//   b1.setBounds(100,100,);
	   setBackground(Color.orange);
	   int a=6,b=10,c=10000;
	   t1.setText(Integer.toString(a));
	   t2.setText(Integer.toString(b));
	   t3.setText(Integer.toString(c));
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	     
   }
   public void actionPerformed(ActionEvent e)
   {
	   double b;
	   if(b1==e.getSource())
	   {
		   int a=Integer.parseInt(t1.getText());
		   int c=Integer.parseInt(t2.getText());
		   int d=Integer.parseInt(t3.getText());
		   b=d*a*12*c/100;
		   System.out.println(b);
		   t5.setText(Double.toString(b));
		   t4.setText(Double.toString(b/12));
		//   b1.removeActionListener(this);
	   }
	   if(b2==e.getSource())
	   {
		   try {
			   Thread.sleep(1000);
			   System.exit(0);
		   }
		   catch(InterruptedException e1)
		   {
			   
		   }
		  }}}
