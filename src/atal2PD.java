import java.util.Scanner;

public class atal2PD {
	/*
	 * Dadas duas strings, use Programação Dinâmica para encontrar o tamanho da maior substring comum entre elas. 
	 * Ex: se string1 = “blusa”, string2 = “lisa”, o tamanho da maior substring comum é 2.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		int result = lcs(s1,s2);
		System.out.println(result);
	}

	private static int lcs(String s1, String s2) {
		// TODO Auto-generated method stub
		char[] string1 = s1.toCharArray();
		char[] string2 = s2.toCharArray();
		int[][] lcs = new int[s1.length() + 1 ][s2.length() + 1];
		
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if(i == 0 || j == 0) {
					lcs[i][j] = 0;
				}
				else if(string1[i-1] == string2[j-1]) {
						lcs[i][j] = lcs[i-1][j-1] + 1;
				}
				else {
					lcs[i][j] = max(lcs[i-1][j],lcs[i][j-1]);
				}
			}
		}
		return lcs[s1.length()][s2.length()];
	}

	private static int max(int i, int j) {
		if(i > j) {return i;}
		else {
			return j;
		}
	}

}
