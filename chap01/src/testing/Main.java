package testing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insert test = new Insert();


		test.insert(5);
		test.insert(6);
		test.insert(2);
		test.insert(3);
		int[] array = test.array;
		for(int i =0; i < array.length; i++)
			System.out.println(array[i]);
			
	}

}
