package algorithmNote;

import java.util.Scanner;

public class CU1928 {

	public static void main(String[] args) {
		class MyDate{
			int date;
			int year;
			int month;
			int day ;
			public MyDate(int date) {
				this.date = date;
				year = this.date / 10000;
				month = this.date % 10000 / 100;
				day = this.date % 100;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int date1 = sc.nextInt();
		int date2 = sc.nextInt();
		//end input
		if(date1 > date2)
			change(date1, date2);
		
		MyDate myDate1 = new MyDate(date1);
		MyDate myDate2 = new MyDate(date2);
		
		
		int month[][] = {
				{0,0},{31,31},{28,29},{31,31},{30,30},{31,31},{30,30},{31,31},{31,31},{30,30},{31,31},{30,30},{31,31}
		};
		
//		int year1 = date1 / 10000;
//		int year2 = date2 / 10000;
//		int month1 = date1 % 10000 / 100;
//		int month2 = date2 % 10000 / 100;
//		int day1 = date1 % 100;
//		int day2 = date2 % 100;
		//now date2 > date1
		
		int ans = 1;
		while(myDate1.year < myDate2.year | myDate1.month < myDate2.month | myDate1.day < myDate2.day) {
			myDate1.day++;
			if(myDate1.day == month[myDate1.month][isRunYear(myDate1.year)] + 1) { 
				//out of range
				myDate1.month++;
				myDate1.day = 1;
			}
			if(myDate1.month == 13) {
				myDate1.year++;
				myDate1.month = 1;
			}
			ans++;
		}
		
		System.out.println(ans);
	}

	public static void change(int i1, int i2) {
		int temp = i1;
		i1 = i2;
		i2 = temp;
		return;
	}
	
	public static int isRunYear(int year) {
		if(year % 4 == 0 && year % 100 != 0)
			return 1;
		else if(year % 400 == 0)
			return 1;
		else return 0;
	}

}
