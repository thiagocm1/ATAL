import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class URI_1556_REMOVENDO_PALAVRAS {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<String> stringSet = new HashSet<String>();
		
		while(input.hasNext()) {
			String word = input.nextLine();
			generateSets(word, stringSet);
			List<String> newStringSet = new ArrayList(stringSet);
			Collections.sort(newStringSet);
			for (String string : newStringSet) {
				System.out.println(string);
			}
		}
	}

	private static void generateSets(String word, Set<String> stringSet) {
		if(word.length() == 0) { return;}
		System.out.println(word);
		stringSet.add(word);
		char[] words = word.toCharArray();
		String[] array = (String[]) stringSet.toArray();
		for (int i = 0; i < array.length; i++) {
			if(words[i]) {
		}
		
		
	}
}	
