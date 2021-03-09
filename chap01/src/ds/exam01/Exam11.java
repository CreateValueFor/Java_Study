package ds.exam01;
import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		
		int a;
		Scanner stdIn = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요");
			a = stdIn.nextInt();
		} while (a <= 0);
		
		
		String b = Integer.toString(a);
		System.out.println("그 수는 " + b.length() + "자리입니다.");
	}
}
