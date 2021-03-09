package search;
import java.util.Scanner;

public class SearchIdx {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for(int i=0; i < n ; i++) {
			if(a[i] == key)
				idx[idx.length-1] = i;
				count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		int[] tmp = new int[num];
		
		
		for (int i = 0; i< num; i++) {
			
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();

		}
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		int len = searchIdx(x, num ,ky, tmp);
		
		if (len == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) "+ len + "개 있습니다.");
	}

	}


