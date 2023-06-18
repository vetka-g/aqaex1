package ru.netology;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

@Test
    void ShouldFindIfAmountLessThan1000() {
    CashbackHackService service = new CashbackHackService();
    int amount = 780;
    int expected = 220;
    int actual = service.remain(amount);

    assertEquals(actual, expected);

}

    @Test
    void ShouldFindIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    void ShouldFindIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;
        int expected = 400;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }


}
