import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JTextArea;
import javax.swing.JLabel;

/**
 * Stores the game instructions
 * @author Gustavo
 *
 */
public class GameInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Creates the game instructions frame
	 */
	public GameInfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		setResizable(false);
		setTitle("Game Information");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrInfo = new JTextArea();
		txtrInfo.setText("Each player will be assigned an initial score of 0, and an initial accumulated distance of 1500. "
				+ "\n"+"The objective is for a player to be able to destroy all the balls corresponding to the opponent player and "
				+"\n"+"to remain alive at the end of the game."
				+"\n"+"If both player happen to lose all their balls at the same moment "
				+"\n"+"while the game is played, the one having a greater distance left wins."
				+"\n"+"In that case, if both players end with the equal distance left, then the game is declared a tie."
				+"\n"+"A game also ends when one of the players consumes all his/her"
				+"\n"+"accumulated distance while the other still has balls available."
				+"\n"+"In that case, the player still alive adds, to his/her accumulated distance left,"
				+"\n"+"an amount equal to the accumulated distance left to the player that vanished."
				+"\n"+"At the end of a game, the score that each player gets is the corresponding accumulated distance left."
				+"\n"+""
				+"\n"+"Players will alternate playing. The first player to play will be Player 1."
				+"\n"+"At any moment, the current player’s button to shoot will be surrounded by a black border. "
				+"\n"+"At his/her turn, the player will select a ball to roll."
				+"\n"+"This is done by a mouse click on the selected ball. At this moment, mouse clicks will have effect"
				+"\n"+"only on balls belonging to the current player. Then the selected ball will be surrounded by a black ring "
				+"\n"+"along its circumference. At that moment, the system will show a small window with two drop-down lists, "
				+"\n"+"one having label 'Direction' and the other  with label 'Distance'. If the user clicks the one labeled "
				+"\n"+"'Direction', then the system will allow the user to pick a value from a list of values in the range 0..359. "
				+"\n"+"The other will allow to select an integer value in the range  [1, m), where m is the total remaining "
				+"\n"+"distance for the player. "
				+"\n"+"After the selection process is completed, the program will allow the player to shoot. "
				+"\n"+"As a ball rolls, different things happen when it collides with other balls, with obstacles, with "
				+"\n"+"mines, with happy faces or with the boundaries of the game area. "
				);
		txtrInfo.setEditable(false);
		JScrollPane sp = new JScrollPane(txtrInfo);
		sp.setBounds(10,40,680,300);
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		txtrInfo.setBounds(128, 160, 121, 22);
		getContentPane().add(sp);
		
		JLabel lblGameInformation = new JLabel("Game Instructions:");
		lblGameInformation.setBounds(56, 15, 136, 14);
		contentPane.add(lblGameInformation);
		setVisible(true);
	}
}
