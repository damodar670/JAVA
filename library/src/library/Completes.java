package library;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Completes extends Frame implements ActionListener {
Button b1,b2;
Label l1,l2,l3;
TextField t1,t2;
String s4;
int b,d;
Completes(String h,int a,int c)
{setFont(new Font("serif",Font.BOLD,18));
	s4=h;
	b=a;
	d=c;
	setLayout(null);
	l1=new Label("bookid");
	l2=new Label("Fine");
	t1=new TextField(30);
	t2=new TextField(30);
	t1.setEditable(false);
	t2.setEditable(false);
	t1.setText(Integer.toString(b));
	t2.setText(Integer.toString(d));
	l1.setBounds(100,100,60,30);
	l2.setBounds(100,170,60,30);
	t1.setBounds(170,100,60,30);
	t2.setBounds(170,170,60,30);
	b1=new Button("complete");
	b2=new Button("Exit");
	add(l1); add(l2); add(t1); add(t2); add(b1);add(b2);
	b1.setBounds(150,300,60,30);
	b2.setBounds(220,300,60,30);
	 b1.addActionListener(this);
	    b2.addActionListener(this);
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
	Connection con=null;
	 String s2=null;
	if(b2==e.getSource())
	{
		System.exit(0);
	}
	if(b1==e.getSource())
	{
		  try {
			 String s6="avail";
			  Class.forName("com.mysql.jdbc.Driver");
 			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
			   PreparedStatement statement12 = con.prepareStatement("select noBookIssued from faculty where fid="+Integer.parseInt(s4)+";"); 
			   ResultSet result1=statement12.executeQuery();
				  while(result1.next())
				  {
					s2=result1.getString(1);
				  }  
				  int d1=Integer.parseInt(s2);
				  d1=d1-1;
			 PreparedStatement statement11 = con.prepareStatement("update faculty set  noBookIssued= '"+d1+"'where fid= "+Integer.parseInt(s4)+";");
			 statement11.executeUpdate();
			 PreparedStatement statement13 = con.prepareStatement("update books set status= '"+s6+"',fid=null"+",dateofp=null"+" where bookid="+b+";");
			 statement13.executeUpdate();
			 PreparedStatement statement14 = con.prepareStatement("delete from transaction where fid="+Integer.parseInt(s4)+" and bookid="+b+";");
			 statement14.executeUpdate();
			 System.exit(0); 
		  }
		  catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    System.exit(0);
	}
}
}

