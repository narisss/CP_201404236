package hw04_2;
import java.util.Scanner;
public class hw04_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. :");
		String alpha;//���ڿ� ���� ����
		alpha = input.next();
		
		switch(alpha) {//switch:��������(case)�� �ϳ� ����
		case"a":case"e":case"i":case"o":case"u":
			System.out.println("���� �Դϴ�.");
			break;
			
			default://case�� ���� ��� ��� 
				System.out.println("���� �Դϴ�.");
				break;
				
			
		}

	}

}
