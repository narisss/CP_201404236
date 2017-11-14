package hw07_1;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		int amount;
		BankAccount a = new BankAccount();//a,b라는 bankaccount의 객체 선언
		BankAccount b = new BankAccount();
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌번호 : ");
		a.accountNumber = sc1.nextLine();
		System.out.print("예금주 : ");
		a.owner = sc2.nextLine();
		System.out.print("초기 잔액 : ");
		a.balance = sc3.nextInt();
		System.out.println("");
		System.out.println("계좌2 정보 입력");
		System.out.print("계좌번호 : ");
		b.accountNumber = sc1.nextLine();
		System.out.print("예금주 : ");
		b.owner = sc2.nextLine();
		System.out.print("초기 잔액 : ");
		b.balance = sc3.nextInt();
		System.out.println(" ");
		System.out.println("계좌 1에서 계좌 2로 송금할 금액 : ");
		amount = sc1.nextInt();
		System.out.println("=========================");
		a.tp(amount, b);//tp라는 메소드 부름
		if(a.balance<0){//balance>amount이면 계좌이체 가능.반대 불가능.
			System.out.println("잔액이 부족하여 송금에 실패하였습니다.");
			a.deposit(amount);
			b.withdraw(amount);
		}
		else{//tostring 메소드의 return 값을 출력하기 위해 각각의 객체 출력
			System.out.println("계좌1");
			System.out.println(a);
			System.out.println("계좌2");
			System.out.println(b);
		}
	}

}
