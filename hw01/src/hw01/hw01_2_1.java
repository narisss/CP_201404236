package hw01;

import java.util.Scanner;

public class hw01_2_1 {
	public static void main(String[] args) {
		int sec;
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 초 입력: ");
		sec = sc.nextInt();
		
		int result1, result2, result3;
		result1 = (sec / 3600);
		//입력된 초를 3600으로 나누면 초단위가 나온다.
		result2 = (sec % 3600 / 60);
		//입력된 초를 3600으로 나눈 나머지를 60으로 나누면 '분'단위가 된다.
		result3 = (sec % 3600 %60);
		//입력된 초를 3600으로 나누고, 나머지를 60으로 나눈 것의 나머지가 '초'단위이다.
		
		System.out.println("3662초는 " + result1 + "시 " + result2 + "분 " + result3 + "초 입니다.");
		//result을 시, result를 분, result3를 초로 나타낸다.
		sc.close();
	
}}
