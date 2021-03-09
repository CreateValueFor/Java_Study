package sec01.exam03;

public class Computer extends Calculator{
	@Override // 메소드가 정확히 재정의 된 것인지 컴파일러가 확인하기 때문에 개발자의 실수를 줄여준다. 
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
