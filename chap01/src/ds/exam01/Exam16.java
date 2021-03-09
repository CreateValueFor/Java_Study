package ds.exam01;

public class Exam16 {
	static void spira(int n) {
		for(int i=1;i <=n; i++) { //(n-1) * 2 + 1개가 생성된다.
			for(int j=1; j<= (n-i);j++) {
			System.out.print(" ");
		}	for(int k=1; k<=(i-1)*2 + 1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		spira(6);
	}
}