import java.util.Scanner;

public class potencia_usando_div_and_conqquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int base = input.nextInt();
		int exp = input.nextInt();
	
		System.out.println(pow(base,exp));
	}

	private static int pow(int base, int exp) {
		if(exp == 0) { return 1;}
		else if(exp % 2 == 0) {
			return pow(base,exp/2)*pow(base,exp/2);
		}
		else {
			return base * pow(base,exp/2) * pow(base,exp/2);
		}
	}

}
