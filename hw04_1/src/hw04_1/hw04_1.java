package hw04_1;

import java.util.Scanner;

public class hw04_1 {
	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 0;
		a[1] = 1;
		int i = 0;//0��° �ε���, 1��° �ε����� ���� 0,1�� �ʱⰪ���� ����
		int sum = a[0] + a[1];
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ��° �ױ����� �Ǻ���ġ ������ ������ ���ΰ���?");
		int num = sc.nextInt();
		System.out.print("0 1 ");
		
		for(i=2; i<num ; i=i+1) {//�迭�� �ε��� ��ġ�� 0���� ����Ǳ� ������, �Է��� ���� ���� ���� �� ����
			a[i] = a[i-2] + a[i-1];//�ε��� 2��° ���� ����,ù��° �ι�° ���� ���� ����
			sum = sum + a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("\t");
		sc.close();
		}

}
