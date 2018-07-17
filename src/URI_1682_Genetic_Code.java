import java.util.Scanner;

public class URI_1682_Genetic_Code {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] geneticCode = { 'N', 'O', 'N', 'P', 'N', 'O', 'P', 'N', 'P', 'O', 'N', 'O', 'P' };

	
		String result = "";
		
		while(true) {
			
			int qtd = input.nextInt();
			
			
			if(qtd == 0 || qtd > 5000) {
				break;
			}
			
				
			char [] newSequence = new char[qtd];
			
			for (int i = 0; i < newSequence.length; i++) {
				newSequence[i] = geneticCode[i % geneticCode.length];
			}
				
				
			for (int j = 0; j < newSequence.length; j++) {
					System.out.print(newSequence[j]);
			}
			
				
			
			
		}
	}

}

