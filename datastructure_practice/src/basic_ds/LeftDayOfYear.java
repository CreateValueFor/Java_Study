package basic_ds;
import java.util.Scanner;

public class LeftDayOfYear {
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	static int isLeap(int year) {
		return(year % 4 ==0 && year % 100 !=0 || year % 400 ==0)? 1 : 0;
	}
	static int leftDayOfYear(int y, int m,int d) {
		int days = d;
		for (int i = 1; i <m; i++) 
			days += mdays[isLeap(y)][i-1];
		return (isLeap(y) == 1)? (366-days) : 365-days;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry;
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.println("년 : "); int year = stdIn.nextInt();
			System.out.println("월 : "); int month = stdIn.nextInt();
			System.out.println("일 : "); int day = stdIn.nextInt();
			System.out.printf("그 해 %d일째입니다,\n", leftDayOfYear(year,month,day));
			
			System.out.print("한 번 더 할까요? (1.예 / 0,아니오) : ");
			retry = stdIn.nextInt();
		} while(retry ==1);
	}

}
