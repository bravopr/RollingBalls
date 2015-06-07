import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * This Class serves as the login of the program
 * @author Gustavo
 *
 */
public class CreateUser extends JFrame
{

	JButton enterButton, guestButton, createNewUser;
	JTextField uField1;
	JPasswordField uField2;
	JLabel textLabel1, textLabel2;
	static String username, password;

	/**
	 * Constructs the GUI for the initial main window
	 */
	public CreateUser() {

		setLocation(250, 100);
		setSize(500,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setTitle("Create New User");

		setLayout(new BorderLayout());

		JLabel background=new JLabel(new ImageIcon("Images\\MainLogo.jpg"));
		JPanel panel = new JPanel();
		add(background);
		background.setLayout(new GridBagLayout());
		background.add(panel);

		textLabel1=new JLabel("Username: ");
		uField1 = new JTextField();

		username = uField1.getText();



		uField1.setPreferredSize(new Dimension(100, 20));
		textLabel2=new JLabel("Password: ");
		uField2 = new JPasswordField();
		password = uField2.getText();

		uField2.setPreferredSize(new Dimension(100, 20));
	
		createNewUser = new JButton("Create New User");

		createNewUser.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				username = uField1.getText();
				password = uField2.getText();
				
		
		
		
				try {			
					
					if(repUser(username))
					{					
					writeUserFile(username, password, Date.getDate());
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid User!");	
					}
					
					
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				uField1.setText("");
				uField2.setText("");
		
					}
				
			
		});

		panel.add(textLabel1);
		panel.add(uField1);
		panel.add(textLabel2);
		panel.add(uField2);
		panel.add(createNewUser);

		setVisible(true);
	}

	/**
	 * Creates a new User with given username and password
	 * @param username String containing the desired username for the User
	 * @param password String containing the desired password for the User
	 * @throws IOException
	 */
	public void writeUserFile(String username, String password, String date) throws IOException {
		
		
		
		
		
		if(password == null || username == null || password.equals("") || username.equals("") || password.equals(" ") || username.equals(" ") || username.equals("  ") || password.equals("  ") || username.equals("#")|| password.equals("#"))
		{			
				JOptionPane.showMessageDialog(null, "Invalid Parameter!");			
		}
		
		else
		{

		PrintWriter out = new PrintWriter(new FileOutputStream(new File("UserInformation//UserInfo.txt"),true));
		PrintWriter out2 = new PrintWriter(new FileOutputStream(new File("UserInformation//UserCreateDate.txt"),true));
		PrintWriter out3 = new PrintWriter(new FileOutputStream(new File("UserInformation//Scores.txt"),true));
		out.println(username + "#" + password);	  
		out2.println(username + "#" + date);
		out3.println(username+"#"+"0"+"$"+date);
		out.close();
		out2.close();
		out3.close();
		

		JOptionPane.showMessageDialog(null, "User Created !");
		dispose();
		}
	}
/**
 * Checks if that username is already taken.
 * @param userin
 * @return boolean
 * @throws IOException
 */
	public boolean repUser(String userin) throws IOException{
			
				boolean write2File = true;				
				
				FileReader file = new FileReader("UserInformation//Scores.txt");
				ArrayList<String> usernames = new ArrayList<String>();
				BufferedReader r = new BufferedReader(file);
				String line;
				
				while ((line = r.readLine()) != null) {
				  
					int index1 = line.indexOf("#");
					String user = line.substring(0,index1);
					usernames.add(user);
				}
				r.close();
				
				for (String arrayElement : usernames) {	
					
					if(userin.equals(arrayElement)){
						write2File = false;
					}					
					
				}
								
				return write2File;	
	}	
	
	
}