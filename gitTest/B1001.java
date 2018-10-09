package algorithmNote;

import java.util.Scanner;


public class B1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an integer: ");
		int num = sc.nextInt();
		int count = 0;
		while(num != 1) {
			if(num % 2 == 0) {
				num /= 2;
			}
			else {
				num = (3 * num + 1) / 2;
			}
			count++;
		}
		System.out.println(count);
		sc.close();
		return;
	}
}

