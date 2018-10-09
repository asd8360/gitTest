package algorithmNote;

import java.util.Scanner;

public class B1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String content = sc.nextLine();
		String [] str = content.split(" ");
		
		for(int i=str.length-1; i>0; i--) {
			System.out.print(str[i]+" ");
		}
		System.out.println(str[0]);
	}
}
