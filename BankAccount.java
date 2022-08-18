package bank_account;

public class BankAccount {
	
	public float balance = 0.0f;
	public int accountNumber = 0;
	public String sortcode = "";
	
	public void deposit(float amount){
		this.balance = balance + amount;
	}
	public void  withdraw (float amount){
		this.balance = balance - amount;
	}
	public String summarise(){
	
		return "Account Number: " + accountNumber+ "  " + "Sortcode: " + sortcode
				+ "  " + "Balance: $" + balance;
	}
	public void setBalance( float b)
	{
		this.balance = b;
		
	}
	public void setAccountNumber(int n)
	{
		this.accountNumber = n;
			
		}
	
	public void setSortcode(String s){
	
		this.sortcode = s;
	}
	
	public float getBalance()
	{
		return this.balance;
	}
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	public String getSortcode()
	{
		return this.sortcode;
	}
}
