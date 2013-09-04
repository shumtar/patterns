package statepattern.businessaccount.state;

import statepattern.businessaccount.BusinessAccount;

public class OverDrawnState extends State {

	private static final String TRANSACTION_FEE_WAS_CHARGED_DUE_TO_ACCOUNT_STATUS_LESS_THEN_MINIMUM_BALANCE = "Transaction fee was charged due to account status (less then minimum balance)";
	
	public OverDrawnState(BusinessAccount account) {
		
		super(account);
		
		sendAttention();
	}

	private void sendAttention() {
		System.out.println("Attention your account is overdrawv");
	}

	public OverDrawnState(State source) {
		super(source);
		sendAttention();
	}
	@Override
	public State transitionState() {
		double balance = getContext().getBalance();

		if(balance >= BusinessAccount.MIN_BALANCE){
			getContext().setState(new NoTransactionFeeState(this));
		}
		else if(balance >=0){
			getContext().setState(new TransactionFeeState(this));
		}
		return getContext().getState();
	}

	@Override
	public boolean deposit(double amount) {
		return super.deposit(amount);
	}


	
	@Override
	public boolean withdraw(double amount) {

		double balance = getContext().getBalance();

		if ((balance - BusinessAccount.TRANS_FEE_OVERDRAW - amount) > BusinessAccount.OVERDRAW_LIMIT) {
			
			getContext().setBalance(balance - BusinessAccount.TRANS_FEE_OVERDRAW);

			System.out
					.println(TRANSACTION_FEE_WAS_CHARGED_DUE_TO_ACCOUNT_STATUS_LESS_THEN_MINIMUM_BALANCE);
			return super.withdraw(amount);

		} else {
			System.out.println(BusinessAccount.ERR_OVERDRAW_LIMIT_EXCEED);
			return false;
		}
	}
}
