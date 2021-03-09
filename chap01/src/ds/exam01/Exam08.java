package ds.exam01;

import java.util.Scanner;

public class Exam08 {

	public static void gause(int num) {
		float sum = (1 + num) * ((float)num/2);
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner strId = new Scanner(System.in);
		int a = strId.nextInt();
		gause(a);
	}
	
}
