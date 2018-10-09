package algorithmNote;

import java.util.Scanner;

public class B1032 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please input the number of classes: ");
		int num = sc.nextInt();
		int num2 = num;
		int [] scoreForTeam = new int[num];
		for(int i=0; i<num; i++) {
			scoreForTeam[i] = 0;
		}
		for(;num >0; num--){
			int team = sc.nextInt();
			int score = sc.nextInt();
			scoreForTeam[team] += score;
		}
		//test
//		for(int i=0; i<num2; i++) {
//			System.out.println(scoreForTeam[i]);
//		}
		
		int champion = 0, championScore = 0;
		for(int i=1; i<num2; i++) {
			if(championScore < scoreForTeam[i]) {
				champion = i;
				championScore = scoreForTeam[i];
			}
		}
		System.out.println(champion + " " + championScore);
	}
}
