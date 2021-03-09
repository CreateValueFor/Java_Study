package practice;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		String str1 = scanner.next();
		double double1 = Double.parseDouble(str1);
		System.out.println("첫 번째 수: " + double1);
		String str2 = scanner.next();
		double double2 = Double.parseDouble(str2);
		System.out.println("두 번째 수: " + double2);
		if (double2 == 0.0) {
			System.out.println("무한대");
			
		} else {
			System.out.println(double1 / double2);
		};
		
		
		
		

	}

}
