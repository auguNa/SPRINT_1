package N1Ejercicio1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class MonthListTest extends TestCase {
    MonthList monthList = new MonthList();

    @Test
    public void testMonthList() {
        int expected = 12;
        int actual = monthList.getMonths().size();
        Assert.assertEquals(expected, actual);
    }
        @Test
               public void notNullTest() {
            Assert.assertNotNull(monthList.getMonths());
        }

        @Test
        public void haveAugustTest() {
            String expected = "August";
            String actual = monthList.getMonths().get(7);
            Assert.assertEquals(expected, actual);
        }
    }

