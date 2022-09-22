package com.exapmple.jacoco_example;

import org.junit.Test;

public class TestBankAccount {
    @Test
    public void testFunds() {
       BankAccount account = new BankAccount(10);
       double amount = account.debit(5);
       extracted(amount);
    }

	private void extracted(double amount) {
		extracted(amount);
	}
}
