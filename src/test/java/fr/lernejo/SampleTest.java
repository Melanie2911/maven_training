package fr.lernejo;

import org.assertj.core.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @org.junit.jupiter.api.Test
    void operation_by_int_should_produce() {
        Sample object = new Sample();
        int x = object.op(Sample.Operation.ADD, 2, 3);
        int y = object.op(Sample.Operation.MULT, 2, 3);
        Assertions.assertThat(x).as("2 + 3 = ").isEqualTo(5);
        Assertions.assertThat(y).as("2 * 3 = ").isEqualTo(6);
    }


    @org.junit.jupiter.api.Test
    void fact_by_negative_int_should_produce_an_exception() {
        Sample object = new Sample();
        //int t = object.fact(-3);
        //Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(t)
        assertThrows(IllegalArgumentException.class, () -> {
            object.fact(-3);
        });
    }

    @org.junit.jupiter.api.Test
    void fact_by_int_should_produce() {
        Sample object = new Sample();
        int j = object.fact(3);
        Assertions.assertThat(j).as("fact(3) = ").isEqualTo(6);
    }
}
