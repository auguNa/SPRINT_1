package N1Ejercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayHandlerTest {
    @Test
    public void testArray() {
        int[] array = {1, 2, 3};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayHandler handler = new ArrayHandler();
            handler.getElementAtIndex(array, 3);
        });
    }
}

