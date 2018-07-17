package lista3;

import java.util.Scanner;

public class ChamadasRecursivasPD {
	
	static int chamadasBase = 0;
	static int chamadasRecursivas = 0;
	
	static int fib(int valor){
		if(valor == 0){
			chamadasRecursivas++;
			return 0;			
		}
		if(valor == 1){
			chamadasBase++;
			chamadasRecursivas++;
			return 1;
		}
		else {
			chamadasRecursivas++;
			return fib(valor - 1) + fib(valor - 2);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int n = sc.nextInt();
		while (i < n){
			chamadasBase = 0;
			chamadasRecursivas = 0;
			int entrada = sc.nextInt();
			fib(entrada);
			System.out.println("fib(" + entrada + ") = " + (chamadasRecursivas - 1) + " calls = " + chamadasBase);
			i++;
		}
		
	}
}
