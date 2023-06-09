package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void canDepositIntoAccountTest(){
        Account graceAccount = new Account("0342");
        int currentBalance = graceAccount.getBalance("0342");
        assertEquals(0, currentBalance);

        // When I try to deposit 5k
        graceAccount.deposit(5000);

        // check again and get back the new value
        currentBalance = graceAccount.getBalance("0342");
        assertEquals(5000, currentBalance);
    }

    @Test
    public void canDepositIntoAccountTwice(){
        Account graceAccount = new Account("0342");
        graceAccount.deposit(5000);
        int currentBalance = graceAccount.getBalance("0342");
        assertEquals(5000, currentBalance);

        // When I try to deposit 5k
        graceAccount.deposit(5000);
        // check again and get back the new value
        currentBalance = graceAccount.getBalance("0342");
        assertEquals(10000, currentBalance);
    }

    @Test
    public void depositNegativeValue(){
        Account graceAccount = new Account("0342");
        graceAccount.deposit(1000);
        int currentBalance = graceAccount.getBalance("0342");
        assertEquals(1000, currentBalance);

        graceAccount.deposit(-3000);
        currentBalance = graceAccount.getBalance("0342");
        assertEquals(1000, currentBalance);
    }


    @Test
    public void withdraw(){
        Account graceAccount = new Account("0342");
        graceAccount.deposit(5000);
        int currentBalance = graceAccount.getBalance("0342");
        assertEquals(5000, currentBalance);

        graceAccount.withdraw(3000, "0342");
        currentBalance = graceAccount.getBalance("0342");
        assertEquals(2000, currentBalance);
    }
}
