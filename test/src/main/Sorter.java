/*
 * Name:LeeMinGi
 * Student ID #: 2019143077
 */

/* 
 * Do NOT import any additional packages/classes.
 * If you (un)intentionally use some additional packages/classes we did not
 * provide, you may receive a 0 for the homework.
 */

public class Sorter implements ISorter {
	public Sorter() { ; }

	@Override
	public int[] ascending(int[] a) {
		/*
		 * Input:
		 *  - an integer array A
		 *
		 * Output: a sorted array A in *ascending* order.
		 */
        int length = a.length;
        int min;
        int tmp;

		for (int i = 1; i < length; i++) {
            min = i;
            for (int j = i + 1; j < length; j++){
                if(a[min] > a[j]){
                    min = j;
                }

            }
            tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        
        }
		return a;
	}
	
	@Override
	public int[] descending(int[] a) {
		/*
		 * Input:
		 *  - an integer array A
		 *
		 * Output: a sorted array A in *descending* order.
		 */
        int length = a.length;
        int max;
        int tmp;
        for (int i =1; i < length; i++){
            max = i;
            for (int j = i+1; j < length; j++){
                if(a[max] < a[j]){
                    max = j;
                }
            }
            tmp = a[max];
            a[max] = a[i];
            a[i] = tmp;
        }
		return a;
	}
}