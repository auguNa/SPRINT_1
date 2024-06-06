package N3Ejercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTestTest {

    String str = "Hello";
    Integer num = 42;
    Double dbl = 3.14;
    Boolean bool = true;

    @Test
    public void testArrayList() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(str);
        list.add(num);
        list.add(dbl);
        list.add(bool);

        Assertions.assertEquals(str, list.get(0));
        Assertions.assertEquals(num, list.get(1));
        Assertions.assertEquals(dbl, list.get(2));
        Assertions.assertEquals(bool, list.get(3));

        Assertions.assertTrue(list.contains(str));
        Assertions.assertTrue(list.contains(num));
        Assertions.assertTrue(list.contains(dbl));
        Assertions.assertTrue(list.contains(bool));

        Assertions.assertEquals(1, list.stream().filter(e -> e.equals(str)).count());
        Assertions.assertEquals(1, list.stream().filter(e -> e.equals(num)).count());
        Assertions.assertEquals(1, list.stream().filter(e -> e.equals(dbl)).count());
        Assertions.assertEquals(1, list.stream().filter(e -> e.equals(bool)).count());

        Character ch = 'A';
        Assertions.assertFalse(list.contains(ch));
    }

}