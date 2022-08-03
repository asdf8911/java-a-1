package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected, "Результат теста");
    }

    @org.testng.annotations.Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected, "Результат теста");
    }

    @org.testng.annotations.Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1001;
        int actual = service.remain(amount);

        assertEquals(actual, expected, "Результат теста");
    }
}