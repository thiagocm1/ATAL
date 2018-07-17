
public class editDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "sunday";
	     String str2 = "saturday";
	     int result = editDistance(str1,str2);
	     System.out.println(result);
	}

	private static int editDistance(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		int[][] distance = new int[str1.length() + 1][str2.length() + 1];
		
		for (int i = 0; i <= str1.length(); i++) {
			for (int j = 0; j <= str2.length(); j++) {
					if(i == 0) {
						distance[i][j] = j;
					}
					else if(j == 0) {
						distance[i][j] = i;
					}
					else if(s1[i-1] == s2[j-1]) {
						distance[i][j] = distance[i-1][j-1];
					}
					else {
						distance[i][j] = 1 + min(distance[i][j-1],distance[i-1][j],distance[i-1][j-1]);
					}
			}
		}
		return distance[str1.length()][str2.length()];
	}

	private static int min(int x,int y,int z)
    {
        if (x <= y && x <= z) return x;
        if (y <= x && y <= z) return y;
        else return z;
    }

}
