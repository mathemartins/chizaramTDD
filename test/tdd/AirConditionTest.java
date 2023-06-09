package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
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
}
