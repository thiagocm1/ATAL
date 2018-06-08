package atal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LISTA_ATAL_Q_5 {
	Set<String> set = new HashSet<String>();
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String entrada = input.nextLine();
		String entrada2 = input.nextLine();
		if(entrada.length() > 4) {	
			System.out.println("entrada invalida");
		}
		else {
		permutation("",entrada);
		System.out.println("");
		if(entrada2.length() > 4) {
			System.out.println("entrada invalida");
		}
		permutation("", entrada2);
		}
		
	}


	private static void permutation(String prefix, String entrada) {
		// TODO Auto-generated method stub
		int length = entrada.length();
		if(length == 0) {
			System.out.println(prefix);
		}
		else {
			for (int i = 0; i < length; i++) {
				permutation(prefix + entrada.charAt(i), entrada.substring(0, i) + entrada.substring(i+1, length));
			}
		}
		
	}
}
