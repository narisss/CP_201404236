package hw02;
import java.util.Scanner;

public class hw02 {
	public static void main(String[] args) {
			int year;
			
			String result1;
			Scanner sc = new Scanner(System.in);
			System.out.print("년도를 입력하시오: ");
			year = sc.nextInt();
			
			result1=((year %4==0)&&(year % 100!=0)||(year % 400==0))? "윤넌 입":"윤년이 아닙";
			
			//윤년은 입력한 연도가 4로 나누어 떨어지면서 100의 배수가 아니어야 함
			//동시에 400의 배수면 윤년이므로 조건에 해당되면 '윤년 입' 해당되지 않으면 '윤년이 아닙'을 리턴해줌.
			System.out.println(year + result1 + "니다.");
			sc.close();
		

	}
}
