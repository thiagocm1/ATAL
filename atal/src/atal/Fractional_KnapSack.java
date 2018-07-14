
public class Fractional_KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] peso = {10,20,30};
		int[] value = {60,100,120};
		
		int max = 50;
		
		knapsack(peso,value,max);
	}

	private static void knapsack(int[] peso, int[] value, int max) {
		// TODO Auto-generated method stub	
		int[] x = new int[peso.length];
		
		int weight = 0;
		for (int i = 1; i < peso.length; i++) {
			if(weight + peso[i] <= max) {
				x[i] = peso[i];
				weight = weight + peso[i];
			}
			else {
				x[i] = (max - weight)/ peso[i];
				weight = max;
				break;
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
