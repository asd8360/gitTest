package algorithmNote;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

public class InsertSort {
	public static void main(String[] args) {
		int num[] = new int[]{123,14351,26,35,1,13,231,121,3521};
		for(int i=1; i <num.length ;i++){
			int temp = num[i];
			int j = i-1;
			while(j>=0 && temp < num[j]) {
				num[j+1] = num[j];
				j--;
			}
			num[j+1] = temp;
			
		}
		
		System.out.println(Arrays.toString(num));
	}
}
