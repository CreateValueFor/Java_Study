package ds.exam01;

import java.util.Scanner;

public class Exam10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		do {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
		} while(b < a);
		System.out.println("b - a는 "+ (b-a) + "입니다.");
	}
	
}
