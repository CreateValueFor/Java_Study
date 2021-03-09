package ds.exam01;

import java.util.Scanner;

public class Exam09 {
	static int sumof(int a, int b) {
		int sum = 0;
		if(a<b) {
			
			for(int i = 0; a + i <= b; i++) {
				sum += a + i;
			}
		} else if (a > b) {
			for(int i = 0; b + i <= a; i++) {
				sum += b+ i;
			}
		} else {
			sum = 0;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner strId = new Scanner(System.in);
		int start = strId.nextInt();
		int end = strId.nextInt();
		System.out.println(sumof(start, end));
	}
}
