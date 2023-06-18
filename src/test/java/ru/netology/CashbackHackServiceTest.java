package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void ShouldFindIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 780;
        int expected = 220;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void ShouldFindIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void ShouldFindIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;
        int expected = 400;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }


}
