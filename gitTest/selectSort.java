package algorithmNote;

import java.util.Arrays;

public class selectSort{
	public static void main(String[] args) {
		int[] num = new int[] {10,23,5,32,63,46,5,13,4};
		for(int i=0; i<num.length; i++) {
			int k = i;
			for(int j=i; j<num.length; j++) {
				if(num[j] < num[k]) {
					k = j;//记录当前最小
				}
			}
			int temp = num[i];
			num[i] = num[k];
			num[k] = temp;
		}
		System.out.println(Arrays.toString(num));
	}	
	
}
