package hw05_2;

import java.util.Scanner;

public class hw05_2 {
	//�ҹ��ڿ� �빮���� �ƽ�Ű �ڵ��� ���̰� 32�ΰ��� Ȱ��
		//A���� a�� ������� 32�� ���ϰ� �ݴ��� ��� ���� �ȴ�
		//A-65, Z-90, a-97, z-122
		//65<=char<=90�̸� �빮��, 97<=char<=122�̸� �ҹ���
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		String input = sc.nextLine();
		
		char[] arr;
		arr = input.toCharArray();
		
		for(int i=0; i<arr.length; ++i) {
			if(65<=arr[i] && arr[i]<=90) {
				arr[i]=(char)(arr[i]+32);
				continue;
			}
			if(97<=arr[i] && arr[i]<=122) {
				arr[i]=(char)(arr[i]-32);
				continue;
			}
		}
		System.out.print(arr);

	}

}
