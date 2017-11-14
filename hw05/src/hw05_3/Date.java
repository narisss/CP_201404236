package hw05_3;

public class Date {
	
	private int year;
	private String month;
	private int day;
	
	public void printEastern() {
		System.out.println(year + "." + month + "." + day);
	}
	
	
	public void printWestern() {
		System.out.println(day + ", " + year);
	}
	public int getDay() {
		return day;
	}

}
