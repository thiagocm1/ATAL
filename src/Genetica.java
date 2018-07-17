import java.util.Scanner;

public class Genetica {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        char[] array = {'N','O','N','P','N','O','P','N','P','O','N','O','P'};
        
        
        while(true) {
        	int qtd = sc.nextInt();
        	if(qtd >= 5000) {
        		break;
        	}
        	if(qtd == 0) {
        		System.out.println("");
        		break;
        	}
        	
            char[] genetic = new char[qtd];
        	
        	for (int i = 0; i < genetic.length; i++) {
    			genetic[i] = array[i % array.length];
    		}
        	
        	for (int i = 0; i < genetic.length; i++) {
    			System.out.print(genetic[i]);
    		}
        	
        }
	}
	
	

}
