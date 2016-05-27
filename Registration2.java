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



public class Registration2 extends JFrame implements ActionListener
{
   JPanel mypanel; /* This is the panel used for the beginning page to set the layout of that page. */
	
   static JPanel createP; /* This is the panel used for the create a profile page to set the layout of the page*/
	
   static JPanel loginP; /* This is the panel used for the login page to set the layout of the page. */
   
   JButton login; /* This is the button at the beginning page that leads to the login page. */
	
   JButton create; /* This is the button at the beginning page that leads to the create a profile page. */
	
   JButton submit; /* This button is located on the create a profile page, it is the submit button to create a profile */
	
   JButton confirm; /* This is the display button on the login page leading to the page that display the profile information if
							  the login information is correct. */
							  
   JButton back1; /* This is the back button located in the create a profile page that leads back to the beginning page. */ 
	
   JButton back2; /* This is the back button located on the login page that leads to the beginning page. */
	
   JButton cont; /* This is the button located on the profile created successfully page that leads to the beginning page. */
   
   static JPanel studentP; /* Panel used to set the layout of the student page after a successful login. */
	
   static JButton cont2;
   
   JLabel mylabel;
   static JLabel message;
   
   JLabel nameL;
   static JTextField nameBox;
   JLabel genderL;
   static JTextField genderBox;
   JLabel phoneL;
   static JTextField phoneBox;
   JLabel schoolL;
   static JTextField schoolBox;
   JLabel usernameL;
   static JTextField usernameBox;
   JLabel passwordL;
   static JPasswordField passwordBox;
  
   static JComboBox comboBox;
   
   JLabel loginUL;
   JTextField loginUBox;
   JLabel loginPL;
   JPasswordField loginPBox;
   
   
   JLabel error; //label used to display error message on the login menu
   
   static JLabel miss;
   static JLabel miss2;
   
   JLabel loginNL;
   JLabel loginGL;
   JLabel loginPhL;
   JLabel loginSL;
   JLabel loginOL;
   
   JPanel layout1;
   JPanel layout2;
   JPanel layout3;
   JPanel layout4;
   JPanel layout5;
   JPanel layout6;
   static JPanel layout7;
   static JPanel layout8;
   static JPanel layout9;
   static JPanel layout10;
   static JPanel layout11;
   static JPanel layout12;
   static JPanel layout13;
   static JPanel layout14;
   static JPanel layout15;
   static JPanel layout16;
	static JPanel layoutBox;
	static Registration2 first;
   
   JPanel one1;
   JPanel two2;
   JPanel three3;
   JPanel four4;
   JPanel five5;
   JPanel six6;
   JPanel display;
   
   static JTabbedPane sPane;
   
   

   static FlowLayout info = new FlowLayout(FlowLayout.LEADING);
   FlowLayout info2 = new FlowLayout(FlowLayout.CENTER);
   
   static String checker1 = "";
   static String checker2, checker3, checker4, checker5, checker6, checker7;
   static String id;
   static String[] data; 
	static String[] rData;
   static int x = 0;
   static int rCount = 0;
      
   public static void main(String[] args)throws IOException
   {
      
      BufferedReader accounts = new BufferedReader(new FileReader("accounts.txt"));
      //BufferedReader reports = new BufferedReader(new FileReader("Report.txt"));
      data = new String[204];
		rData = new String[204];
      
      String temp = "";
      
      while((temp = accounts.readLine())!= null)
      {
         data[x] = temp;
         x++;
      }
      
      /*
      while((temp = reports.readLine())!= null)
      {
         rData[rCount] = temp;
         rCount++;
         
      }
      */
      
      
      
      Registration2 first = new Registration2();
      first.setTitle("MVSU Sutton");
      first.setSize(300,300);
      first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      first.setVisible(true);
      
      
   }
   
   public Registration2()throws IOException
   {
		/*
			Each info variable is a FlowLayout. It is predefined to have a specific alignment;
			info is leading aligned, info2 is centered aligned. These calls set vertical and 
			horizontal space in the layout. 
		*/
      info.setVgap(25);
      info.setHgap(50);
      info2.setVgap(25);
      info2.setHgap(50);
		
      
		/*
			The following layout variables are all JPanels that are used for layout purposes. They
			set the layout of each page by places objects in the panels then placing the panels inside of
			other panels. All the panels are not used on the same page but they are all used the exact same
			way. 
		*/
      mypanel = new JPanel(info2);
      layout1 = new JPanel();
      layout2 = new JPanel();
      layout3 = new JPanel();
      layout4 = new JPanel();
      layout5 = new JPanel();
      layout6 = new JPanel();
      layout7 = new JPanel();
      layout8 = new JPanel();
      layout9 = new JPanel();
      layout10 = new JPanel();
      layout11 = new JPanel();
      layout12 = new JPanel();
      layout13 = new JPanel();
      layout14 = new JPanel();
      layout15 = new JPanel();
      layout16 = new JPanel();
		layoutBox = new JPanel(); //the layout panel for the JComboBox.
      
		/*
			The following numbered variables are also JPanels. They are all used on the display page of the
			registration system and are placed in order to layout the information on that page with a specific
			format. 
		*/
		
      one1 = new JPanel();
      two2 = new JPanel();
      three3 = new JPanel();
      four4 = new JPanel();
      five5 = new JPanel();
      six6 = new JPanel();
      display = new JPanel(new GridLayout(0, 1));
		
		String[] items = new String[] {"Student", "Professor"}; //Drop Down strings
		comboBox = new JComboBox(items); // The drop down box with the strings stored in items as selections
      
      
      create = new JButton("Create Profile");
      create.addActionListener(this);
      
      login = new JButton("Log In");
      login.addActionListener(this);
      
      submit = new JButton("Submit");
      submit.addActionListener(this);
      
      confirm = new JButton("Login");
      confirm.addActionListener(this);
      
      back1 = new JButton("Back");
      back1.addActionListener(this);
      
      back2 = new JButton("Back");
      back2.addActionListener(this);
      
      cont = new JButton("Continue");
      cont.addActionListener(this);
      
      cont2 = new JButton("Contine");
      cont2.addActionListener(this);
      
      mylabel = new JLabel("Welcome to MVSU!");
      
      createP = new JPanel();
     
      loginP = new JPanel();
      
      message = new JLabel("Profile Successfully Created!");
      
         
      nameBox = new JTextField(16);
      nameBox.addActionListener(this);
      genderBox = new JTextField(16);
      genderBox.addActionListener(this);
      phoneBox = new JTextField(16);
      phoneBox.addActionListener(this);
      schoolBox = new JTextField(16);
      schoolBox.addActionListener(this);
      usernameBox = new JTextField(16);
      usernameBox.addActionListener(this);
      passwordBox = new JPasswordField(16);
      passwordBox.addActionListener(this);
      
      loginUBox = new JTextField(16);
      loginUBox.addActionListener(this);
      loginUBox.setText("");
      
      loginPBox = new JPasswordField(16);
      loginPBox.addActionListener(this);
         
      nameL = new JLabel();
      genderL = new JLabel();
      phoneL = new JLabel();
      schoolL = new JLabel();
      usernameL = new JLabel();
      passwordL = new JLabel();
      
      loginUL = new JLabel("Username: ");
      loginPL = new JLabel("Password: ");
      
      loginNL = new JLabel();
      loginGL = new JLabel();
      loginPhL = new JLabel();
      loginSL = new JLabel();
      loginOL = new JLabel();
      error = new JLabel();
      miss = new JLabel();
      miss2 = new JLabel();
      
      
      nameL.setText("Name: ");
      genderL.setText("Gender: ");
      phoneL.setText("ID #: ");
      schoolL.setText("Class: ");
      usernameL.setText("Username: ");
      passwordL.setText("Password: ");
         
      layout1.add(mylabel);
      layout2.add(create);
      layout2.add(login);
      
      mypanel.add(layout1);
      mypanel.add(layout2);
      
      layout3.add(loginUL);
      layout3.add(loginUBox);
      layout4.add(loginPL);
      layout4.add(loginPBox);
      layout6.add(error);
      layout5.add(back2);
      layout5.add(confirm);
      
      layout7.add(nameL);
      layout7.add(nameBox);
      layout8.add(genderL);
      layout8.add(genderBox);
      layout9.add(phoneL);
      layout9.add(phoneBox);
      layout10.add(schoolL);
      layout10.add(schoolBox);
      layout11.add(usernameL);
      layout11.add(usernameBox);
      layout12.add(passwordL);
      layout12.add(passwordBox);
      layout13.add(back1);
      layout13.add(submit);
      layout14.add(miss);
      layout14.add(miss2);
      layout15.add(message);
      layout16.add(cont2);
		layoutBox.add(comboBox);
      
      display.add(one1);
      display.add(two2);
      display.add(three3);
      display.add(four4);
      display.add(six6);
      display.add(five5);
      

      
      this.add(mypanel);
   
   }
   
   
   
   public void actionPerformed(ActionEvent event)
   {
      
      if(event.getSource() == create)
      {
         
         this.remove(mypanel);
         
         createP.add(layout7);
         createP.add(layout8);
         createP.add(layout9);
         createP.add(layout10);
         createP.add(layout11);
         createP.add(layout12);
         createP.add(comboBox); //Add dropdown box
         createP.add(layout14);
         createP.add(layout13);
         
         
         this.add(createP); 
         
         nameL.setText("Name        : ");
         genderL.setText("Major    : ");
         phoneL.setText("ID #       : ");
         schoolL.setText("Class     : ");
         usernameL.setText("Username: ");
         passwordL.setText("Password: ");
         
 
         this.revalidate();
         createP.repaint();
    
      }
      else if(event.getSource() == login)
      {
         this.remove(mypanel);
         login.updateUI();
         
         loginP.add(layout3);
         loginP.add(layout4);
         loginP.add(layout5);
         loginP.add(layout6);
         
         this.add(loginP);
         
         usernameL.setText("Username: ");
         passwordL.setText("Password: ");
                  
			this.revalidate();
         
         loginP.repaint();
      }
      else if(event.getSource()== submit)
      {
         
         try
         {
           
            createProfile();
           
               
         } catch (Exception ex) { ex.printStackTrace(); }            
         
         this.revalidate();
         createP.repaint();
         
      }
      else if(event.getSource() == confirm)
      {
			String check = null;
			String u, p;
			
			u = loginUBox.getText();
			p = loginPBox.getText();
		                     
			int t = 0;
			if(comparison(u,data))
			{
				check = data[(comp(u, data, t))+1];
				
				if(p.equals(decrypt(check)))
				{
               id = data[(comp(u,data, t))+4];
               System.out.println(id);
					try
					{
						type();
					} catch (Exception ex){ex.printStackTrace();}
				}
				else
				{
					error.setText("Incorrect password");
				}
			}
			else
			{
				error.setText("Username doesn't exist");
			}
         //displayProfile();
			this.revalidate();
         loginP.repaint();
      }
      else if(event.getSource() == back1)
      {
         miss.setText(null);
         usernameBox.setText(null);
         passwordBox.setText(null);
         nameBox.setText(null);
         genderBox.setText(null);
         phoneBox.setText(null);
         schoolBox.setText(null);
         this.remove(createP);
         
         this.add(mypanel);
         
         mylabel.setText("Welcome to MVSU!");
			
			this.revalidate();
         mypanel.repaint();
      }
      else if(event.getSource() == back2)
      {
         error.setText(null);
         loginPBox.setText(null);
         loginUBox.setText(null);
         this.remove(loginP);
         
         this.add(mypanel);
         
         mylabel.setText("Welcome to MVSU!");
			
			this.revalidate();
         mypanel.repaint();
      }
      else if(event.getSource() == cont)
      {
         loginP.remove(display);
         loginNL.setText(null);
         loginGL.setText(null);
         loginPhL.setText(null);
         loginSL.setText(null);
         loginOL.setText(null);
         
         loginPBox.setText(null);
         loginUBox.setText(null);
         
         
            
         this.remove(loginP);
         
         this.add(mypanel);
         
         mylabel.setText("Welcome to MVSU!");
			
			this.revalidate();
         mypanel.repaint();
      }
      else if(event.getSource() == cont2)
      {
         createP.remove(layout15);
         createP.remove(layout16);
         miss.setText(null);
         usernameBox.setText(null);
         passwordBox.setText(null);
         nameBox.setText(null);
         genderBox.setText(null);
         phoneBox.setText(null);
         schoolBox.setText(null);
         
         this.remove(createP);
         
         this.add(mypanel);
         
         mylabel.setText("Welcome  to MVSU!");
			
			this.revalidate();
         mypanel.repaint();
      }
   }

   
   public static void createProfile()throws IOException
   {
      
      String name, major, id, cl, username, password, option;
      String check1 = "", check2 = "";
      
      
      name = nameBox.getText();
      
      major = genderBox.getText();
      
      id = phoneBox.getText();
      
      cl = schoolBox.getText();
      
      username = usernameBox.getText();
      
      password = passwordBox.getText();
      
      option = (String)comboBox.getSelectedItem();
      
      
     
      
      
      
         
         while((comparison(username, data))||(username.length() < 8)||(((username.charAt(0) < (char)(65))||(username.charAt(0) > (char)(122)))||
                    ((username.charAt(0) > (char)(90))&&(username.charAt(0) < (char)(97)))))
         {
            if(comparison(username, data))
            {
               miss.setText("Username Taken");
            }
            if(username.length() < 8)
            {
               miss.setText("Username Short");
            }
            if(((username.charAt(0) < (char)(65))||(username.charAt(0) > (char)(122)))||
                    ((username.charAt(0) > (char)(90))&&(username.charAt(0) < (char)(97))))
            {
               miss.setText("Username invalid");
            }       
            
          }
          check1 = username;
          
          
       
    password = passwordBox.getText();
   
    if((password.length() < 7)||(((password.charAt(0) >= (char)(48))&&(password.charAt(0) <= (char)(57)))))
    {
      if(password.length() < 7)
      {
         miss2.setText("Password short: ");
      }
      
      else if(((password.charAt(0) >= (char)(48))&&(password.charAt(0) <= (char)(57))))
      {
         miss2.setText("password invalid: ");
        
      }
      
      password = passwordBox.getText();
    }
    else 
      check2 = password;
      
    if(check1.equals(username)&&check2.equals(password))
    {
       checker1 = encrypt(encrypt(username));
       checker2 = encrypt(password);
       checker3 = name;
       checker4 = major;
       checker5 = id;
       checker6 = cl;
       checker7 = option;
       
       store();
    }
   
   }
   
   /*
   public void displayProfile()
   {
      
      String name, gender, phone, school, username, inputPassword, correctP, option;
      String check = "";
      int z = 0;
      
      correctP = null;
      name = null;
      phone = null;
      gender = null;
      school = null;
      option = null;
      
      
      username = loginUBox.getText();
      
      inputPassword = loginPBox.getText();     
      

      if(comparison(username, data))
      {
          
        correctP = data[(comp(username, data, z))+1]; 
        name = data[(comp(username, data, z))+2];
        gender = data[(comp(username, data, z))+3];
        phone = data[(comp(username, data, z))+4];
        school = data[(comp(username, data, z))+5];
        option = data[(comp(username, data, z))+6];
        
        check = correctP;
      }
      else
      {
         error.setText("Username doesn't exist");
      }
            
           
      
      if(check.equals(correctP))
      {
         if(inputPassword.equals(decrypt(correctP)))
         {
            
            
            
            loginNL.setText(name);
            loginGL.setText(gender);
            loginPhL.setText(phone);
            loginSL.setText(school);
            loginOL.setText(option);
            
            loginP.remove(layout3);
            loginP.remove(layout4);
            loginP.remove(layout5);
            loginP.remove(layout6);
   
        
            
            
            one1.add(loginNL);
            two2.add(loginGL);
            three3.add(loginPhL);
            four4.add(loginSL);
            six6.add(loginOL);
            five5.add(cont);
            
            
            loginP.add(display);
            loginP.setLayout(info);
            
            
         }
         else if( inputPassword.equals(correctP) == false )
         {
            error.setText("password incorrect");
         }
      }
      
      
   }
   */
   
   
	/*
		This store() function is used to store data inside the profile text file.
		It is called after the user has a successful attempt at creating a profile.
		It collects the data the user entered into the system and stores it inside
		the text file. It also moves the system to the "profile created successfully"
		page. 
	*/
	
   public static void store()throws IOException
   {
      data[x] = checker1;
      x++;
      data[x] = checker2;
      x++;
      data[x] = checker3;
      x++;
      data[x] = checker4;
      x++;
      data[x] = checker5;
      x++;
      data[x] = checker6;
      x++;
      data[x] = checker7;
      x++;
      
      createP.remove(layout7);
      createP.remove(layout8);
      createP.remove(layout9);
      createP.remove(layout10);
      createP.remove(layout11);
      createP.remove(layout12);
      createP.remove(layout13);
      createP.remove(layout14);
     	createP.remove(comboBox);
      
      createP.add(layout15);
      createP.add(layout16);
      createP.setLayout(info);
      
      createP.revalidate();
      createP.repaint();
      
      PrintWriter writer = new PrintWriter(new FileWriter("accounts.txt",false));
      //PrintWriter rep = new PrintWriter(new FileWriter("report.txt", true));
      
      for(int l = 0; l < 204; l+=7)
      {  
         String valid = data[l];
         if(valid == null)
         {
            
         }
         else
         {
            writer.println(data[l]);
            //rep.println(data[l+4]);
            
            writer.println(data[l+1]);
            //rep.println(data[l]);
            
            writer.println(data[l+2]);
            //rep.println(data[l+5]);
            
            writer.println(data[l+3]);
            //rep.println(data[l+3]);
           
            writer.println(data[l+4]);
           
            writer.println(data[l+5]);
            
            writer.println(data[l+6]);
         }
         
      } 
  
       writer.close();
       //rep.close();
   }


	/*
		The comparison functions takes in the username that the users inputs and the entire
		database of the registration system and compares the inputted username to the database to check
		to see if the username exist in the database. If so it returns the condition 'true', if not
		the it returns false. 
	*/
   
   public static boolean comparison(String username, String[] data)
   {
      boolean flag = false;
      for(int z = 0; z < 204; z++)
      {
         if(encrypt(encrypt(username)).equals(data[z]))
         {
            flag = true;
         }
      }
      
      return flag;
   }
	
	/*
		The comp function takes in the username that the user inputs, the entire database of the
		registration system and creates an int y which stores the subscript of the first line of data needed
		from the database. It goes through the database to find the username the user inputs and then
		stores the subscript of that line in the int y. The comp function then returns y. 
	*/
   
   public int comp(String username, String[] data, int y)
   {
      
      boolean flag = false;
      for(int z = 0; z < 204; z++)
      {
         if(encrypt(encrypt(username)).equals(data[z]))
         {
            flag = true;
            y = z;
         }
      }
      
      return y;
   }
	
	/*
		the type() function is used to check to see what type of user is logging into the
		registration system. 
	*/
	public void type()throws IOException
	{
		int n = 0;
      if(data[comp(loginUBox.getText(),data,n)+6].equals("Student"))
		{
			student();
		}
		if(data[comp(loginUBox.getText(),data,n)+6].equals("Professor"))
		{
			System.out.println("Professor");
		}
	}
	
	/*
	   The student function is used to set up the student portal after a student account
      has successfully logged into the system. It adds tabs for the necessary options the
      student account is capable of accessing and has a log out button storing the 
      student information safely back into the database. 
	
	*/
	
	public void student()throws IOException
	{
		this.remove(loginP);
      
      JPanel studentP = new JPanel(); //panel used to display the tabs in the student page.	

   	JTabbedPane sPane = new JTabbedPane(); //the tabbed panes for the student login. 
      
      studentP.add(sPane);
    
   	sPane.addTab("View Report Card", new ReportCard(id));
   	sPane.addTab("View Course Catalog", new CourseCatalog());
   	sPane.addTab("Register", new Register(id));
		sPane.addTab("Current Schedule", new Schedule());
    	sPane.addTab("Logout", new Logout());
    
   	this.add(studentP);
   	this.setSize(1000,400);
		studentP.revalidate();
      this.revalidate();
      this.repaint();
      studentP.repaint();
	}
   
	
	/*
		The encrypt function is used to change the username and password of a 
		user account into text that cannot be easily recognized if the text file
		was to be compromised. It is used for security purposes. 
	*/
   public static String encrypt(String username) 
   {
		char chars[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','!','@','#','$','%','^','&','(',')','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','+','-','*','/','[',']','{','}','=','<','>','?','_'};
	   
	   String cipher = null;
		char[] plain = username.toCharArray(); 
		    
		for(int i = 0;i<plain.length;i++)
      {
		   for(int j = 0 ; j<85;j++)
         {
		      if(j<=80)
            {
		         if(plain[i]==chars[j])
               {
		            plain[i] = chars[j+5];
		            break;
		         }  
		      }
		      else if(plain[i] == chars[j])
            {
		         plain[i] = chars [j-81];
		      }  
		    } 
		} 
		cipher = String.valueOf(plain);
	   
		return cipher; 
	  
   }
   
	
	/*
		The decrpyt function is used to decrpyt the information found in the text file
		as it was stored in the text file encrypted for safety purposed. This function is
		useful for security purposes mainly. 
	*/
   public static String decrypt(String username) 
   {
		char chars[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','!','@','#','$','%','^','&','(',')','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','+','-','*','/','[',']','{','}','=','<','>','?','_'};
      
	   String cipher = null;
      
	   char[] cipher1 = username.toCharArray();
	        
      for(int i = 0;i<cipher1.length;i++)
      {
         for(int j = 0 ; j<85;j++)
         {
            if(j>=5 && cipher1[i]==chars[j])
            {
               cipher1[i] = chars[j-5];
               break;
            }
            if(cipher1[i] == chars[j] && j<5)
            {
             
               cipher1[i] = chars[81+j];
               break;
            } 
         } 
      } 
   
      cipher=String.valueOf(cipher1);
		return cipher;
   }

   
}
   