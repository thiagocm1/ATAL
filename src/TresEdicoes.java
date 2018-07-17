import java.util.Scanner;

public class TresEdicoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		function(word1,word2);
		
	}

	private static void function(String word1, String word2) {
		char[] str1 = word1.toCharArray();
		char[] str2 = word2.toCharArray();
		if(Math.abs((word1.length()) - (word2.length())) >= 2) {
			return false;
		}
		
	}

	private static String removeLower(String word1, String word2) {
		// TODO Auto-generated method stub
		String result = "";
		int i = 0;
		int j = 0;
		char[] word = word1.toCharArray();
		char[] secondword = word2.toCharArray();
		
		while((i < word2.length()) && (j < word1.length())) {
			if(word[j] == secondword[i]) {
				result += secondword[i];
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		return result;
	}
	
	

}
