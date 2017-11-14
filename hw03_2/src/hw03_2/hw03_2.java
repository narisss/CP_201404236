package hw03_2;

import java.util.Scanner;

public class hw03_2 {
	public static void main(String[] args) {
		int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
		//1,3,5,7,8,10,12월은 31일 아니면 30일. 평년 2월이면 28일, 윤년 2월이면 29일.
		String[] days = new String[]{"일", "월", "화", "수", "목", "금", "토"};  
		Scanner line = new Scanner(System.in);  
		int year;  
		int month;  
		int day;  
		int total_day = 0;  
      		
		System.out.print("연, 월, 일을 입력하시오 (입력형식 yyyy-mm-dd): "); 
		String[] date = line.nextLine().split("-"); 
			if(date.length != 3) { 
				System.out.println("연,월,일을 양식에 맞춰 다시 입력해 주시기 바랍니다."); 
				System.exit(1); 
			} 
		year = Integer.parseInt(date[0]); 
		month = Integer.parseInt(date[1]); 
		day = Integer.parseInt(date[2]); 
		total_day += (year-1900) * 365;  
		total_day += (year-1900)/4; 
		//년수가 4로 나누어 떨어지는 해는 윤년, 이중 100으로 나누어 떨어지는 해는 평년, 그중 400으로 나누어 떨어지는 해는 윤년.
		if(0 ==(year % 4) && 0 !=(year % 100) || 0 == (year % 400)) {  
			if( month == 1 || month == 2) {  
				total_day -= 1;  
			}  
		}  
		for(int i=0 ; i<month-1 ; i++) {  
			total_day += months[i];  
		}  
		total_day += day;  
		System.out.println(year+"년 "+month+"월 "+day+"일은 "+days[total_day%7]+"요일입니다."); 
	}  //입력받은 날짜가 몇일이 지났는지 알아내고, 그 날짜를 7로 나눈 나머지에 따라 요일 계산.

}
