package awtproject;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Copy extends Frame  implements ActionListener
{
   TextField t1,t2;
   Button b1;
    Copy()
    {
    setLayout(null);
      t1=new TextField(20);
      t2=new TextField(20);
      b1=new Button("copy");
       t1.setBounds(100,100,50,20);
        t2.setBounds(100,160,50,20);
        b1.setBounds(150,210,50,20);
         add(t1);
         add(t2);
         add(b1);
         b1.addActionListener(this);
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
    	if(b1==e.getSource())
    	{
          String  s=t1.getText();
          t2.setText(s);
    	}
    		 
    	 
     }
      public static void main(String args[])
      {
    	  Copy c=new Copy();
    	   c.setSize(500,500);
    	   c.setVisible(true);
    	   c.setTitle("myframe");
      }
}
  

