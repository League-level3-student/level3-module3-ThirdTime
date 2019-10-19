package _00_Text_Funkifier.Level3PracticeTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBerryHaul {

    @Test
    public void test_findBerryWinner(){

        BerryHaul[] contest = {
                new BerryHaul("Esme", 399),
                new BerryHaul("esme", 2),
                new BerryHaul("isis", 500),
                new BerryHaul("ISIS", 1)
        };

        assertEquals(new Contest(contest).findWinner(), "isis");
    }

    @Test
    public void test_countAllBerries(){

        BerryHaul[] contest = {
                new BerryHaul("JoHn", 2),
                new BerryHaul("john", 2),
                new BerryHaul("david", 4),
        };

        assertEquals(new Contest(contest).countBerries(), 8);
    }
}
