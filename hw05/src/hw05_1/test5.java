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
	public void mocnt() {//�������� ���ִ� �޼ҵ�
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
		System.out.println("������ ���� : "+mo);
	}
	public void jacnt() {//�������� ���ִ� �޼ҵ�
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
		System.out.println("������ ���� : "+ja);

}}
