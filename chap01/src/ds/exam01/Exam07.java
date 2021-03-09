package ds.exam01;

import java.util.Scanner;

public class Exam07 {
	public static void sum(int num) {
		String resultString = "1";
		int sum = 0;
		for(int i = 2; i <= num+1; ++i) {
			String add = Integer.toString(i);
			resultString = resultString + " + " + add;
			sum += i - 1;
		}

		System.out.println(resultString +" = "+ Integer.toString(sum));
		
	}
	public static void main(String[] args) {
		Scanner strId = new Scanner(System.in);
		int a = strId.nextInt();
		sum(a);
	}
}
