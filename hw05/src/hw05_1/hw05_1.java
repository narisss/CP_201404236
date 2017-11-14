package hw05_1;
//입력받은 문자열에서 자음, 모음 개수 계산
import java.util.*;

public class hw05_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		test5 ts = new test5();
		String str;
		
		
		System.out.print("문자열을 입력히사오. ");
		str = in.next();
		ts.setStr(str);
		System.out.println("입력받은 문자열: "+ts.getStr());
		ts.jacnt();//자음개수를 세주는 메소드 호출
		ts.mocnt();//모음개수를 세주는 메소드 호출
		
		
	}

}
