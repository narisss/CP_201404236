package hw05_2;

import java.util.Scanner;

public class hw05_2 {
	//소문자와 대문자의 아스키 코드의 차이가 32인것을 활용
		//A에서 a로 만들려면 32를 더하고 반대의 경우 빼면 된다
		//A-65, Z-90, a-97, z-122
		//65<=char<=90이면 대문자, 97<=char<=122이면 소문자
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("문장을 입력하세요.");
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
