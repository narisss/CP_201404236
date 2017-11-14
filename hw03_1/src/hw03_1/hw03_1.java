package hw03_1;

import java.util.Scanner;

public class hw03_1 {
	public static void main(String[] args) {
		int stageCount = 1, winCount = 0, loseCount = 0;
		Scanner sc = new Scanner(System.in);
		String rps;
		
		System.out.println();
		System.out.println("--가위바위보 게임--");
		System.out.println();
		
		while (stageCount <= 7) {
			//7번 난수 입력할때 까지 문장 반복
			int userNum = (int)(Math.random()*10)+1;
			System.out.println("stage" + stageCount + ">user:" + winCount + "승 vs computer:" + loseCount + "승");
			System.out.printf("user choice: ");
			rps = sc.nextLine();
		
			if(rps.equals("가위")) {//if-조건식이 true면 실행, else-조건식이 false면 실행.
				if(userNum %3 == 0) {//3으로 나누면 나머지가 없다
					System.out.println("이겼다!");
					stageCount++;
					winCount++;
					} else if(userNum %3 == 1) {//3으로 나누면 나머지가 1이다
						System.out.println("비겼다!");
						stageCount++;
						} else {
							System.out.println("졌다!");
							stageCount++;
							loseCount++;
							}
				} else if(rps.equals("바위")) {
					if(userNum %3 == 0) {//3으로 나누면 나머지가 없다
						System.out.println("졌다!");
						stageCount++;
						loseCount++;
						} else if(userNum %3 == 1) {//3으로 나누면 나머지가 1
							System.out.println("이겼다!");
							stageCount++;
							winCount++;
							} else {
								System.out.println("비겼다!");
								stageCount++;
								}
					} else if (rps.equals("보")) {
						if(userNum %3 == 0) {//3으로 나느면 나머지가 없다
							System.out.println("비겼다!");
							stageCount++;
							} else if(userNum %3 == 1) {//3으로 나누면 나머지가 1
								System.out.println("졌다!");
								stageCount++;
								loseCount++;
								} else {
									System.out.println("이겼다!");
									stageCount++;
									winCount++;
									}
						} else {//1~9가 아닌 다른 문자 입력시
							System.out.println("잘못입력");
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
