package sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArray = {1,2,3,4};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			
		}
		
		//for(int i = 0; i<newIntArray.length; i++) {
			//System.out.print(newIntArray[i] + ", ");
		//}
		System.arraycopy(oldIntArray,  0, newIntArray, 0, oldIntArray.length);
		for(int i = 0; i< newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ",");
		}

	}

}
