import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1878_TORNEIO_SEQUENCIA {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n; // torneios
		int m; // alunos
		int[] c;
		
		while(input.hasNext()){
			n = input.nextInt();
			m = input.nextInt();
			c = new int[n];
			
			for (int i = 0; i < c.length; i++) {
				c[i] = input.nextInt();
			}
			
			System.out.println(checkTournaments(m,n,c));
		}
	}

	private static String checkTournaments(int m, int n, int[] c) {
		Set<Integer> tournamentSet = new HashSet<Integer>();
		String result = "";
		if(n == 2) {
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= m; j++) {
					int score = c[0] * i + c[1] * j;
					if(tournamentSet.contains(score)) {
						result = "Try again later, Denis..";
					}
					else {
						tournamentSet.add(score);
					}
				}
			}
		}
		else if( n == 3) {
			for(int i = 1; i <= m; i++) {
				for (int j = 1; j <= m ; j++) {
					for (int k = 1; 1 <= m; k++) {
						int score = c[0] * i + c[1] * j + c[2] * k;
						if(tournamentSet.contains(score)) {
							result = "Try again later, Denis...";
						}
						else {
							tournamentSet.add(score);
						}
					}
				}
			}
		}
		result = "Lucky Denis!";
		return result;
	}

}
