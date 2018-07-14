import java.util.Scanner;

public class QUESTAO_1_ATAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		System.out.println(transformString(word1, word2));
	}

	private static boolean transformString(String word1, String word2) {
		int size_word_1 = word1.length();
		int size_word_2 = word2.length();
		String result = "";
		if(Math.abs(size_word_1 - size_word_2) > 1) {
			return false;
		}
		if(size_word_1 > size_word_2) {
			transformString(word2, word1);
		}
			// replace //
		if(size_word_1 == size_word_2) {
			int count = 0;
			for (int i = 0; i < size_word_1; i++) {
				if(word1.charAt(i) != word2.charAt(i)) {
					count ++;
				}
				
			}
			return count == 1;
		}
		else {
			int i = 0;
			int j = 0;
			while(i < size_word_1 && word1.charAt(i) == word2.charAt(j)) {
				i++;
				j++;
			}
		
			while(i < size_word_1 && word1.charAt(i) == word2.charAt(j)) {
				i++;
				j++;
			}
			return i == size_word_1;
		}
		
	}

}
