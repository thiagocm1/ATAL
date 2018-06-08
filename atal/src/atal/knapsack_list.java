package atal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class knapsack_list {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] peso = {1,4,8,5};
		int[] valor = {5,10,25,3};
		int pesoTotal = 40;
		
		knapsack(peso,valor,pesoTotal);
		
	}

	private static void knapsack(int[] peso, int[] valor, int pesoTotal) {
		// TODO Auto-generated method stub
		int melhorValor = 0;
		
		for (int i = 0; i < valor.length; i++) {
			
		}
	}
}
