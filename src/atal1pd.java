import java.util.LinkedList;
import java.util.List;

public class atal1pd {
/*1) 
 * Implemente um programa (em qualquer linguagem) que dada uma mochila de capacidade M e
 *  um conjunto de n itens (onde cada item possui um peso (w1, w2, ..., wn) e um valor (v1, v2, …, vn)),
 * seja capaz de exibir o subconjunto mais valioso de itens que caibam dentro da mochila. 
 *  Caso exista mais de um subconjunto ótimo, o seu programa deve listar todos os subconjuntos mais valiosos. 
 * O seu programa deve basear-se na estratégia de Programação Dinâmica.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int val[] = { 60, 100, 120 };
	      int wt[] = { 10, 20, 30 };
	      int W = 50;
		List<Integer> result = itensValiosos(val,wt,W);
		for (int s = 0; s < result.size(); s++) {
			System.out.println(result.get(s));
		}
		
	}

	private static List<Integer> itensValiosos(int[] valor, int[] peso, int pesoMochila) {
		List<Integer> maisValiosos = new LinkedList<>();
		int count = 0;
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
	
		int result = mochila[valor.length][pesoMochila];
		
		int p = pesoMochila;
		
		for (int i = valor.length; i > 0 && result > 0; i--) {
			if(result == mochila[i-1][p]) {}
			else {
				maisValiosos.add(peso[i-1]);
			}
			result -= valor[i - 1];
			p -= peso[i - 1];
		}
		
		return maisValiosos;
	}

	

	static int max(int a, int b) { if(a > b) {return a;} else {return b;} }

}
