package pl.sda.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator sut = new Calculator();

    @Test
    @DisplayName("Powinno zwrocic 5 przy dodawaniu 3 do 2")
    void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        int arg1 = 2;
        int arg2 = 3;

        //when
        int actual = sut.add(arg1, arg2);

        //then
        assertEquals(5.0, actual);
    }

    @Test
    void shouldBeDividableByThree() {
        //given
        int arg = 9;

        // when
        boolean actual = sut.isDividableByThree(arg);

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinnno zwracac 14 przy odejmowaniu 7 od 21")
    void shouldReturnFourteenForGivenArgsOnSubstractionOperation() {
        // given
        int arg1 = 21;
        int arg2 = 7;

        //when
        var actual = sut.substract(arg1, arg2);

        //then
        assertEquals(14, actual);
    }

    @Test
    @DisplayName("Powinnno zwracac 10 przy mnożeniu 2 razy 5")
    void shouldReturnTenForTwoTimesFive() {
        // given
        int arg1 = 2;
        int arg2 = 5;

        //when
        int actual = sut.multiplication1(arg1, arg2);

        //then
        assertEquals(10, actual);
    }

    @Test
    @DisplayName("Powinnno zwracac 0 przy mnożeniu razy 0")
    void shouldReturnZeroForMultiplicationZero() {
        // given
        int arg1 = 0;
        int argNotImportant = 859;

        //when
        int actual = sut.multiplication1(arg1, argNotImportant);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinnno zwracac 2 przy dzieleniu 6 przez 3")
    void shouldReturnTwoForDecrementationSixPerThree() {
        // given
        int arg1 = 6;
        int arg2 = 3;

        //when
        int actual = sut.decrementation(arg1, arg2);

        //then
        assertEquals(2, actual);
    }

    @Test
    @DisplayName("Powinnno zwracac 0 przy dzieleniu 0 przez liczbę")
    void shouldReturnZeroForDecrementationZeroPerValue() {
        // given
        int arg1 = 0;
        int arg2 = 3;

        //when
        int actual = sut.decrementation(arg1, arg2);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinnno zwracac 0 przy dzieleniu przez 0")
    void shouldReturnZeroForDecrementationZero() {
        // given
        int argNotImportant = 2587;
        int arg2 = 0;

        //when
        int actual = sut.decrementation(argNotImportant, arg2);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinnno zwracac true dla liczby parzystej")
    void shouldReturnTrueForEvenValue() {
        // given
        int arg = 6;

        //when
        boolean actual = sut.isEven(arg);

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinnno zwracac false dla liczby nieparzystej")
    void shouldReturnFalseForNotValue() {
        // given
        int arg = 5;

        //when
        boolean actual = sut.isEven(arg);

        //then
        assertFalse(actual);
    }

    @Test
    @DisplayName("Powinnno zwracac true dla liczby nieparzystej")
    void shouldReturnTrueForNotEvenValue() {
        // given
        int arg = 11;

        //when
        boolean actual = sut.isNotEven(arg);

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinnno zwracac false dla liczby parzystej")
    void shouldReturnFalseForEvenValue() {
        // given
        int arg = 6;

        //when
        boolean actual = sut.isNotEven(arg);

        //then
        assertFalse(actual);
    }

    @Test
    @DisplayName("Powinnno zwracac 0.5 dla 5 % z 10")
    void shouldReturnProperePercentage() {
        // given
        double arg1 = 10.0d;
        double arg2 = 5.0d;

        //when
        double actual = sut.percentage(arg1,arg2);

        //then
        assertEquals(0.5d, actual,0.000001d);
    }

    @Test
    @DisplayName("Powinnno zwracac 200 dla 10 % z 2000")
    void shouldReturnProperePercentageForIntegerNumber() {
        // given
        double arg1 = 2000d;
        double arg2 = 10d;

        //when
        double actual = sut.percentage(arg1,arg2);

        //then
        assertEquals(200, actual,0.000001d);
    }
}
