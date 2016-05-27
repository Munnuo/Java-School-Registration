import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Object;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.TextComponent;
import javax.swing.*;



public class Logout extends JPanel
{
     // private Log l = new Log();
      static JButton StudLO;
     
   
   public Logout()
   {       
      StudLO = new JButton("Logout");
      add(StudLO);
         
      StudLO.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
				
            System.out.println("You have successfully logged out!");
				/*getContentPane().removeAll();
				this.revalidate();
            //Registration2();*/
         }
      }
      );
           
           
   }
   
      
}

