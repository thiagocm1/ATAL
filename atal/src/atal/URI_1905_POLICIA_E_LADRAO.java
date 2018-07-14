import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1905_POLICIA_E_LADRAO {
	public Map<Integer, String> entrada;
	
	public static void main(String[] args) {
			int[] array1 = {1,3,4,6,7};
			int[] array2 = {2,5,1,3,5,7};
			int toFind = 2;
			int result = find(array1,array2,toFind);
			System.out.println(result);
			
		}

	private static int find(int[] array1, int[] array2, int toFind) {
		if(array1.length == 0) {
			return array2[toFind];
		}
		if(array2.length == 0) {
			return array2[toFind];
		}
		int mid1 = array1.length/2;
		int mid2 = array2.length/2;
		
		if((mid1 + mid2) < toFind) {
			if(array1[mid1] > array2[mid2]) {
				return find(array1[mid1],array2,toFind);
			}
		}
		
	}
}

