package statepattern.businessaccount.state;

import statepattern.businessaccount.BusinessAccount;

public class TransactionFeeState extends State {

	private static final String TRANSACTION_FEE_WAS_CHARGED_DUE_TO_ACCOUNT_STATUS_LESS_THEN_MINIMUM_BALANCE = "Transaction fee was charged due to account status (less then minimum balance)";

	public TransactionFeeState(BusinessAccount account) {
		super(account);
	}

	public TransactionFeeState(State source) {
		super(source);
	}

	@Override
	public boolean deposit(double amount) {
		double balance = getContext().getBalance();

		getContext().setBalance(balance - BusinessAccount.TRANS_FEE_NORMAL);

		System.out
				.println(TRANSACTION_FEE_WAS_CHARGED_DUE_TO_ACCOUNT_STATUS_LESS_THEN_MINIMUM_BALANCE);

		return super.deposit(amount);
	}

	@Override
	public boolean withdraw(double amount) {

		double balance = getContext().getBalance();

		if ((balance - BusinessAccount.TRANS_FEE_NORMAL - amount) > BusinessAccount.OVERDRAW_LIMIT) {
			
			getContext().setBalance(balance - BusinessAccount.TRANS_FEE_NORMAL);

			System.out
					.println(TRANSACTION_FEE_WAS_CHARGED_DUE_TO_ACCOUNT_STATUS_LESS_THEN_MINIMUM_BALANCE);
			return super.withdraw(amount);

		} else {
			System.out.println(BusinessAccount.ERR_OVERDRAW_LIMIT_EXCEED);
			return false;
		}
	}

	@Override
	public State transitionState() {
		double balance = getContext().getBalance();
		if (balance < 0) {
			getContext().setState(new OverDrawnState(this));
		} else if (balance > BusinessAccount.MIN_BALANCE) {
			getContext().setState(new NoTransactionFeeState(this));
		}
		return getContext().getState();
	}

}
