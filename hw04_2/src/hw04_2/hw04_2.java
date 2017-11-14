package hw04_2;
import java.util.Scanner;
public class hw04_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("문자를 입력하세요. :");
		String alpha;//문자열 변수 선언
		alpha = input.next();
		
		switch(alpha) {//switch:여러가지(case)중 하나 선택
		case"a":case"e":case"i":case"o":case"u":
			System.out.println("모음 입니다.");
			break;
			
			default://case에 없는 모든 경우 
				System.out.println("자음 입니다.");
				break;
				
			
		}

	}

}
