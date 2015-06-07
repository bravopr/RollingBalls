import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

/**
 * Class that holds the players statistics.
 * @author Gustavo
 *
 */
public class StatsViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the statistics frame.
	 */
	public StatsViewer() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 331, 346);
		setResizable(false);
		setTitle("Players Statistics");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextArea UsersList = new JTextArea();
		
		//Users Display	
			FileReader file;
			
			try {
				
				
				file = new FileReader("UserInformation//Scores.txt");
				
				BufferedReader r = new BufferedReader(file);
				String line;
				UsersList.append("User: "+"Score: "+"Date: "+"\n");
				while ((line = r.readLine()) != null) {
				  
					int index1 = line.indexOf("#");
					int index2 = line.indexOf("$");
					String user = line.substring(0,index1);					
					String score = line.substring(index1+1,index2);	
					String date = line.substring(index2+1,line.length());	
					UsersList.append(user+"  "+score+"  "+date+"\n"); 
				}
				r.close();
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			UsersList.setBounds(30, 42, 103, 394);
			UsersList.setFocusable(false);
			contentPane.add(UsersList);
		
		JScrollPane sp = new JScrollPane(UsersList);
		sp.setBounds(10,40,300,200);
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		getContentPane().add(sp);
		
		JLabel lblPlayers = new JLabel("Players :");
		lblPlayers.setBounds(56, 15, 136, 14);
		contentPane.add(lblPlayers);
		
		JLabel lblSortBy = new JLabel("Sort By:");
		lblSortBy.setBounds(20, 251, 60, 14);
		contentPane.add(lblSortBy);
		
		JButton btnUsername = new JButton("Username");
		btnUsername.setBounds(10, 276, 97, 23);
		btnUsername.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				Sort.writeToFile("UserInformation//Scores.txt", Sort.sortByName(Sort.fileToArrayList("UserInformation//Scores.txt"))); //Sorts By Players
				dispose();
								
				new StatsViewer();				
			}
		});
		contentPane.add(btnUsername);
		
		JButton btnScores = new JButton("Scores");
		btnScores.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				Sort.writeToFile("UserInformation//Scores.txt", Sort.sortByScore(Sort.fileToArrayList("UserInformation//Scores.txt"))); //Sorts By Players
				dispose();
				new StatsViewer();				
			}
		});
		btnScores.setBounds(117, 276, 89, 23);
		contentPane.add(btnScores);
		
		JButton btnDate = new JButton("Date");
		btnDate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				Sort.writeToFile("UserInformation//Scores.txt", Sort.sortByDate(Sort.fileToArrayList("UserInformation//Scores.txt"))); //Sorts By Players
				dispose();
				
				
				
				new StatsViewer();				
			}
		});		
		btnDate.setBounds(216, 276, 89, 23);
		contentPane.add(btnDate);
		
		JButton btnDeleteAllPlayers = new JButton("Delete All Players");
		btnDeleteAllPlayers.setBounds(129, 6, 141, 23);
		btnDeleteAllPlayers.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//Clears FILE
				File file = new File("UserInformation//UserInfo.txt");
				FileOutputStream writer;
				try {
					writer = new FileOutputStream(file);
				
				writer.write((new String()).getBytes());
				writer.close();
				dispose();
				new StatsViewer();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	//	contentPane.add(btnDeleteAllPlayers);
		setVisible(true);
	}
}
