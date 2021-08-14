
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class loginpage extends Frame implements ActionListener{
	String name,password,s3;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
		public void actionPerformed(ActionEvent ae)
		{
			if(b1==ae.getSource())
			{
				int value=0;
				name=t1.getText();
				password=t2.getText();
				 PreparedStatement statement=null;
				 try {
		 			 Class.forName("com.mysql.jdbc.Driver");
					Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
		 			  statement = con.prepareStatement("select password from logged  where name= '"+name+"';");
		 			 ResultSet result=statement.executeQuery();
		 			while(result.next())
					  {
						  s3=result.getString(1);
					  }
		 			if(s3.equals(password))
		 			{
		 				String s5=null;
		 				String s4 = null;
		 				t3.setText("logged in succesfully");
		 				t3.setVisible(true);
		 				Thread.sleep(1000);
		 				PreparedStatement statement1=con.prepareStatement("select balance from logged where name='"+name+"';");
		 				 ResultSet result1=statement1.executeQuery();
				 			while(result1.next())
							  {
							  s4=result1.getString(1);
								 
							  }
				 			 value=Integer.parseInt(s4);
				 			PreparedStatement statement12=con.prepareStatement("select lastlogintime-curtime() from logged where name='"+name+"';");
			 				 ResultSet result12=statement12.executeQuery();
					 			while(result12.next())
								  {
								  s5=result12.getString(1);
									 
								  }
					 			int t=Integer.parseInt(s5);
					 			if(t>3600){
					 				value=value+2;
					 			}
			 				play r=new play(name,value);
			 				r.setVisible(true);
			 				r.setBounds(30,30,600,600);
			 				r.setTitle("lottery");
		 			}
		 			else
		 			{
		 				t4.setText("incorrect details");
		 				t4.setVisible(true);
		 			}
				 }
				  catch (SQLException | ClassNotFoundException e1) {
		 				e1.printStackTrace();
		 			} catch (InterruptedException e) {
					e.printStackTrace();
				}
				 
			}
			if(b2==ae.getSource())
			{
				t1.setText("");
				t2.setText("");
			}
		}
		loginpage()
		{		setFont(new Font("monospace",Font.BOLD,16));

			setLayout(null);
			l1=new Label("enter name");
			l2=new Label("enter password");
			t1=new TextField("");
			t2=new TextField("");
			b1=new Button("login");
			b2=new Button("cancel");
			t3=new TextField("");
			t4=new TextField("");
			t4.setText("");
			  add(l1);  add(l2);    add(t1); add(t3);  add(t2);   add(b1);  add(b2);  add(t4);
			t2.setEchoChar('*');
			l1.setBounds(60,60,100,30);
			l2.setBounds(60,100,100,30);
			t1.setBounds(200,60,100,30);
			t2.setBounds(200,100,100,30);
			b1.setBounds(80,180,100,30);
			b2.setBounds(200,180,100,30);
			t3.setBounds(80,220,200,30);
			t4.setBounds(80,260,200,30);
			t3.setVisible(false);
			t4.setVisible(false);
			b1.addActionListener(this);
			b2.addActionListener(this);
			this.addWindowListener(new WindowAdapter()
					{
						public void windowClosing(WindowEvent we)
						{
							System.exit(0);
						}
					});
		}		
}

