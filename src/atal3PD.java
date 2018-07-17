import java.util.Scanner;

public class atal3PD {
	/*
	 * Implemente um programa (em qualquer linguagem) para calcular a série de Fibonacci de um dado número n
	 * . O seu programa deve basear-se na estratégia de Programação Dinâmica.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int result = fibPD(n);
		System.out.println(result);
	}

	private static int fibPD(int n) {
		// TODO Auto-generated method stub
		int[] memoize = new int[n + 1];
		memoize[0] = 0;
		memoize[1] = 1;
		for (int i = 2; i <= n; i++) {
			memoize[i] = memoize[i-1] + memoize[i - 2];
		}
		return memoize[n];
	}

}
