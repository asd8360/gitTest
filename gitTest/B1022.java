package algorithmNote;


import java.util.Scanner;

public class B1022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numa = sc.nextInt();
		int numb = sc.nextInt();
		int q = sc.nextInt();//q进制
		sc.close();
		//end input 
		
		int sum = numa + numb;
		int ans[] = new int[32];
		int num = 0;
		do {
			ans[num++] = sum % q;
			sum = sum / q;
		}while(sum != 0);
		
		for(int i=num-1; i>=0;i--){
			System.out.print(ans[i]);
		}
		System.out.println();
	}
}
