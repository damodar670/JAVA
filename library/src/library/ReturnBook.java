package library;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class ReturnBook extends Frame implements ActionListener {
Button b1,b2,b3;
Label l1,l2;
TextField t1;
String s4;
ReturnBook(String h)
{setFont(new Font("serif",Font.BOLD,18));
	setLayout(null);
	s4=h;
	l1=new Label("bookid");
	l2=new Label("");
	t1=new TextField(30);
	b1=new Button("Return");
	b2=new Button("Exit");
	b3=new Button("Bill");
	l1.setBounds(100,100,40,20);
	t1.setBounds(160,100,40,20);
	b1.setBounds(400,400,40,20);
	b2.setBounds(400,450,40,20);
	add(l1); add(t1); add(b1); add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
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
	PreparedStatement statement=null;
	String s=null;
	  int a=Integer.parseInt(t1.getText());
	  int f1 = 0;
  if(b1==e.getSource())
  {  
	  
	  try {
	  Class.forName("com.mysql.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
		  statement = con.prepareStatement("select sid from books where bookid= "+Integer.parseInt(t1.getText())+";"); 
		  ResultSet result=statement.executeQuery();
		  while(result.next())
		  {
			f1=result.getInt(1);
		  } 
		int  a1=Integer.parseInt(s4);
		  if(f1==a1)
		  {
			  l2.setText("book is issued to u complete bill process");
			  l2.setBounds(100,210,220,40);
			  add(l2);
			  add(b3);
			  b3.setBounds(100,260,40,20);
			  b3.addActionListener(this);
			
			 
		  }
		  else
		  {
			  l2.setText("oops! error: check bookid ");
			  l2.setBounds(100,210,220,40);
			  add(l2);
		  }
	  }
	  catch (SQLException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  }
  if(b2==e.getSource())
  {
	  System.exit(0);
  }
  if(b3==e.getSource())
  {
	  Bill b=new Bill(s4,a);
	  b.setVisible(true);
	  b.setSize(1000,1000);
	  b.setTitle("Billing process");
	  b.setBackground(Color.GREEN);
  }
}
}
