package library;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Bill  extends Frame implements ActionListener {
Label l1,l2,l3,l4;
TextField t1,t2;
Button b1,b2,b3,b4;
String s4; int b;
Connection con = null;
PreparedStatement statement=null,statement1=null,statement2=null,statement3=null,statement4=null,statement5=null;
String s = null; int c = 0,d2;
int d = 0;
String s1=null;
Bill(String h,int a)
{setFont(new Font("serif",Font.BOLD,18));
	s4=h; b=a;
	setLayout(null);
	l1=new Label("bookid");
	t1=new TextField(30);
	t2=new TextField(30);
	l4=new Label("");
	l2=new Label("");
	l3=new Label("");
	t1.setText(Integer.toString(b));
	t1.setEditable(false);
	l1.setBounds(100,100,40,20);
	t1.setBounds(150,100,40,20);
	b1=new Button("Calculate");
	b2=new Button("exit");
	b3=new Button("procced");
	b4=new Button("complete");
	b1.setBounds(100,200,100,30);
	b2.setBounds(220,200,100,30);
	add(l1); add(t1); add(b1);add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	//b3.addActionListener(this);
	//b4.addActionListener(this);
	t2.addActionListener(this);
	 addWindowListener(new WindowAdapter()
		{
	      public void windowClosing(WindowEvent e)
	      {
	    	  System.exit(0);
	      }
		});
}
	
public void actionPerformed(ActionEvent e)
{
	
	
  if(b2==e.getSource())
  {
	  System.exit(0);
  }
  if(b1==e.getSource())
  {
	  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
			  statement = con.prepareStatement("select (curdate()-dateofp) from books where bookid="+Integer.parseInt(t1.getText())+";"); 
			  ResultSet result=statement.executeQuery();
			  while(result.next())
			  {
				s=result.getString(1);
			  }  
			c=Integer.parseInt(s);
			if(c>1)
			{
				l2.setText("bill should be paid= "+(c-1));
				l2.setBounds(100,250,200,30);
				add(l2);
				int d=c-1;
				Complete c=new Complete(s4,b,d);
				c.setSize(1000,1000);
				c.setVisible(true);
				c.setTitle("Complete");	  
			}
			else
			{
				l2.setText("no need of any bill");
				l2.setBounds(100,250,200,30);
				Complete c=new Complete(s4,b,d);
				c.setSize(1000,1000);
				c.setVisible(true);
				c.setTitle("Complete");
				c.setBackground(Color.green);
				
			}}
	  catch (SQLException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  }
  
  
}}