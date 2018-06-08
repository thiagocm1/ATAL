package atal;

public class LISTA_ATAL_Q_3 {
	public static void main(String[] args) {
		String text = "kvjlixapejrbxeenpbzphkhthbkwyrwamnugzhppfxiyjyanhapfwbzubghxmshrlyujfjhrsovk vveylnbxnawavggfdfggrzizyvmfohigeabgkszfnbkmffbzbzxjffqbualeytqrphyrbjqdjqavctg xjifqgfgydhoiwhrvwqbxgrixydzbpzjnhopvlazbzumzhhfavoctdfytvvggikngkwzixgj tlxkojlefilbrboignbzsudssvqynbzuapbpqvlubdoyxkkwhcoudvtkmikbzbzansgsutdjythzlbzbzbzu";
		String pattern = "bzbzbzu";
		char[] textArray = text.toCharArray();
		char[] patternArray = pattern.toCharArray();
		stringMatch(textArray,patternArray);
	}


	private static void stringMatch(char[] textArray, char[] patternArray) {
		// TODO Auto-generated method stub
		String result = "fail";
		for (int i = 0; i < (textArray.length); i++) {
			int j = 0;
			while((j < patternArray.length) && (patternArray[j] == textArray[i + j])) {
				j++;
				if(j == patternArray.length) {
					result = "match";
					break;
				}
				
			}
		}
		System.out.println(result);
	}
}