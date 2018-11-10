package pa.Calculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator classUnderTest;

    @BeforeEach
    void setUpEach() throws Exception{
        classUnderTest = new Calculator();
    }

    @AfterEach
    void finalizeEach() throws Exception{
        classUnderTest = null;
    }

    @Test
    @DisplayName("add implements Adder")
    void add() {
        assertAll(
                () -> {
                    long[] numbers = {10, 23, -1, 16};
                    long expectedResult = 10 + 23 + -1 + 16;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                },
                () -> {
                    long[] numbers = {100, 102};
                    long expectedResult = 100 + 102;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                },
                () -> {
                    long[] numbers = {0, 0, 0, 0};
                    long expectedResult = 0 + 0 + 0 + 0;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                }

        );

    }

    @Test
    @DisplayName("subtract implements Subtractor")
    void subtract() {

    }

    @Test
    @DisplayName("multiply implements Multiplicator")
    void multiply() {

    }

    @Test
    @DisplayName(("divide implements Divider"))
    void divide() {

    }
}