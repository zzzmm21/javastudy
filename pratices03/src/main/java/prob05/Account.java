package prob05;

public class Account {
	private String accountNo;
	private int balance;
	private String account;
	
	public Account(String accountNo, int balance, String account) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.account = account;
		
	}
	public Account(String Account) {
		System.out.println(Account+"계좌가 개설 되었습니다.");
	
	
	
	}
	public void accountNo(String accountNo) {
		this.accountNo=account;
	}

	

	public String getAccount() {
		return account;
	}




	public void setAccount(String account) {
		this.account= account;
	}




	




	public String getAccountNo() {
		return "078-3762-293";
	}
	public void setAccountNo(String accountNo) {
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
