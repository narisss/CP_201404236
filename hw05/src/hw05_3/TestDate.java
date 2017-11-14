package hw05_3;

import java.util.Scanner;


public class TestDate {

	public static void main(String[] args) {
		Date date = new Date();
		Scanner input = new Scanner(System.in);
		System.out.print("연도 입력: ");
		date.year = input.nextInt();
		System.out.print("월 입력: ");
		date.month = input.nextInt();
		System.out.print("일 입력: ");
		date.day = input.nextInt();
		System.out.println("동양식 날짜 표현: " + printEastern());
		System.out.println("서양식 날짜 표현: " + printWestern());
		input.close();
		

	}

}
