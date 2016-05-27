import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Object;
import java.awt.*;
import java.io.IOException;
import javax.swing.BoxLayout;



public class CourseCatalog extends JPanel implements ActionListener
{
      
		static String[] data;
		static int x = 0;
		static int y = 0;
		static JPanel[] courses;
		static JLabel[][] course;
		static Container cPan;
		static  BoxLayout cLay;//= new BoxLayout(,BoxLayout.Y_);
		
		
   
   public CourseCatalog()throws IOException
   {		
   	BufferedReader reader = new BufferedReader(new FileReader("catalog.txt"));
		data = new String[500];
			
		String temp = "";
			
		while ((temp = reader.readLine()) != null)
		{
			data[x] = temp;
			x++;	
		}
			
		courses = new JPanel[x/3];
		course = new JLabel[x/3][3];
			
		cPan = new Container();	
			
		for(int i=0; i < x/3; i++)
		{
			for(int j=0; j < 3; j++)
			{
				if(!data[y].equals(null))
				{
					course[i][j] = new JLabel();
					course[i][j].setText(data[y]);
					y++;
				}
			}
		}
		
		for(int i = 0; i < x/3; i++)
		{
			courses[i] = new JPanel();
			for(int j = 0; j < 3; j++)
			{
				courses[i].add(course[i][j]);
			}
			cPan.add(courses[i]);
		}
		
		cPan.setLayout(new BoxLayout(cPan,BoxLayout.Y_AXIS));
		this.add(cPan);
		this.revalidate();
		cPan.repaint();
	
	}
		
   
   public void actionPerformed (ActionEvent event)
      {
                  
      }
      
      
}

