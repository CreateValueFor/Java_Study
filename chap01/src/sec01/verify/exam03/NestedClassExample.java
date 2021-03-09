package sec01.verify.exam03;

public class NestedClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
	}

}
