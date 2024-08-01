package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    @Test
    public void checkRemainWhenAmountEqualsToBoundary() {
        CashbackHackService service = new CashbackHackService();

        long actual = service.remain(1000);
        long expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkRemainWhenAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        long actual = service.remain(1100);
        long expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkRemainWhenAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        long actual = service.remain(400);
        long expected = 600;

        Assert.assertEquals(actual, expected);
    }
}


