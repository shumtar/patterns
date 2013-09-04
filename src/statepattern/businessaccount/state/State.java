package statepattern.businessaccount.state;

import statepattern.businessaccount.BusinessAccount;

public class State {

	private BusinessAccount context;
	
	public BusinessAccount getContext() {
		return context;
	}

	public void setContext(BusinessAccount context) {
		this.context = context;
	}
	
	public State transitionState(){
		return null;
	}

	public State(BusinessAccount account) {
		setContext(account);
	}
	
	public State(State source) {
		setContext(source.getContext());
	}

	public static State InitialState(BusinessAccount businessAccount) {
		return new NoTransactionFeeState(businessAccount);
	}
	
	public boolean deposit(double amount) {
		double balance = getContext().getBalance();
		getContext().setBalance(balance+amount);
		transitionState();
		System.out.println("An amount "+amount+" is withdraw ");
		return true;
	}
	
	public boolean withdraw(double amount) {
		double balance = getContext().getBalance();
		getContext().setBalance(balance-amount);
		transitionState();
		System.out.println("An amount "+amount+" is withdraw ");
		return true;
	}
	

}
