package hw05_1;

public class test5 {
	int ja = 0, mo = 0;
	String s;

	public void setStr(String str) {
		s=str;

	}
	public String getStr() {
		return s;
	
	}
	public void mocnt() {//모음개수 세주는 메소드
		int i, length;
		length = s.length();
		for(i=0;i<length;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'
					||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				mo++;
			}
				
		}
		System.out.println("모음의 개수 : "+mo);
	}
	public void jacnt() {//자음개수 세주는 메소드
		int i, length;
		length = s.length();
		for(i=0;i<length;i++)
		{
			if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'
					&&s.charAt(i)!='o'&&s.charAt(i)!='u')
			{
				ja++;
			}
		}
		System.out.println("자음의 개수 : "+ja);

}}
