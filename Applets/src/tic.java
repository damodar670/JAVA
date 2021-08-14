import java.awt.*;
import java.awt.event.*;
public class tic extends Frame implements ActionListener {
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
 Button b10,b11;
 Font f;
 Label t3;
 Label t1;
Label  t2,t4;
  int counter=1;
  public static void main(String args[]) {
	  tic e = null;
	try {
		e = new tic();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		e.setSize(500,500);
		e.setVisible(true);
  }
	tic() throws InterruptedException{
		f=new Font("Serif",Font.BOLD,30);
		setFont(f);
		//setBackground(Color.YELLOW);
		setLayout(null);
		b1=new Button("");
		b2=new Button("");
		b3=new Button("");
		b4=new Button("");
		b5=new Button("");
		b6=new Button("");
		b7=new Button("");
		b8=new Button("");
		b9=new Button("");
		b10=new Button("");
		t1=new Label("");
		t2=new Label("");
		t3=new Label("");
		t4=new Label("");
		b1.setBounds(100,100,70,70);
		b2.setBounds(170,100,70,70);
		b3.setBounds(240,100,70,70);
		b4.setBounds(100,170,70,70);
		b5.setBounds(170,170,70,70);
		b6.setBounds(240,170,70,70);
		b7.setBounds(100,240,70,70);
		b8.setBounds(170,240,70,70);
		b9.setBounds(240,240,70,70);
		t1.setBounds(330,170,200,30);
		t2.setBounds(330,240,200,30);
		t3.setBounds(140,340,200,30);
		t4.setBounds(140,390,200,30);
		t4.setForeground(Color.magenta);
     t1.setText("Player 1     'X'");
     t2.setText("Player 2     '0'");
		add(b1); add(b2);add(b3);  add(b4); add(b5); add(b6); add(b7); add(b8); add(b9);
		add(t1); add(t2); add(t3); add(t4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		 addWindowListener(new WindowAdapter()
		 {
	        public void windowClosing(WindowEvent e)
	        {
	        	System.exit(0);
	        }
	         
		 });
		if(counter==10)
		{
		   t4.setText("It's  a draw");
		   Thread.sleep(5000);
		}
       if(counter==1)
       {
    	   t3.setText("Player 1 Turn");	
  
       } 
	}

	public void actionPerformed(ActionEvent e)
	{
		
		if(b1==e.getSource())
		{
			
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)
			{
		    	// System.out.println(counter);
				b1.setLabel("X"); t3.setText("Player 2 Turn"); //b1.setBackground(Color.CYAN);
				 if(b1.getLabel()=="X")
			    	 b1.setBackground(Color.BLUE);

			}
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b1.setLabel("0");  t3.setText("Player 1 Turn"); //b1.setBackground(Color.MAGENTA);
					

		     }
		     b1.removeActionListener(this);
		    		    	 
		    	 
		     counter++;
		     if((b1.getLabel()=="X"&&b2.getLabel()=="X"&&b3.getLabel()=="X")||(b1.getLabel()=="X"&&b4.getLabel()=="X"&&b7.getLabel()=="X")||(b1.getLabel()=="X"&&b5.getLabel()=="X"&&b9.getLabel()=="X"))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     if((b1.getLabel()=="0"&&b2.getLabel()=="0"&&b3.getLabel()=="0")||(b1.getLabel()=="0"&&b4.getLabel()=="0"&&b7.getLabel()=="0")||(b1.getLabel()=="0"&&b5.getLabel()=="0"&&b9.getLabel()=="0"))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		     if(counter==10&&((b1.getLabel()=="X"&&b2.getLabel()=="X"&&b3.getLabel()=="X")||(b1.getLabel()=="X"&&b4.getLabel()=="X"&&b7.getLabel()=="X")||(b1.getLabel()=="X"&&b5.getLabel()=="X"&&b9.getLabel()=="X")))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     
		     else  if(counter==10)
					{
					   t4.setText("It's  a draw");	
					}
		     
		     }     
		
		if(b2==e.getSource())
		{
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)

			{
				b2.setLabel("X");  t3.setText("Player 2 Turn");
				 if(b2.getLabel()=="X")
			    	 b2.setBackground(Color.BLUE);

			}
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b2.setLabel("0");  t3.setText("Player 1 Turn");

		     }
		     b2.removeActionListener(this);
		     counter++;
		     if((b2.getLabel()=="X"&&b5.getLabel()=="X"&&b8.getLabel()=="X")||(b2.getLabel()=="X"&&b1.getLabel()=="X"&&b3.getLabel()=="X"))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     if((b2.getLabel()=="0"&&b5.getLabel()=="0"&&b8.getLabel()=="0")||(b2.getLabel()=="0"&&b1.getLabel()=="0"&&b3.getLabel()=="0"))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		     if(counter==10&&((b2.getLabel()=="X"&&b5.getLabel()=="X"&&b8.getLabel()=="X")||(b2.getLabel()=="X"&&b1.getLabel()=="X"&&b3.getLabel()=="X")))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     else  if(counter==10)
				{
				   t4.setText("It's  a draw");	
				}
		}
		     
		    	  
		if(b3==e.getSource())
		{
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)

			{
				b3.setLabel("X");  t3.setText("Player 2 Turn");
				 if(b3.getLabel()=="X")
			    	 b3.setBackground(Color.BLUE);

			}
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b3.setLabel("0");  t3.setText("Player 1 Turn");

		     }
		     b3.removeActionListener(this);
		     counter++;
		     if((b1.getLabel()=="X"&&b2.getLabel()=="X"&&b3.getLabel()=="X")||(b3.getLabel()=="X"&&b6.getLabel()=="X"&&b9.getLabel()=="X")||(b3.getLabel()=="X"&&b5.getLabel()=="X"&&b7.getLabel()=="X"))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     if((b1.getLabel()=="0"&&b2.getLabel()=="0"&&b3.getLabel()=="0")||(b3.getLabel()=="0"&&b6.getLabel()=="0"&&b9.getLabel()=="0")||(b3.getLabel()=="0"&&b5.getLabel()=="0"&&b7.getLabel()=="0"))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		     if(counter==10&&((b1.getLabel()=="X"&&b2.getLabel()=="X"&&b3.getLabel()=="X")||(b3.getLabel()=="X"&&b6.getLabel()=="X"&&b9.getLabel()=="X")||(b3.getLabel()=="X"&&b5.getLabel()=="X"&&b7.getLabel()=="X")))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     else   if(counter==10)
				{
				   t4.setText("It's  a draw");	
				}
		     

		}
		if(b4==e.getSource())
		{
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)

			{
				b4.setLabel("X");  t3.setText("Player 2 Turn");
				 if(b4.getLabel()=="X")
			    	 b4.setBackground(Color.BLUE);

			}  
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b4.setLabel("0");   t3.setText("Player 1 Turn");

		     }
		     b4.removeActionListener(this);
		     counter++;
		     if((b4.getLabel()=="X"&&b5.getLabel()=="X"&&b6.getLabel()=="X")||(b4.getLabel()=="X"&&b1.getLabel()=="X"&&b7.getLabel()=="X"))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     if((b4.getLabel()=="0"&&b5.getLabel()=="0"&&b6.getLabel()=="0")||(b4.getLabel()=="0"&&b1.getLabel()=="0"&&b7.getLabel()=="0"))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		     if(counter==10&&((b4.getLabel()=="X"&&b5.getLabel()=="X"&&b6.getLabel()=="X")||(b4.getLabel()=="X"&&b1.getLabel()=="X"&&b7.getLabel()=="X")))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     else  if(counter==10)
				{
				   t4.setText("It's  a draw");	
				}

		}
		if(b5==e.getSource())
		{
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)

			{
			
		    	 b5.setLabel("X");   t3.setText("Player 2 Turn");
		    	 if(b5.getLabel()=="X")
			    	 b5.setBackground(Color.BLUE);

			}
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b5.setLabel("0");   t3.setText("Player 1 Turn");

		     }
		     b5.removeActionListener(this);
		     counter++;
		     if(counter==10&&((b1.getLabel()=="X"&&b5.getLabel()=="X"&&b9.getLabel()=="X")||(b5.getLabel()=="X"&&b6.getLabel()=="X"&&b4.getLabel()=="X")||(b7.getLabel()=="X"&&b5.getLabel()=="X"&&b3.getLabel()=="X")||(b5.getLabel()=="X"&&b2.getLabel()=="X"&&b8.getLabel()=="X")))
		     {
		    	t4.setText("player 1 wins");  
		     }
		     if(counter==10&&((b1.getLabel()=="0"&&b5.getLabel()=="0"&&b9.getLabel()=="0")||(b5.getLabel()=="0"&&b6.getLabel()=="0"&&b4.getLabel()=="0")||(b7.getLabel()=="0"&&b5.getLabel()=="0"&&b3.getLabel()=="0")||(b5.getLabel()=="0"&&b2.getLabel()=="0"&&b8.getLabel()=="")))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		     else if(counter==10)
				{
				   t4.setText("It's  a draw");	
				}
		}
		if(b6==e.getSource())
		{
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)
			{
				b6.setLabel("X");  t3.setText("Player 2 Turn");
				 if(b6.getLabel()=="X")
			    	 b6.setBackground(Color.BLUE);

			}
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b6.setLabel("0");  t3.setText("Player 1 Turn");

		     }
		     b6.removeActionListener(this);
		     counter++;
		     if((b6.getLabel()=="X"&&b9.getLabel()=="X"&&b3.getLabel()=="X")||(b6.getLabel()=="X"&&b5.getLabel()=="X"&&b4.getLabel()=="X"))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     if((b6.getLabel()=="0"&&b9.getLabel()=="0"&&b3.getLabel()=="0")||(b6.getLabel()=="0"&&b5.getLabel()=="0"&&b4.getLabel()=="0"))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		     if(counter==10&&((b6.getLabel()=="X"&&b9.getLabel()=="X"&&b3.getLabel()=="X")||(b6.getLabel()=="X"&&b5.getLabel()=="X"&&b4.getLabel()=="X")))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     else  if(counter==10)
				{
				   t4.setText("It's  a draw");	
				}
		}
		if(b7==e.getSource())
		{
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)
			{
				b7.setLabel("X");    t3.setText("Player 2 Turn");
				 if(b7.getLabel()=="X")
			    	 b7.setBackground(Color.BLUE);
			}
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b7.setLabel("0");     t3.setText("Player 1 Turn");
		     }
		     b7.removeActionListener(this);
		     counter++;
		     if((b1.getLabel()=="X"&&b4.getLabel()=="X"&&b7.getLabel()=="X")||(b3.getLabel()=="X"&&b5.getLabel()=="X"&&b7.getLabel()=="X")||(b9.getLabel()=="X"&&b7.getLabel()=="X"&&b8.getLabel()=="X"))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		       if((b1.getLabel()=="0"&&b5.getLabel()=="0"&&b7.getLabel()=="0")||(b3.getLabel()=="0"&&b5.getLabel()=="0"&&b7.getLabel()=="0")||(b9.getLabel()=="0"&&b7.getLabel()=="0"&&b8.getLabel()=="0"))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		       if(counter==10&&((b1.getLabel()=="X"&&b4.getLabel()=="X"&&b7.getLabel()=="X")||(b3.getLabel()=="X"&&b5.getLabel()=="X"&&b7.getLabel()=="X")||(b9.getLabel()=="X"&&b7.getLabel()=="X"&&b8.getLabel()=="X")))
			     {
			    	t4.setText("player 1 wins"); 
			     }
		       else  if(counter==10)
				{
				   t4.setText("It's  a draw");	
				}
		}
		if(b8==e.getSource())
		{
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)

			{
				b8.setLabel("X");   t3.setText("Player 2 Turn");
				 if(b8.getLabel()=="X")
			    	b8.setBackground(Color.BLUE);

			}
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b8.setLabel("0");   t3.setText("Player 1 Turn");

		     }
		     b8.removeActionListener(this);
		     counter++;
		     if((b8.getLabel()=="X"&&b7.getLabel()=="X"&&b9.getLabel()=="X")||(b8.getLabel()=="X"&&b5.getLabel()=="X"&&b2.getLabel()=="X"))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     if((b8.getLabel()=="0"&&b7.getLabel()=="0"&&b9.getLabel()=="0")||(b8.getLabel()=="0"&&b5.getLabel()=="0"&&b2.getLabel()=="0"))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		     if(counter==10&&((b8.getLabel()=="X"&&b7.getLabel()=="X"&&b9.getLabel()=="X")||(b8.getLabel()=="X"&&b5.getLabel()=="X"&&b2.getLabel()=="X")))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		   
		     else if(counter==10)
			 	{
				   t4.setText("It's  a draw");	
				}

		}
		if(b9==e.getSource())
		{
		     if(counter==1||counter==3||counter==5||counter==7||counter==9)

			{
				b9.setLabel("X");  t3.setText("Player 2 Turn");
				 if(b9.getLabel()=="X")
			    	 b9.setBackground(Color.BLUE);
			}
		     if(counter==2||counter==4||counter==6||counter==8)
		     {
					b9.setLabel("0");   t3.setText("Player 1 Turn");
		     }
		     b9.removeActionListener(this);
		     counter++;
		     if((b1.getLabel()=="X"&&b5.getLabel()=="X"&&b9.getLabel()=="X")||(b9.getLabel()=="X"&&b6.getLabel()=="X"&&b3.getLabel()=="X")||(b9.getLabel()=="X"&&b7.getLabel()=="X"&&b8.getLabel()=="X"))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     if((b1.getLabel()=="0"&&b5.getLabel()=="0"&&b9.getLabel()=="0")||(b9.getLabel()=="0"&&b6.getLabel()=="0"&&b3.getLabel()=="0")||(b9.getLabel()=="0"&&b7.getLabel()=="0"&&b8.getLabel()=="0"))
		     {
		    	t4.setText("player 2 wins"); 
		     }
		     if(counter==10&&((b1.getLabel()=="X"&&b5.getLabel()=="X"&&b9.getLabel()=="X")||(b9.getLabel()=="X"&&b6.getLabel()=="X"&&b3.getLabel()=="X")||(b9.getLabel()=="X"&&b7.getLabel()=="X"&&b8.getLabel()=="X")))
		     {
		    	t4.setText("player 1 wins"); 
		     }
		     else if(counter==10)
				{
				   t4.setText("It's  a draw");	
				}
		}
	}
}

