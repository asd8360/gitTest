package algorithmNote;

import java.util.Scanner;

public class B1036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String str = sc.next();
		char[] c0 = str.toCharArray();
		char c = c0[0];
		//end input
		
		//output lines
		int outPutLine = 0;
		if(length % 2 == 0)
			outPutLine = length / 2;
		else
			outPutLine = (length+1) / 2;
		
		for(int i=0; i<length; i++) 
			System.out.print(c);
		System.out.println();
		//output a line
		
		outPutLine --;
		while(outPutLine-- != 1) {
			for(int i=0; i<length; i++) {
				if(i == 0 | i == length-1) {
					System.out.print(c);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<length; i++) 
			System.out.print(c);
		
		return;
		
		
		
		
	}
}
