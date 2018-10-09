package algorithmNote;

import java.util.Scanner;

public class CU2036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int [] num = new int [length];
		int odd=0, even=0; 
		for(int i=0; i<length; i++) {
			int j = sc.nextInt();
			if(j%2 == 1) odd++;
			else even++;
		}
		if(odd < even)
			System.out.println("NO");
		else
			System.out.println("YES");
		return;
			
			
		
	}
}
