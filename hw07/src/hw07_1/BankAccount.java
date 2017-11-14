package hw07_1;

public class BankAccount {
	String accountNumber;
	String owner;
	int balance;

	void deposit(int amount){//deposit 메소드. void이므로 return 값을 받지 않음.
		balance =balance + amount;//잔액에 amount를 받아 더해줌
	}
	void withdraw(int amount){//deposit과 마찬가지로 void 이므로 return 값을 받지 않음.
		balance = balance - amount;//잔액에 amount를 받아 빼줌.
	}
	public String toString(){//tostring으로 return값을 받은 string을 그 객체의 명칭에 들어가 객체명을 출력해주면 tosting의 return값을 받음
		return "계좌번호 : " + accountNumber +"\n예금주 : "+owner+ "\n잔액 : "+ balance+"\n";
	}
	public void tp(int amount, BankAccount otherAccount){
		withdraw(amount);
		otherAccount.deposit(amount);
	}

}
