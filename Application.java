import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		/*
		 * gives us access to our file in our java program
		 */
		
		Scanner words = new Scanner(new File("DictionaryWordValuePairs.txt"));
		
		/*
		 * a while loop for as long as our flie has a word in it it will add our words and the corresponding keys
		 */
		while (words.hasNextLine()) {
			String s = words.nextLine();
			String[] pair = s.split("\t");
			hashMap.put(pair[0], pair[1]);
		}
		
		/*
		 * prints our hashMap
		 */
		System.out.println(hashMap);
		
		/*
		 * prints our words, keys, and hashcodes
		 */
		System.out.println("the definition for the word meat is:"+ " "+ hashMap.get("meat") + ", " + "the hashCode for meat is:" + " " + "meat".hashCode());
		
		System.out.println("the definition for the word fare is:"+ " "+ hashMap.get("fare") + ", " + "the hashCode for fare is:" + " " + "fare".hashCode());
		
		System.out.println("the definition for the word grateful is:"+ " "+ hashMap.get("grateful") + " ," + "the hashCode for grateful is:" + " " + "grateful".hashCode());
		
		System.out.println("the definition for the word scot is:"+ " "+ hashMap.get("scot") + ", " + "the hashCode for scot is:" + " " + "scot".hashCode());
		
		System.out.println("the definition for the word soak is:"+ " "+ hashMap.get("soak") + ", " + "the hashCode for soak is:" + " " + "soak".hashCode());
	}

}
