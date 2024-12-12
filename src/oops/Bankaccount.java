package oops;

import java.util.Scanner;

interface BankM{
	public void accountdetails();
	public void balance();
	public void withdraw();
	public void deposit();
}

class BOI implements BankM{
	int balance=100000;
	static String bankname="BOI";
	int withdraw;
	int deposit;
	int accountNo;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountdetails() {
	    System.out.println("Enter your account number:");
	    accountNo=sc.nextInt();
	    System.out.println("Your account details:"+"\n"+accountNo+"\n"+bankname);
		
	}

	@Override
	public void balance() {
		System.out.println("Your current balance is:"+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter amount for withdrawal:");
		withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("Your final balance is :"+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter deposit amount:");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("Your final balance is:"+balance);
		
	}
	
}

public class Bankaccount {

	public static void main(String[] args) {
		BOI ob=new BOI();
		ob.accountdetails();
		ob.balance();
		ob.withdraw();
		ob.deposit();
	

	}

}
