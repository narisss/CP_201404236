package hw07_1;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		int amount;
		BankAccount a = new BankAccount();//a,b��� bankaccount�� ��ü ����
		BankAccount b = new BankAccount();
		System.out.println("����1 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		a.accountNumber = sc1.nextLine();
		System.out.print("������ : ");
		a.owner = sc2.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		a.balance = sc3.nextInt();
		System.out.println("");
		System.out.println("����2 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		b.accountNumber = sc1.nextLine();
		System.out.print("������ : ");
		b.owner = sc2.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		b.balance = sc3.nextInt();
		System.out.println(" ");
		System.out.println("���� 1���� ���� 2�� �۱��� �ݾ� : ");
		amount = sc1.nextInt();
		System.out.println("=========================");
		a.tp(amount, b);//tp��� �޼ҵ� �θ�
		if(a.balance<0){//balance>amount�̸� ������ü ����.�ݴ� �Ұ���.
			System.out.println("�ܾ��� �����Ͽ� �۱ݿ� �����Ͽ����ϴ�.");
			a.deposit(amount);
			b.withdraw(amount);
		}
		else{//tostring �޼ҵ��� return ���� ����ϱ� ���� ������ ��ü ���
			System.out.println("����1");
			System.out.println(a);
			System.out.println("����2");
			System.out.println(b);
		}
	}

}
