package ds.exam01;
import java.util.Scanner;


public class CheckOperation {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int i = 0;
		int sum = 0;
		while(i <= n) {
			sum += i;
			i++;
			System.out.println(i);
		}
		System.out.println(sum);
		
	}
}
