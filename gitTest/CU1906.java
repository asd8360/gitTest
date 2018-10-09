package algorithmNote;

import java.util.Scanner;

public class CU1906 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//end input
		
		int [] char1 = new int[10];
		int num1length = 0;
		int [] char2 = new int[10];
		int num2length = 0;
		
		for(int i=0; num1 != 0 && i<10; i++) {
			char1[i] = num1 % 10;
			num1 /= 10;
			num1length++;
		}
		for(int i=0; num2 != 0 && i<10; i++) {
			char2[i] = num2 % 10;
			num2 /= 10;
			num2length++;
		}
		
		int sum = 0;
		for(int i=0; i<num1length; i++) {
			for(int j=0; j<num2length; j++) {
				sum += char1[i] * char2[j];
			}
		}
		System.out.println(sum);
	}
}
