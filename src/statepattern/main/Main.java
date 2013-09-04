package statepattern.main;

import statepattern.businessaccount.BusinessAccount;

public class Main {

	public static void main(String[] args) {
		BusinessAccount businessAccount=new BusinessAccount("qwe");
		businessAccount.setBalance(100);
		System.out.println(businessAccount.getBalance());
		businessAccount.deposit(200);
		System.out.println(businessAccount.getBalance());
		businessAccount.withdraw(400);
		businessAccount.deposit(200);
		businessAccount.withdraw(400);
	
	}

}
