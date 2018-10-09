package algorithmNote;

import java.util.Scanner;

public class A1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int locations = sc.nextInt();//组数
//		Student[] students = new Student [15];
		for(int i=0; i<locations; i++) {
			int localPeople = sc.nextInt();//本组人数
			for(int j=0; j<localPeople; j++) {
				String id = sc.next();
				int finalRank = sc.nextInt();
				int locationNum = sc.nextInt();
				int localRnak = sc.nextInt();
//				students[j] = new Student(id, finalRank, locationNum, localPeople);
			}
		}
	}
	class Student{
		String id;
		int finalRank;
		int locationNum;
		int localRank;
		public Student() {}
		public Student(String id, int finalRank, int locationNum, int localRank) {
			this.id = id;
			this.finalRank = finalRank;
			this.locationNum = locationNum;
			this.localRank = localRank;
		}
	}
	
}
