package practice;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4. �м� | 5.����");
			System.out.println("---------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("����> 1");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo ==2) {
				System.out.println("����> 2");
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
					
				}
			} else if (selectNo ==3) {
				System.out.println("����> 3");
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> " +scores[i]);
				}
			} else if(selectNo ==4) {
				System.out.println("����> 4");
				int max = 0;
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
				}
				for(int score : scores) {
					sum = sum + score;
				}
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + sum/scores.length);
			} else if (selectNo ==5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");

	}

}
