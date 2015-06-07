import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

/**
 * Creates the main frame of the program.
 * @author Gustavo
 *
 */
public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Main method that runs the welcome screen
	 * @param args array of strings that the program will run
	 */
	
	public static void main(String[] args) {
		
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				
	}

	/**
	 * Create the menu frame.
	 */
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPlaynewgame = new JMenu("Play-New-Game");
		menuBar.add(mnPlaynewgame);
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		mntmNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			

				 new LoginGUI();
			}
		});
		
		
		mnPlaynewgame.add(mntmNewGame);
		
		JMenu mnFirsttime = new JMenu("First-Time-Player");
		menuBar.add(mnFirsttime);
		
		JMenuItem mntmCreateNewPlayer = new JMenuItem("Create New Player");
		
		mntmCreateNewPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			

				new CreateUser();
			}
		});
		mnFirsttime.add(mntmCreateNewPlayer);
		
		JMenu mnHistory = new JMenu("History");
		menuBar.add(mnHistory);
		
		JMenuItem mntmViewPlayers = new JMenuItem("View Stats");
		mntmViewPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			

				new StatsViewer();
			}
		});
		
		mnHistory.add(mntmViewPlayers);
		
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmGameInstructions = new JMenuItem("Game Instructions");
		mntmGameInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			

				new GameInfo();
			}
		});
		mnHelp.add(mntmGameInstructions);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);		
		JMenuItem mntmExitGame = new JMenuItem("Exit Game Menu");
		
		mntmExitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			

				System.exit(0);
			}
		});
		
		mnExit.add(mntmExitGame);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTheRollingballsGame = new JLabel("The Rolling-Balls Game");
		lblTheRollingballsGame.setBounds(146, 107, 166, 56);
		contentPane.add(lblTheRollingballsGame);
		
		JLabel lblByGustavoBravo = new JLabel("By: Gustavo Bravo");
		lblByGustavoBravo.setBounds(187, 196, 125, 25);
		contentPane.add(lblByGustavoBravo);
	}
}
