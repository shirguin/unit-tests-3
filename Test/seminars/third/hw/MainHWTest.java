package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    public void isEvenNumber() {
        MainHW entity = new MainHW();
        assertEquals(true, entity.isEvenNumber(10));
        assertEquals(false, entity.isEvenNumber(9));
        assertEquals(true, entity.isEvenNumber(0));

    }

    @Test
    void isNumberInInterval_25_100() {
        MainHW entity = new MainHW();
        assertEquals(true, entity.isNumberInInterval_25_100(50));
        assertEquals(true, entity.isNumberInInterval_25_100(25));
        assertEquals(true, entity.isNumberInInterval_25_100(100));
        assertEquals(false, entity.isNumberInInterval_25_100(24));
        assertEquals(false, entity.isNumberInInterval_25_100(101));

    }
}