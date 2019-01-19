package atm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Atm {

	private int balance;
	private String requiredPin;

	public Atm(int balance, String requiredPin) {
		this.balance = balance;
		this.requiredPin = requiredPin;
	}

	public int getBalance() {
			return balance;
	}
	public String getPin() {
		return requiredPin;
	}

	public void withdraw(int amount) {
		if(balance > amount) {
		balance -= amount;
		} else {
		balance -= balance;
		}
		}

	public void deposit(int amount) {
		balance += amount;
		
	}

	public boolean allowAccess(String enteredPin) {
		if(requiredPin.equals(enteredPin)) {
			return true;
		}
	return false;
		
	}
}
