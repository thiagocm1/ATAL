import java.util.Arrays;

public class Lista_4_Questao_2 {
	public static void main(String[] args) {
		int chegada[] = {100, 140, 150, 200, 215, 400};
	    int partida[] = {110, 300, 220, 230,315, 600};
	
	    
		trains(chegada,partida);
		int[] lista = {1,5,6,12,22};
		String word = "aids";
		int j = word.length();
		int i = 0;
		permuteStr(word, i, j);
	}		
	public static void nCombination(int[] array) {
		int num =0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			num = array[i];
			for (int j = i; j < array.length; j++) {
				if(array[j]+ array[j+i] != num) {
					
					
				}
				sum = array[j] + array[j+1];
				
			}
		}
		
	}
	public static void permuteStr(String word, int i, int j) {
		
		// fazer um for na palavra de i até o tamanho dela
		// trocar as letras da palavra mandando para o swap
		// trocar mandando a palavra, o fim e o indice da letra naquela posição do for
		// depois retormar permutation passando a prox posição do começo

		for (int k = i; k < j; k++) {
			word = swapStr(word, j, k);
			permuteStr(word, i + 1, j);
			word = swapStr(word, j, k);

		}
		System.out.println(word);
	}

	public static String swapStr(String str, int i, int j) {
		char aux;
		char[] array = str.toCharArray();
		aux = array[i];
		array[i] = array[j];
		array[j] = aux;
		return String.valueOf(array);
	}
	
	private static void trains(int[] chegada, int[] partida) {
		int plataforma = 0;
		int minPlataformas = 0;
		int i = 0;
		int j = 0;
		while(i < chegada.length){
			if(chegada[i] < partida[j]) {
				plataforma ++;
				i++;
				if(plataforma > minPlataformas) {
					minPlataformas = plataforma;
				}
			}
			else {
				plataforma--;
				j++;
			}
		}
		System.out.println(minPlataformas);
		
		/*int count = 0;
		int plataforma = 0;
		int i = 0;
		int j = 0;
		while(i < chegada.length) {
			if(chegada[i] < partida[j]) {
				plataforma++;
				i++;
				if(plataforma > count) {
					count = plataforma;
				}
			}
			else {
				plataforma --;
				j++;
			}
		}
		
		System.out.println(count);
		*/
	}
}
