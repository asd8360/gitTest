package algorithmNote;

import java.util.Scanner;

public class JinzhiZhuanhuan {
	public static void main(String[] args) {
		//p jinzhi x -> 10 jinzhi y
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();//p进制
		int x = sc.nextInt();//x作为输入
		int q = sc.nextInt();//q进制
		
		int y = 0, product = 1; //y作为结果输出，product为次方项
		while(x != 0) {
			y = y + x % 10 * product;
			x /= 10;
			product *= p;
		}
		
		//10 jinzhi y -> Q jinzhi z 低位存储法
		int z[] = new int[40];
		int num = 0;
		do {
			z[num++] = y % q;
			y = y / q;
		}while(y != 0);
		
		
		System.out.print(q+"进制的结果为");
		for(int i=num-1;i>=0;i--){
			System.out.print(z[i]);
		}
		System.out.println();
	}
}
