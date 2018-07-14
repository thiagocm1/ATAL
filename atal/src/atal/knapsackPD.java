
public class knapsackPD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int val[] = new int[]{1,4,5,7};
	    int peso[] = new int[]{1,3,4,5};
	    int  pesoMochila = 7;
	    int n = val.length;
		int result = knapsackPD(val,peso,pesoMochila);
		System.out.println(result);
	}

	private static int knapsackPD(int[] valor, int[] peso, int pesoMochila) {
		// TODO Auto-generated method stub
		int mochila[][] = new int[valor.length + 1][pesoMochila + 1];
		// preencher matriz
		for (int i = 0; i <= valor.length; i++) {
			for (int j = 0; j <= pesoMochila; j++) {
				if(i == 0 || j == 0) {
					mochila[i][j] = 0;
				}
				else if(peso[i - 1] <= j) {
					mochila[i][j] = max(valor[i-1] + mochila[i-1][j - peso[i-1]],mochila[i-1][j]);
				}
				else {
					mochila[i][j] = mochila[i-1][j];
				}
			}
		}
		return mochila[valor.length][pesoMochila];
	}

	static int max(int a, int b) { if(a > b) {return a;} else {return b;} }

}
