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
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.println("�� : "); int year = stdIn.nextInt();
			System.out.println("�� : "); int month = stdIn.nextInt();
			System.out.println("�� : "); int day = stdIn.nextInt();
			System.out.printf("�� �� %d��°�Դϴ�,\n", leftDayOfYear(year,month,day));
			
			System.out.print("�� �� �� �ұ��? (1.�� / 0,�ƴϿ�) : ");
			retry = stdIn.nextInt();
		} while(retry ==1);
	}

}
