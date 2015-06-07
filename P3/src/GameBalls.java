import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Creates the game frame
 * @author Gustavo
 *
 */
public class GameBalls extends JFrame {

	private JPanel contentPane;
	private Ball[] balls;
	

	/**
	 * Create the game frame.
	 */
	public GameBalls(int number) {
	/*	try {
			storeScore("test",1000,Date.getDate());
			storeScore("test2",900,Date.getDate());
			storeScore("test3",1000,Date.getDate());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		setVisible(true);
		balls = new Ball[number];
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGameSettings = new JMenu("Game Settings");
		menuBar.add(mnGameSettings);
		
		JMenuItem mntmResetGame = new JMenuItem("Reset Game");
		mnGameSettings.add(mntmResetGame);
		
		JMenu mnExit = new JMenu("Exit");		
		menuBar.add(mnExit);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			

				 dispose();
			}
		});
		mnExit.add(mntmExit);
		
		JMenuItem mntmSaveExit = new JMenuItem("Save & Exit");		
		mntmSaveExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
			/*		try {
				storeScore("user1",500,Date.getDate());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
				JOptionPane.showMessageDialog(null, "Game Data Saved!");
				 dispose();
			}
		});
		mnExit.add(mntmSaveExit);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	//}

	//public nextTurn(){
		
	}
/**
 * Stores the score of users when the game is over.
 * @param username
 * @param score
 * @param date
 * @throws IOException
 */
public void storeScore(String username, int score, String date) throws IOException {
		
		PrintWriter out = new PrintWriter(new FileOutputStream(new File("UserInformation//Scores.txt"),true));
		out.println(username + "#" + score+"$"+date);	  
		out.close();	

		JOptionPane.showMessageDialog(null, "Game Data Saved!");
		dispose();
		}
	
	
	
}
