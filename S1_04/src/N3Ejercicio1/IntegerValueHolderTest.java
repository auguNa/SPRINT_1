package N3Ejercicio1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerValueHolderTest {

        public void testValuesAreEqual() {
            IntegerValueHolder holder1 = new IntegerValueHolder(100);
            IntegerValueHolder holder2 = new IntegerValueHolder(100);

            Assertions.assertThat(holder1.getValue()).isEqualTo( holder2.getValue());
        }

        @Test
        public void testValuesAreNotEqual() {
            IntegerValueHolder holder1 = new IntegerValueHolder(100);
            IntegerValueHolder holder2 = new IntegerValueHolder(200);

            Assertions.assertThat(holder1.getValue()).isNotEqualTo(holder2.getValue());

        }
    }