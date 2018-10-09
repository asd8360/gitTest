package algorithmNote;

import java.util.Scanner;

public class CU1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int [] num = new int[length];
		for(int i=0; i<length; i++) {
			num[i] = sc.nextInt();
		}
		int goal = sc.nextInt();
		//end with input
		
		int loc = -1;
		for(int i=0; i<length; i++) {
			if(goal == num[i]) {
				loc = i;
				break;
			}
		}
		System.out.println(loc);
	}
}
