import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.swing.JOptionPane;

/**
 * Class that holds sorting methods
 * @author Gustavo
 *
 */
public class Sort {
	
/**
 * Takes data from a file and puts it inside an array list.
 * @param String filePath
 * @return ArrayList<String>
 */
	public static ArrayList<String> fileToArrayList(String filePath){
		ArrayList<String> out = new ArrayList<String>();
		FileReader file;
		
		try {
			file = new FileReader(filePath);
			
			BufferedReader r = new BufferedReader(file);
			String line;
			
			while ((line = r.readLine()) != null) {					
				out.add(line); 
			}
			r.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		return out;		
		
		
	}
	
	/**
	 * Sorts players scores from higher to lower.
	 * @param ArrayList<String>
	 * @return ArrayList<String>
	 */
	public static ArrayList<String> sortByScore(ArrayList<String> input){
		
		ArrayList<String> outputArrayList = new ArrayList<String>();
		ArrayList<Integer> sortedScores = new ArrayList<Integer>();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
				
		for( int i =0; i<= input.size()-1 ; i++){
			
					String line = input.get(i);			   
					int index1 = line.indexOf("#");
					int index2 = line.indexOf("$");									
					String score = line.substring(index1+1,index2);	
					scores.add(Integer.parseInt(score));
					
		}			
		
		Collections.sort(scores); //Ascending sort
		
		sortedScores = reverseArray(scores);//Descending sort
		
		
	for( int i = 0; i< sortedScores.size() ; i++)
		{	
				int eleComp = sortedScores.get(i);
				
				for( int j = 0; j< input.size() ; j++)
				{	
					String line1 = input.get(j);			   
					int index1 = line1.indexOf("#");
					int index2 = line1.indexOf("$");									
					String score = line1.substring(index1+1,index2);	
										
					if(score.equals(eleComp+""))
					{
						outputArrayList.add(line1);
						break;
					}
				}
		}
	
		return outputArrayList;		
		
	}
	
	/**
	 * Sorts by date the players history
	 * @param input
	 * @return
	 */
	public static ArrayList<String> sortByDate(ArrayList<String> input){
		ArrayList<String> outputArrayList = new ArrayList<String>();
		ArrayList<String> sortedDates = new ArrayList<String>();
		ArrayList<String> dates = new ArrayList<String>();
		
				
		for( int i =0; i<= input.size()-1 ; i++){
			
			String line1 = input.get(i);			   
			int index1 = line1.indexOf("$");
											
			String score = line1.substring(index1+1,line1.length());		
					dates.add(score);
					
		}			
		
		Collections.sort(dates); //Ascending sort
		
		
		for (String i : dates) {	//Descending sort
			
			sortedDates.add(0,i);
			
		}
		
		//sortedDates = Collections.reverse(dates);
		
		
	for( int i = 0; i< sortedDates.size() ; i++)
		{	
				String eleComp = sortedDates.get(i);
				
				for( int j = 0; j< input.size() ; j++)
				{	
					String line1 = input.get(j);			   
					int index1 = line1.indexOf("$");
														
					String date = line1.substring(index1+1,line1.length());	
									
					if(date.equals(eleComp))
					{
						outputArrayList.add(line1);
						break;
					}
				}
		} 
	
		return outputArrayList;	
		
	}
	
	/**
	 * Sorts by name the players history.
	 * @param ArrayList<String> 
	 * @returnArrayList<String> 
	 */
	public static ArrayList<String> sortByName(ArrayList<String> input){
		
		Collections.sort(input); 
		
		return input;		
		
				
	}
	/**
	 * Reverses the order of elements in an ArrayList<Integer>
	 * @param ArrayList<Integer>
	 * @return ArrayList<Integer>
	 */
	public static ArrayList<Integer> reverseArray(ArrayList<Integer> input){
				
		Collections.reverse(input);
					
		return input;	
		
		
		
	}
	
	/**
	 * Method to write to file a sorted ArrayList
	 * @param filePath
	 * @param sortedArray
	 */
	public static void writeToFile(String filePath, ArrayList<String> sortedArray)  {
		
		
		File file = new File(filePath);
		FileOutputStream writer;
		try {
			//Clears FILE
			writer = new FileOutputStream(file);
		
		writer.write((new String()).getBytes());
		writer.close();
						
		//Writes New Data
			PrintWriter out = new PrintWriter(new FileOutputStream(new File(filePath),true));
			
			for (String i : sortedArray) {			  	
				out.println(i);
						}	  
			out.close();	
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	
	
	
	
}
