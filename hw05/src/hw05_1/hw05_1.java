package hw05_1;
//�Է¹��� ���ڿ����� ����, ���� ���� ���
import java.util.*;

public class hw05_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		test5 ts = new test5();
		String str;
		
		
		System.out.print("���ڿ��� �Է������. ");
		str = in.next();
		ts.setStr(str);
		System.out.println("�Է¹��� ���ڿ�: "+ts.getStr());
		ts.jacnt();//���������� ���ִ� �޼ҵ� ȣ��
		ts.mocnt();//���������� ���ִ� �޼ҵ� ȣ��
		
		
	}

}
