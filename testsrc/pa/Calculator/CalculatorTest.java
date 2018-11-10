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
        assertAll(
                () -> {
                    long[] numbers = {100, 34, -17, 4};
                    long expectedResult = 100 - 34 - (-17) - 4;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                },
                () -> {
                    long[] numbers = {200, 300, -400};
                    long expectedResult = 200L - 300L - (-400L);
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                },
                () -> {
                    long[] numbers = {0, 0, 0, 0};
                    long expectedResult = 0L;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                }
        );
    }

    @Test
    @DisplayName("multiply implements Multiplicator")
    void multiply() {
        assertAll(
                () -> {
                    long[] numbers = {10, 9, 1, 0};
                    long expectedResult = 0L;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                },
                () -> {
                    long[] numbers = {200, 300, -400};
                    long expectedResult = -24_000_000L;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                },
                () -> {
                    long[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
                    long expectedResult = 36_288_000_000_000_000L;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                }
        );
    }

    @Test
    @DisplayName(("divide implements Divider"))
    void divide() {
        assertAll(
                () -> {
                    try{
                        long[] numbers = {10, 9, 1, 0};
                        long expectedResult = 0L;
                        long givenResult = classUnderTest.add(numbers);
                        assertEquals(expectedResult, givenResult);
                    } catch (ArithmeticException e) {
                        System.out.println("Don't divide by 0");
                    }
                },
                () -> {
                    long[] numbers = {81, 9, 3};
                    long expectedResult = 3;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                },
                () -> {
                    long[] numbers = {100, 50, 1};
                    long expectedResult = 2;
                    long givenResult = classUnderTest.add(numbers);
                    assertEquals(expectedResult, givenResult);
                }
        );
    }
}