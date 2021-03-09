package ds.exam01;
//for ���� ����ϴ� ��Ŀ��� ���� �λ���Ʈ�� �ִ� ����
public class Exam15 {

	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	static void triangleLU(int n) {
		for(int i = n; i > 0; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	static void triangleRB(int n) {
		for(int i = n; i > 0; i--) {
			for (int j = 1; j <= i - 1; j++) 	
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	
				System.out.print('*');
			
			System.out.println();
		}}
		
	
	static void triangleRU(int n) {
		for(int i = n; i > 0; i--) {
			for (int j = 1; j <= n - i; j++) 	
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 	
				System.out.print('*');
			System.out.println(); 
		}
		
	}
	
	
	public static void main(String[] args) {
		triangleLB(8);
		triangleLU(7);
		triangleRU(5);
		triangleRB(6);
	}
	
}
