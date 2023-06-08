package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void canDepositIntoAccountTest(){
        Account graceAccount = new Account();
        int currentBalance = graceAccount.getBalance();
        assertEquals(0, currentBalance);
    }
}
