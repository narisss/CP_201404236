package hw05_3;

import java.util.Scanner;


public class TestDate {

	public static void main(String[] args) {
		Date date = new Date();
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		date.year = input.nextInt();
		System.out.print("�� �Է�: ");
		date.month = input.nextInt();
		System.out.print("�� �Է�: ");
		date.day = input.nextInt();
		System.out.println("����� ��¥ ǥ��: " + printEastern());
		System.out.println("����� ��¥ ǥ��: " + printWestern());
		input.close();
		

	}

}
