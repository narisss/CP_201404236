package hw06;

public class hw06 {

	public static void main(String[] args) {
		int Ran[] = new int[10];//크기가 10인 배열 선언
		for(int i=0; i<10 ; i++)//정수형 변수에 임의의 난수 선언 for문 사용
			Ran[i] = (int)(Math.random()*100);
		int max = 0;
		int min = 100;
		for(int j=0; j<10; j++) {//for문을 이용하여 Ran[]을 비교
			if(Ran[j]>max)
				max = Ran[j];
			if(Ran[j]<min)
				min = Ran[j];
		
		}//최댓값 최솟갓 출력
		System.out.println("10개의 수 중 가장 큰 숫자: " + max);
		System.out.println("10개의 수 중 가장 작은 숫자: " + min);

	}

}
