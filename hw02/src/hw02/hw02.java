package hw02;
import java.util.Scanner;

public class hw02 {
	public static void main(String[] args) {
			int year;
			
			String result1;
			Scanner sc = new Scanner(System.in);
			System.out.print("�⵵�� �Է��Ͻÿ�: ");
			year = sc.nextInt();
			
			result1=((year %4==0)&&(year % 100!=0)||(year % 400==0))? "���� ��":"������ �ƴ�";
			
			//������ �Է��� ������ 4�� ������ �������鼭 100�� ����� �ƴϾ�� ��
			//���ÿ� 400�� ����� �����̹Ƿ� ���ǿ� �ش�Ǹ� '���� ��' �ش���� ������ '������ �ƴ�'�� ��������.
			System.out.println(year + result1 + "�ϴ�.");
			sc.close();
		

	}
}
