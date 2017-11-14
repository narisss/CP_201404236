package hw03_2;

import java.util.Scanner;

public class hw03_2 {
	public static void main(String[] args) {
		int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
		//1,3,5,7,8,10,12���� 31�� �ƴϸ� 30��. ��� 2���̸� 28��, ���� 2���̸� 29��.
		String[] days = new String[]{"��", "��", "ȭ", "��", "��", "��", "��"};  
		Scanner line = new Scanner(System.in);  
		int year;  
		int month;  
		int day;  
		int total_day = 0;  
      		
		System.out.print("��, ��, ���� �Է��Ͻÿ� (�Է����� yyyy-mm-dd): "); 
		String[] date = line.nextLine().split("-"); 
			if(date.length != 3) { 
				System.out.println("��,��,���� ��Ŀ� ���� �ٽ� �Է��� �ֽñ� �ٶ��ϴ�."); 
				System.exit(1); 
			} 
		year = Integer.parseInt(date[0]); 
		month = Integer.parseInt(date[1]); 
		day = Integer.parseInt(date[2]); 
		total_day += (year-1900) * 365;  
		total_day += (year-1900)/4; 
		//����� 4�� ������ �������� �ش� ����, ���� 100���� ������ �������� �ش� ���, ���� 400���� ������ �������� �ش� ����.
		if(0 ==(year % 4) && 0 !=(year % 100) || 0 == (year % 400)) {  
			if( month == 1 || month == 2) {  
				total_day -= 1;  
			}  
		}  
		for(int i=0 ; i<month-1 ; i++) {  
			total_day += months[i];  
		}  
		total_day += day;  
		System.out.println(year+"�� "+month+"�� "+day+"���� "+days[total_day%7]+"�����Դϴ�."); 
	}  //�Է¹��� ��¥�� ������ �������� �˾Ƴ���, �� ��¥�� 7�� ���� �������� ���� ���� ���.

}
