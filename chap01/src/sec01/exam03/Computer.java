package sec01.exam03;

public class Computer extends Calculator{
	@Override // �޼ҵ尡 ��Ȯ�� ������ �� ������ �����Ϸ��� Ȯ���ϱ� ������ �������� �Ǽ��� �ٿ��ش�. 
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
