package hw07_1;

public class BankAccount {
	String accountNumber;
	String owner;
	int balance;

	void deposit(int amount){//deposit �޼ҵ�. void�̹Ƿ� return ���� ���� ����.
		balance =balance + amount;//�ܾ׿� amount�� �޾� ������
	}
	void withdraw(int amount){//deposit�� ���������� void �̹Ƿ� return ���� ���� ����.
		balance = balance - amount;//�ܾ׿� amount�� �޾� ����.
	}
	public String toString(){//tostring���� return���� ���� string�� �� ��ü�� ��Ī�� �� ��ü���� ������ָ� tosting�� return���� ����
		return "���¹�ȣ : " + accountNumber +"\n������ : "+owner+ "\n�ܾ� : "+ balance+"\n";
	}
	public void tp(int amount, BankAccount otherAccount){
		withdraw(amount);
		otherAccount.deposit(amount);
	}

}
