package ds.exam01;
import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		
		int a;
		Scanner stdIn = new Scanner(System.in);
		
		do {
			System.out.println("���ڸ� �Է��ϼ���");
			a = stdIn.nextInt();
		} while (a <= 0);
		
		
		String b = Integer.toString(a);
		System.out.println("�� ���� " + b.length() + "�ڸ��Դϴ�.");
	}
}
