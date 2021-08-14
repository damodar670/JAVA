
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class register extends Frame implements ActionListener{
	String name;
	String password;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b1,b2,b3;
	public void actionPerformed(ActionEvent e) {
		if(b1==e.getSource())
		{
			String s3=null;
			if(t1.getText()==null||t2.getText().equals(""))
			{
				t3.setText("please enter the values");
				t3.setVisible(true);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			name=t1.getText();
			password=t2.getText();
			 PreparedStatement statement=null;
			 try {
	 			 Class.forName("com.mysql.jdbc.Driver");
				Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
	 			 statement = con.prepareStatement("select total from logged  where name= '"+"karthik"+"';");
	 			 ResultSet result=statement.executeQuery();
	 			while(result.next())
				  {
					  s3=result.getString(1);
				  }
	 			int n=Integer.parseInt(s3);
	 			n++;
	 			  statement = con.prepareStatement("insert into logged values('"+name+"', "+"'"+password+"', "+"curdate(),curtime(),20,null,"+n+");");
	 			  statement.executeUpdate();
	 			  statement = con.prepareStatement("update logged set total="+n+";");
	 			  statement.executeUpdate();
			 }
			  catch (SQLException | ClassNotFoundException e1) {
	 				e1.printStackTrace();
	 			}
			 	t1.setText("");
			 	t2.setText("");
			 	t3.setText("succesfully regestered");
			 	t3.setVisible(true);
		}
		if(b2==e.getSource())
		{
			loginpage login=new loginpage();
			login.setVisible(true);
			login.setBounds(30,30,600,600);
			login.setTitle("login page");
		}
	}
	register()
	{
		setLayout(null);
		l1=new Label("enter name");
		l2=new Label("enter password");
		t1=new TextField("");
		t2=new TextField("");
		b1=new Button("register");
		b2=new Button("already registered");
		t3=new TextField("");
		
		  add(l1);  add(l2);    add(t1); add(t3);  add(t2);   add(b1);  add(b2);
		t2.setEchoChar('*');
		l1.setBounds(60,60,100,30);
		l2.setBounds(60,100,100,30);
		t1.setBounds(200,60,100,30);
		t2.setBounds(200,100,100,30);
		b1.setBounds(80,180,100,30);
		b2.setBounds(200,180,100,30);
		t3.setBounds(80,220,200,30);
		t3.setVisible(false);
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
	public static void main(String []args)
	{
		register r=new register();
		r.setVisible(true);
		r.setBounds(30,30,600,600);
		r.setTitle("register page");
		r.setFont(new Font("monospace",Font.BOLD,12));

	}
}

