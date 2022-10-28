package prob05;

public class Account {
	private int accountNo;
	private int balance;
	private String account;
	
	public Account(int accountNo,int balance, String account) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.account = account;
		
	}




	public String getAccount() {
		return account;
	}




	public void setAccount(String account) {
		this.account= account;
	}




	public Account(String Account) {
		System.out.println(Account+"계좌가 개설 되었습니다.");
	}




	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int deposit) {
		balance  -= deposit;
	}
	public void save(int save) {
		balance += save;
	}

	
}
