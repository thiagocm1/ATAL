package lista3;

import java.util.Scanner;

public class SequenciaDNA {
	
	public static int lcs(String lc1, String lc2, int k) {
        int[][] c = new int[lc1.length() + 1][lc2.length() + 1];

        for (int i = 1; i <= lc1.length(); i++) {
            for (int j = 1; j <= lc2.length(); j++) {
              
                int n = 0;
                c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);

                while ((i - 1 - n >= 0) && (j - 1 - n >= 0) && (lc1.charAt(i - 1 - n) == lc2.charAt(j - 1 - n))) {
                    n++;
                }
                if (n >= k) {
                  
                    for (int h = k; h <= n; h++) {
                        c[i][j] = Math.max(c[i][j], c[i - h][j - h] + h);
                    }
                }
            }
        }

        return c[lc1.length()][lc2.length()];
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = 1;
    
    
    while (k != 0){
		k = sc.nextInt();
		if(k == 0){
      break;		
		} 
		sc.nextLine();
		String lc1 = sc.nextLine();
		String lc2 = sc.nextLine();
		System.out.println(lcs(lc1, lc2, k));
	} 
  }
}
