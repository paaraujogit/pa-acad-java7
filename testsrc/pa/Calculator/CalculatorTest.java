package pa.Calculator;

import org.junit.jupiter.api.*;

class CalculatorTest {

    private Calculator classUnderTest;

    @BeforeAll
    static void initializer(){

    }

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