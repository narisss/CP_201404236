package hw06;

public class hw06 {

	public static void main(String[] args) {
		int Ran[] = new int[10];//ũ�Ⱑ 10�� �迭 ����
		for(int i=0; i<10 ; i++)//������ ������ ������ ���� ���� for�� ���
			Ran[i] = (int)(Math.random()*100);
		int max = 0;
		int min = 100;
		for(int j=0; j<10; j++) {//for���� �̿��Ͽ� Ran[]�� ��
			if(Ran[j]>max)
				max = Ran[j];
			if(Ran[j]<min)
				min = Ran[j];
		
		}//�ִ� �ּڰ� ���
		System.out.println("10���� �� �� ���� ū ����: " + max);
		System.out.println("10���� �� �� ���� ���� ����: " + min);

	}

}
