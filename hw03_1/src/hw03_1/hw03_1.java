package hw03_1;

import java.util.Scanner;

public class hw03_1 {
	public static void main(String[] args) {
		int stageCount = 1, winCount = 0, loseCount = 0;
		Scanner sc = new Scanner(System.in);
		String rps;
		
		System.out.println();
		System.out.println("--���������� ����--");
		System.out.println();
		
		while (stageCount <= 7) {
			//7�� ���� �Է��Ҷ� ���� ���� �ݺ�
			int userNum = (int)(Math.random()*10)+1;
			System.out.println("stage" + stageCount + ">user:" + winCount + "�� vs computer:" + loseCount + "��");
			System.out.printf("user choice: ");
			rps = sc.nextLine();
		
			if(rps.equals("����")) {//if-���ǽ��� true�� ����, else-���ǽ��� false�� ����.
				if(userNum %3 == 0) {//3���� ������ �������� ����
					System.out.println("�̰��!");
					stageCount++;
					winCount++;
					} else if(userNum %3 == 1) {//3���� ������ �������� 1�̴�
						System.out.println("����!");
						stageCount++;
						} else {
							System.out.println("����!");
							stageCount++;
							loseCount++;
							}
				} else if(rps.equals("����")) {
					if(userNum %3 == 0) {//3���� ������ �������� ����
						System.out.println("����!");
						stageCount++;
						loseCount++;
						} else if(userNum %3 == 1) {//3���� ������ �������� 1
							System.out.println("�̰��!");
							stageCount++;
							winCount++;
							} else {
								System.out.println("����!");
								stageCount++;
								}
					} else if (rps.equals("��")) {
						if(userNum %3 == 0) {//3���� ������ �������� ����
							System.out.println("����!");
							stageCount++;
							} else if(userNum %3 == 1) {//3���� ������ �������� 1
								System.out.println("����!");
								stageCount++;
								loseCount++;
								} else {
									System.out.println("�̰��!");
									stageCount++;
									winCount++;
									}
						} else {//1~9�� �ƴ� �ٸ� ���� �Է½�
							System.out.println("�߸��Է�");
							}
			System.out.println();
			}
		sc.close();
		
		if (winCount > loseCount) {
			System.out.println("Winner: user");
			} else {
				System.out.println("Winner: computer");
		}
 
	} }
