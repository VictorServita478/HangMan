package snippet;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Random;
import java.io.FileReader;
import java.io.IOException;

public class GameManager {

	private String path;
	private ArrayList<String> words;
	private String gameWord;
	
	
	public GameManager(String path)
	{
		setPath(path);
		loadWords(this.path);
	}
	
	public void loadWords(String path) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
			words = new ArrayList<String>();
			String holder = br.readLine();
			while(holder != null){
				/*
				 * String[] placeholder = holder.split(","); for (int i = 0; i <
				 * placeholder.length ; i++) { words.add(placeholder[i]); }
				 */
				words.add(holder);
				holder = br.readLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Looks like that path is wrong :/");
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String chooseWord() {
		Random r = new Random();
		int i = r.nextInt(words.size());
		gameWord = words.get(i);
		return gameWord;
	}
	
	public boolean checkGuess(char guess) {
		
		char[] check = gameWord.toCharArray();
		for(int i = 0; i < gameWord.length(); i++){
			if (check[i] == guess) {
				return true;
			}
		}
		return false;
	}
	
	public String rearange(String toArrange, char guess) {
		
		String returner = "";
		for(int i = 0 ; i < toArrange.length() ; i++) {
			if(gameWord.charAt(i) == guess) {
				returner = returner + guess;
			}
			else if(toArrange.charAt(i) == gameWord.charAt(i)) {
				returner = returner + toArrange.charAt(i);
			}
			else {
				returner = returner + "-";
			}
		}
		return returner;
	}

	public boolean checkWin(String checker) {
		
		return checker.equals(gameWord);
	}
	
	public boolean checkLoose(Integer guesses) {

		return guesses == 0;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
}
