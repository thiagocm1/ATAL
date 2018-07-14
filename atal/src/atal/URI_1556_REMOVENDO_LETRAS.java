import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI_1556_REMOVENDO_LETRAS {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String word = input.nextLine();
			ArrayList<String> listOfWords = new ArrayList<>();
			backtrack(listOfWords,0,word,"");
			Collections.sort(listOfWords);
			for (int i = 0; i < listOfWords.size(); i++) {
				System.out.println(i);
			}
		}
	}

	private static void backtrack(ArrayList<String> listOfWords, int pos, String word, String start) {
		char[] words = word.toCharArray();
		String[] helper = new String[word.length()];
		for (int i = 0; i < pos; i++) {
			for (int j = 0; j < word.length(); j++) {
				helper[i] = word
			}
		}
	}	
}
