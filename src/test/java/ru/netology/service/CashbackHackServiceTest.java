package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {
    @Test
    void checkRemainWhenAmountEqualsToBoundary() {
        CashbackHackService service = new CashbackHackService();

        long actual = service.remain(1000);
        long expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void checkRemainWhenAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        long actual = service.remain(1100);
        long expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void checkRemainWhenAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        long actual = service.remain(400);
        long expected = 600;

        Assert.assertEquals(actual, expected);
    }
}


