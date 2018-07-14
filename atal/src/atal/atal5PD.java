import java.util.List;

public class atal5PD {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 1, 3} ;
		int result = minJumps(arr);
		System.out.println(result);
	}

	private static int minJumps(int[] arr) {
		int[] minJumps = new int[arr.length];
		minJumps[0] = 0;
		
		for (int i = 1; i < minJumps.length; i++) {
			minJumps[i] = Integer.MAX_VALUE - 1;
		}
		
		for (int i = 1; i < minJumps.length; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[j] + j >= i) {
					if(minJumps[i] > minJumps[j] + 1) {
						minJumps[i] = minJumps[j] + 1;
					}
				}
			}
		}
		return minJumps[minJumps.length - 1];
	}

}
