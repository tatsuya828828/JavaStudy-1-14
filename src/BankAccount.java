
public class BankAccount {
	private String accountNumber;
	private int balance;

	public BankAccount(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String toString() {
		return "¥"+ this.balance +"(口座番号="+ this.accountNumber +")";
	}

	public boolean equals(Object object) {
		if(this == object) {
			return true;
		} else if(object instanceof BankAccount) {
			BankAccount bankAccount = (BankAccount) object;
			// trimメソッドで半角スペースを無視できる
			String ba1 = this.accountNumber.trim();
			String ba2 = bankAccount.accountNumber.trim();
			if(ba1.equals(ba2)) {
				return true;
			}
		}
		return false;
	}
}
