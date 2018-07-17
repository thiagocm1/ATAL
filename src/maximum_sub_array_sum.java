import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class maximum_sub_array_sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[4];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		 //maximum-subset
		//System.out.println(kadane(array));
		
		

	}
/*Kadane array sum is a dinnamyic programing**/
	private static List<Integer> kadane(int[] array) {
		List<Integer> list = new LinkedList<>();
		int max_current = array[0];
		int max_global = array[0];
		for (int i = 1; i < array.length - 1; i++) {
			max_current = Math.max(array[i], max_current + array[i]);
			if(max_current > max_global) {
				max_global = max_current;
				list.add(array[i]);
			}
		}
		return list;
	}
	
/*Brute force solve*/
	
	
}
