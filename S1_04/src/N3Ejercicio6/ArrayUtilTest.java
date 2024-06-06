package N3Ejercicio6;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


class ArrayUtilTest {
    @Test
    public void testArrayIndexOutOfBoundsException() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3};


        AssertionsForClassTypes.assertThatThrownBy(() -> arrayUtil.getElementAtIndex(array, 5))
                .isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("Index 5 out of bounds for length 3");
    }
}