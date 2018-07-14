import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Greedy_Coin_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] coins = {50,25,10,5,1};
		int value = input.nextInt();	
		change(coins,value);
		
}/*
		c = [50, 25, 10, 5, 1]
				s = []
				soma = 0
				total = 450
				i = 0
				while soma != total:
					if soma + c[i] <= total:
						x = c[i]
						soma += x
						s.append(x)
					else:
						i += 1

				print s
				*/

	private static void change(int[] coins, int value) {
		List<Integer> change = new LinkedList<>();
		int soma = 0;
		int x = 0;
		int i = 0;
		while(soma !=  value) {
			if(soma + coins[i] <= value) {
				soma += coins[i];
				change.add(coins[i]);
			}
			else {
			i++;
			}
		}
		for (int j = 0; j < coins.length; j++) {
			System.out.println(change.get(j));
		}
	}
}
