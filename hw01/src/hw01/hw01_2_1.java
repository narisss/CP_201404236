package hw01;

import java.util.Scanner;

public class hw01_2_1 {
	public static void main(String[] args) {
		int sec;
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�� �� �Է�: ");
		sec = sc.nextInt();
		
		int result1, result2, result3;
		result1 = (sec / 3600);
		//�Էµ� �ʸ� 3600���� ������ �ʴ����� ���´�.
		result2 = (sec % 3600 / 60);
		//�Էµ� �ʸ� 3600���� ���� �������� 60���� ������ '��'������ �ȴ�.
		result3 = (sec % 3600 %60);
		//�Էµ� �ʸ� 3600���� ������, �������� 60���� ���� ���� �������� '��'�����̴�.
		
		System.out.println("3662�ʴ� " + result1 + "�� " + result2 + "�� " + result3 + "�� �Դϴ�.");
		//result�� ��, result�� ��, result3�� �ʷ� ��Ÿ����.
		sc.close();
	
}}
