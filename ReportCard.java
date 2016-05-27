import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Object;
import java.awt.*;
import java.io.IOException;

public class ReportCard extends JPanel implements ActionListener
{
          
      static String[] data;
      static int x;
      static int y;
      static int z = 0;
      static JLabel[] ReportC;
      static JPanel[] report; 
      static  GridLayout cLay = new GridLayout(25,1);
		static JPanel rLay;
  
   public ReportCard(String id)throws IOException
   {
         BufferedReader reader = new BufferedReader(new FileReader("report.txt"));
			data = new String[500];
			
			String temp = "";
			
			while ((temp = reader.readLine()) != null)
			{
				data[x] = temp;
            //System.out.println(data[x]);
				x++;	
         
			}
         
         rLay = new JPanel(cLay);
         
         for(int i=0; i < x; i++)
         {
            if(id.equals(data[i]))
            {
               y = i;
            }
         }
         
         
         
         ReportC = new JLabel[4];
         report = new JPanel[4];
         
         for(int i = 0; i < 4; i++)
         {
            report[i] = new JPanel();
            rLay.add(report[i]);
         }
         
         for(int i=0; i < 4; i++)
         {
            ReportC[i] = new JLabel();
            ReportC[i].setText(data[y+i]);
            report[i].add(ReportC[i]);
         }
         
         this.add(rLay);
         this.revalidate();
         this.repaint();
         
         
			
	}
   
   public void actionPerformed (ActionEvent event)
      {
                  
      }
      
     
}

