package algorithmNote;

import java.util.Scanner;

public class CU5901 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		//end input
		
		char c[] = str.toCharArray();
		for(int i=0; i<str.length()/2; i++) {
			if(c[i] != c[str.length()-i-1]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		return;
	}
}
