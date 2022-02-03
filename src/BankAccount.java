/**
 * @author Sofia Rhoades Ortega - scrhoadesortega
 * CIS175 - Fall 2021
 * Feb 2, 2022
 */

public class BankAccount {
	private String name;
	private double balence;
	private boolean premiumAccount;
	
	public BankAccount() {
		this.name = "name";
		this.balence = 0.0;
		this.premiumAccount = false;
	}
	
	public BankAccount(String name, double balence, boolean ifPremiumAccount) {
		this.name = name;
		this.balence = balence;
		this.premiumAccount = ifPremiumAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	public boolean isPremiumAccount() {
		return premiumAccount;
	}

	public void setPremiumAccount(boolean ifPremiumAccount) {
		this.premiumAccount = ifPremiumAccount;
	}
	
	public void withdraw(double withdrawl) {
		this.balence -= withdrawl;
	}
	
	public void deposit(double deposit) {
		this.balence += deposit;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balence=" + balence + ", premiumAccount=" + premiumAccount + "]";
	}
}
