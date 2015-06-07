import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This Class serves as the login of the program
 * @author Gustavo
 *
 */
public class LoginGUI extends JFrame
{

	JButton enterButton;
	JTextField uField1, uField2;
	JPasswordField pField1, pField2;
	JLabel textLabel1, textLabel2, textLabel3, textLabel4;
	static String username1, password1, username2, password2;

	/**
	 * Constructs the GUI for the initial main window
	 */
	public LoginGUI() {

		setLocation(250, 100);
		setSize(700,450);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setTitle("Login");

		setLayout(new BorderLayout());

		JLabel background=new JLabel(new ImageIcon("Images\\MainLogo.jpg"));
		JPanel panel = new JPanel();
		add(background);
		background.setLayout(new GridBagLayout());
		background.add(panel);
		//Username 1
		textLabel1=new JLabel("Usernames: ");
		uField1 = new JTextField();
		username1 = uField1.getText();
		//Username 2
		uField2 = new JTextField();
		username2 = uField2.getText();
		
		uField1.setPreferredSize(new Dimension(100, 20));
		uField2.setPreferredSize(new Dimension(100, 20));

		//Password 1			
		textLabel2=new JLabel("Passwords: ");
		pField1 = new JPasswordField();
		password1 = pField1.getText();
		
		pField2 = new JPasswordField();
		password2 = pField1.getText();
		

		pField1.setPreferredSize(new Dimension(100, 20));
		pField2.setPreferredSize(new Dimension(100, 20));
		
		enterButton=new JButton("Enter Game");
		

		enterButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				File file = new File("UserInformation//UserInfo.txt");
				//Search for first user
				String usernameInput = uField1.getText();
				String passInput = pField1.getText();
				String searchFor = usernameInput+"#"+passInput;
				
				//Search for second user
				String usernameInput2 = uField2.getText();
				String passInput2 = pField2.getText();
				String searchFor2 = usernameInput+"#"+passInput;

				Scanner scanner;
				try {
					scanner = new Scanner(file);

					ArrayList<String> list=new ArrayList<>();
					while(scanner.hasNextLine()){
						list.add(scanner.nextLine()); 

					}

					if(list.contains(searchFor) && list.contains(searchFor2)){

						// found.

						GameBalls frame = new GameBalls(10);
						frame.setVisible(true);
						dispose();

					}else{
						// not found

						JOptionPane.showMessageDialog(null, "Incorrect User or Password");


					}
					scanner.close();

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}


			}
		});

		

		panel.add(textLabel1);
		panel.add(uField1);//User1
		panel.add(uField2);//User2
		panel.add(textLabel2);
		panel.add(pField1);//Password1		
		panel.add(pField2);//Password2
		
		panel.add(enterButton);
		setVisible(true);
	}



	
}