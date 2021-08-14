
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
public class play extends Frame implements ActionListener{
	Panel p1,p2;
	Button play,lottery,b1,b2,b3,clr,mul,div;
	TextField betamt,val,genval,t1,t2,t3,t4,ba,eamt,w1,w2,w3,timleft;
	Label bal,number,generatednumber,status,l1,l2,l3,l4,amt,entry,timer,winner,wname,amt1,amt2,amt3,timer1;
	Checkbox c1,c2,jackpot,ch1,ch2,ch3;
	CheckboxGroup cb,j1;
	int a;
	String player=null;
	int balance=0;
	int bet;
	String k1=null,k2=null;
//	public void paint(Graphics g)
//	{
//		String h=null;
//			PreparedStatement  statement14=con.prepareStatement("select timediff(curTime(),lastlo) from logged where name='"+player+"';");
//			ResultSet result14=statement14.executeQuery();
//			while(result14.next())
//		  {
//					h=result14.getString(1);
//		  }
//			 statement12=con.prepareStatement("select lastlogintime-curtime() from logged where name='"+player+"';");
//		 result12=statement12.executeQuery();
// 			while(result12.next())
//			  {
//			  s5=result12.getString(1);
//			  }
// 		t=Integer.parseInt(s5);
//			while(t>0)
//			{
//				repaint();
//				t--;
			
// 			 try {
//				Class.forName("com.mysql.jdbc.Driver");
//				Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lottery"+"?useSSL=false","root","411631");
//				PreparedStatement statement14=con.prepareStatement("select curtime() from logged;");
//				ResultSet result14=statement14.executeQuery();
//				while(result14.next())
//				  {
//	 					k2=result14.getString(1);
//				  }
//			 statement14=con.prepareStatement("select timediff(addtime("+k2+",'00:59:00'),curtime()) from logged;");
//			 result14=statement14.executeQuery();
//				while(result14.next())
//				  {
//	 					k2=result14.getString(1);
//				  }
//				timleft.setText(k2);
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				
//			}
//		}
		
		
	
	public void actionPerformed(ActionEvent e) {
		if(b2==e.getSource())
		{

			String b=null;
			int tot=0;
			int t=0;
			String s5=null,r1=null;
			p1.setVisible(false);
			p2.setVisible(true);
			 PreparedStatement statement=null;
			 try {
	 			 Class.forName("com.mysql.jdbc.Driver");
				Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
				PreparedStatement statement12=con.prepareStatement("select lastlogintime-curtime() from logged where name='"+player+"';");
				
				 ResultSet result12=statement12.executeQuery();
		 			while(result12.next())
					  {
					  s5=result12.getString(1);
					  }
		 		t=Integer.parseInt(s5);
		 		if(t>3600){
		 			PreparedStatement statement1=con.prepareStatement("select total from logged where  name='"+player+"';");
	 				 ResultSet result1=statement1.executeQuery();
	 				 
			 			while(result1.next())
						  {
			 					tot=result1.getShort(1);
						  }

			 			w1.setText("karthik");

			 			 PreparedStatement statement14=con.prepareStatement("select lastlo from logged where  name='"+player+"';");
		 				 ResultSet result14=statement14.executeQuery();
				 			while(result14.next())
							  {
				 				k1=result14.getString(1);
							  }			 			
			 				 try {
			 					Class.forName("com.mysql.jdbc.Driver");
			 				
			 					PreparedStatement statement143=con.prepareStatement("select curtime() from logged;");
			 					ResultSet result143=statement143.executeQuery();
			 					while(result143.next())
			 					  {
			 		 					k2=result143.getString(1);
			 					  }
			 				 statement14=con.prepareStatement("select timediff(addtime("+k2+",'00:59:00'),curtime()) from logged;");
			 				 result14=statement14.executeQuery();
			 					while(result14.next())
			 					  {
			 		 					k2=result14.getString(1);
			 					  }
			 					timleft.setText(k2);
			 					timleft.setVisible(true);
			 					timleft.setText("karthik");
			 				} catch (ClassNotFoundException e1) {
			 					// TODO Auto-generated catch block
			 					e1.printStackTrace();
			 				} catch (SQLException e1) {
			 					// TODO Auto-generated catch block
			 					
			 				}
//			 			  }
				 }
		 		else{
//		 			String h=null;
//		 			PreparedStatement  statement14=con.prepareStatement("select timediff(curTime(),lastlo) from logged where name='"+player+"';");
//	 				ResultSet result14=statement14.executeQuery();
//	 				while(result14.next())
//					  {
//		 					h=result14.getString(1);
//					  }
//	 				 statement12=con.prepareStatement("select lastlogintime-curtime() from logged where name='"+player+"';");
//					 result12=statement12.executeQuery();
//			 			while(result12.next())
//						  {
//						  s5=result12.getString(1);
//						  }
//			 		t=Integer.parseInt(s5);
//		 			while(t>0)
//		 			{
//		 				repaint();
//		 				t--;
//		 			}
//		 			for(int i=0;i<40;i++)
//		 			{
		 			repaint();
		 			Thread.sleep(999);
//		 			}
		 		}
			 }
			  catch (SQLException | ClassNotFoundException e1) {
	 				e1.printStackTrace();
	 			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(mul==e.getSource())
		{
			int n=Integer.parseInt(betamt.getText());
			n=n*2;
			String a=Integer.toString(n);
			betamt.setText(a);
			System.out.println(n);
		}
		if(div==e.getSource())
		{
			int n=Integer.parseInt(betamt.getText());
			n=n/2;
			betamt.setText(Integer.toString(n));
		}
		if(clr==e.getSource())
		{
			t2.setText("");
			c1.setState(false);
			c2.setState(false);
			t4.setText("");
			betamt.setText("1");
		}
		if(b1==e.getSource())
		{
			p1.setVisible(true);
			p2.setVisible(false);
		}
		if(b3==e.getSource())
		{
			int n2=1;
			int n1=1;
			if(jackpot.getState())
			{
				if(ch1.getState()){
					n2=5;n1=100;
				}
				if(ch2.getState()){
					n2=10;n1=100;
				}
				if(ch3.getState())
				{
					n2=100;n1=100;
				}
			}
			Random r=new Random();
			int result=r.nextInt(500-1)+1;
			int n=Integer.parseInt(t1.getText());
			bet=Integer.parseInt(betamt.getText());
			if((balance-bet*n2)<0)
			{
				t2.setText("not possible");
			}
			
			
			else if(c1.getState()&&result>n)
			{
				t4.setText(Integer.toString(result));
				t2.setText("you won");
				t2.setVisible(true);
				bet=Integer.parseInt(betamt.getText());
				String s3=null;
				 PreparedStatement statement=null;
				 try {
		 			 Class.forName("com.mysql.jdbc.Driver");
					Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
					balance=balance+bet*n2;
					s3=Integer.toString(balance);
		 			  statement = con.prepareStatement("update logged set balance='"+ s3 +"'where name= '"+player+"';");
		 			 statement.executeUpdate();
				 }
				  catch (SQLException | ClassNotFoundException e1) {
		 				e1.printStackTrace();
		 			}
				 ba.setText(s3);
			}
			else if(c2.getState()&&result<Integer.parseInt(t1.getText()))
			{
				t4.setText(Integer.toString(result));
				t2.setText("you won");
				t2.setVisible(true);
				bet=Integer.parseInt(betamt.getText());
				String s3=null;
				 PreparedStatement statement=null;
				 try {
		 			 Class.forName("com.mysql.jdbc.Driver");
					Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
					balance=balance+bet*n2;
				s3=Integer.toString(balance);
		 			  statement = con.prepareStatement("update logged set balance='"+s3 +"'where name='"+player+"';");
		 			 statement.executeUpdate();
				 }
				  catch (SQLException | ClassNotFoundException e1) {
		 				e1.printStackTrace();
		 			}
				 ba.setText(s3);
			}
			else
			{
				t4.setText(Integer.toString(result));
				t2.setText("you lost");
				String s3=null;
				 PreparedStatement statement=null;
				 try {
		 			 Class.forName("com.mysql.jdbc.Driver");
					Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
					balance=balance-bet*n2;
					if(balance<0) balance=0;
				s3=Integer.toString(balance);
		 			  statement = con.prepareStatement("update logged set balance= '"+ s3 +"'where name='"+player+"';");
		 			 statement.executeUpdate();
				 }
				  catch (SQLException | ClassNotFoundException e1) {
		 				e1.printStackTrace();
		 			}
				 ba.setText(s3);
			}
		}
	}
	play(String name,int value)
	{
//		betamt=new TextField("");
//		val=new TextField("");
//		genval=new TextField("");
//		p1=new Panel();
//		p2=new Panel();
//		setLayout(null);
//		play=new Button("play");
//		lottery=new Button("lottery");
//		play.setBounds(30,30,50,30);
//		lottery.setBounds(90,30,50,30);
//		add(play);
//		add(lottery);
//		bal=new Label("balance");
//		generatednumber=new Label("generatednumber");
//		status=new Label("status");
//		add(bal);
//		p1.add(number);
//		p1.add(val);
//		p1.add(generatednumber);
//		p1.add(genval);
//		p1.add(c1);
//		p1.add(comp)
//		p1.add(status);
//		bal.setBounds(150,30,50,30);
		setFont(new Font("monospace",Font.BOLD,16));
		timleft=new TextField("hello");
		timer1=new Label("");
		p2=new Panel();
		w1=new TextField("");
		w2=new TextField("");
		w3=new TextField("");
		entry=new Label("entry amt");
		eamt=new TextField("2");
		timer=new Label("TIME LEFT");
		timer1.setBounds(40,140,100,30);
		winner=new Label("winning amt");
		wname=new Label("name");
		amt1=new Label("1000R");
		amt2=new Label("100R");
		amt3=new Label("10R");
		p2.add(entry);
		p2.add(eamt);
		p2.add(timer);
		p2.add(winner);
		p2.add(wname);
		p2.add(w1);
		p2.add(w2);
		p2.add(timleft);
		p2.add(w3); p2.add(amt1); p2.add(amt2); p2.add(amt3); p2.add(timer1);
		entry.setBounds(40, 30, 60, 30); eamt.setBounds(110,30,60,30);
		timer.setBounds(40,100,60,30);
		winner.setBounds(30,180,60,30);
		wname.setBounds(120,180,60,30);
		w1.setBounds(120,230,60,30); w2.setBounds(120,280,60,30);w3.setBounds(120,330,60,30);
		amt1.setBounds(40,230,60,30); amt2.setBounds(40,280,60,30);amt3.setBounds(40,330,60,30);
		timleft.setBounds(40,140,80,30);
		mul=new Button("*2");
		div=new Button("/2");
		jackpot=new Checkbox("JACKPOT");
		j1=new CheckboxGroup();
		add(j1);
		ch1=new Checkbox("1R",false,j1);
		ch2=new Checkbox("10R",false,j1);
		ch3=new Checkbox("100R",false,j1);
		clr=new Button("clear");
		betamt=new TextField("");
		player=name;
		balance=value;
		String s1=Integer.toString(value);
		setLayout(null);
		b1=new Button("play");
		b2=new Button("lottery");
		add(b1);
		add(b2);
		bal=new Label("balance");
		amt=new Label("enter amt");
		betamt=new TextField("");
		betamt.setText("");
		ba=new TextField("");
		ba.setText(s1);
		ba.setEditable(false);
		p1=new Panel();
		t1=new TextField("250");
		t1.setEditable(false);
		t2=new TextField("");
		t3=new TextField("");
		l1=new Label("number from (0-500):");
		l2=new Label("generated number");
		b3=new Button("generte");
		cb=new CheckboxGroup();
		c1=new Checkbox("high",false,cb);
		c2=new Checkbox("low",false,cb);
		t3.setVisible(false);
		t4=new TextField("");
		p1.setBackground(Color.GRAY);
		l1.setBounds(10,10,50,30);
		t1.setBounds(70,10,50,30);
		l2.setBounds(10,50,50,30);
		t4.setBounds(70,50,50,30);
		c1.setBounds(10,90,50,30);
		c2.setBounds(70,90,50,30);
		b3.setBounds(10,130,50,30);
		clr.setBounds(70,130,50,30);
		t2.setBounds(10,170,100,30);
		amt.setBounds(10,210,50,30);
		betamt.setBounds(70,210,50,30);
		mul.setBounds(10,250,50,30);
		div.setBounds(70,250,50,30);
		jackpot.setBounds(260,10,90,30);
		ch1.setBounds(260,70,50,30);
		ch2.setBounds(260,110,50,30);
		ch3.setBounds(260,150,50,30);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t4);
		p1.add(t2);
		p1.add(t3);
		p1.add(b3);
		p1.add(c1);  p1.add(c2);
		add(cb);
		p1.add(clr);
		p1.add(betamt);
		p1.add(amt); p1.add(mul); p1.add(div); p1.add(jackpot); p1.add(ch1);
p1.add(ch2);  p1.add(ch3);
		p1.setLayout(null);
		p2.setLayout(null);
		add(b1);
		add(b2);
		add(p1);
		add(p2);
		add(ba);
		add(bal);
		p1.setVisible(false);
		p2.setVisible(false);
		p2.setBackground(Color.yellow);
		p1.setBounds(100,100,400,400);
		p2.setBounds(100,100,400,500);
		b1.setBounds(30,40,50,30);
		b2.setBounds(90,40,50,30);
		bal.setBounds(150,40,50,30);
		ba.setBounds(210,40,50,30);
		b1.addActionListener( this);
		b2.addActionListener( this);
		b3.addActionListener( this);
		clr.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
				public void windowClosing(WindowEvent we)
				{
					setVisible(false);
				}
		}
		);
	}
	private void add(CheckboxGroup cb2) {
		// TODO Auto-generated method stub
		
	}
}

