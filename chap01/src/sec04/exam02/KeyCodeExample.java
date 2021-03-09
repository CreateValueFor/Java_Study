package sec04.exam02;

public class KeyCodeExample {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if (keyCode == 113) {
				break;
			}
		}
		
		System.out.println("Á¾·á");

	}

}
