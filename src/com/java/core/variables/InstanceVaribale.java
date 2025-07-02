package com.java.core.variables;

public class InstanceVaribale {
	String acountHolderName;
	double acountBalance;	
	double balanceBeforeDebit;	
	double balanceAfterDebit;
	double debitedAmount;
	boolean isDebited;
	char rupeeUnicode;
	
	public InstanceVaribale() {
		
		this.acountHolderName = "Ajaaj Ahmad";
		this.balanceBeforeDebit = 1000.0d;
		this.debitedAmount = 599.0d;
		this.balanceAfterDebit = balanceBeforeDebit -  debitedAmount;
		this.rupeeUnicode = '\u20B9';
		this.isDebited = false;
	}
	public static void main(String[] args) {
		
		InstanceVaribale account = new InstanceVaribale();

		if (account.isDebited) {
            System.out.println("Amount is debited and available balance is " + 
                account.rupeeUnicode + account.balanceAfterDebit);
        } else {
            System.out.println("Amount is not debited and available balance is " + 
                account.rupeeUnicode + account.balanceBeforeDebit);
        }
        
        System.out.println("Account Holder Name: " + account.acountHolderName);
    }
}
