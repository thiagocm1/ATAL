package atal;

import java.util.Scanner;

public class LISTA_ATAL_Q_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		char[] palavra1 = word1.toCharArray();
		
		char[] palavra2 = word2.toCharArray();
		
		if(Math.abs((word1.length() - word2.length())) >= 2) {
			System.out.println("false");
		}
		else if(word1.length() == word2.length()) {
			int count =  0;
			for (int i = 0; i < palavra2.length; i++) {
				if(palavra1[i] != palavra2[i]) {
					count += 1;
				}
			}
			if(word1.length() > word2.length()) {
				solve(palavra1,palavra2);
			}
		}
	}

	private static void solve(char[] palavra1, char[] palavra2) {
		String result = "";
		int i = 0;
		int j = 0;
		while(i < palavra1.length && j < palavra2.length) {
			if(palavra1[i] == palavra2[j]) {
				result += palavra2[i];
				i++;
				j++;
			}
			j++;
		}
		System.out.println(result);
		
	}

}
