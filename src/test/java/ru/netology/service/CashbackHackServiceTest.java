package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest{

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }
}