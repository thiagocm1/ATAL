
public class lis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 22, 9, 33, 21, 50, 41, 60 };
		int result = lis(array);
		System.out.println(result);
	}

	private static int lis(int[] array) {
		int[] lis = new int[ array.length];
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			lis[i] = 1;
		}
		
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if((array[i] > array[j]) && (lis[i] < lis[j] + 1 )) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(max < lis[i]) {
				max = lis[i];
			}
		}
		return max;
	}

}
