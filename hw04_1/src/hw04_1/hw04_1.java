package hw04_1;

import java.util.Scanner;

public class hw04_1 {
	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 0;
		a[1] = 1;
		int i = 0;//0번째 인덱스, 1번째 인덱스에 각각 0,1을 초기값으로 저장
		int sum = a[0] + a[1];
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번째 항까지의 피보나치 수열을 나열할 것인가요?");
		int num = sc.nextInt();
		System.out.print("0 1 ");
		
		for(i=2; i<num ; i=i+1) {//배열의 인덱스 위치가 0부터 저장되기 때문에, 입력한 숫자 보다 작을 때 까지
			a[i] = a[i-2] + a[i-1];//인덱스 2번째 부터 저장,첫번째 두번째 값의 합을 저장
			sum = sum + a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("\t");
		sc.close();
		}

}
