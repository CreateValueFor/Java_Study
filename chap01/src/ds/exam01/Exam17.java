package ds.exam01;

import java.util.Scanner;

public class Exam17 {
	static void npira(int n) {
		for(int i=1;i <=n; i++) { //(n-1) * 2 + 1개가 생성된다.
			for(int j=1; j<= (n-i);j++) {
			System.out.print(" ");
		}	for(int k=1; k<=(i-1)*2 + 1;k++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int a;
		do {
			a = stdIn.nextInt();
			npira(a);
		} while(a <= 0);
		
	}
}