package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Calculator instance = new Calculator();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("intial Test Demo")
    void testAdd(){
        int expected = 3;
        int actual = instance.add(1,2);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("intial Test Demo")
    void testSubtract(){
        int expected = 2;
        int actual = instance.subtract(4,2);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("intial Test Demo")
    void testMultiply(){
        int expected = 4;
        int actual = instance.multiply(2,2);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("intial Test Demo")
    void testDivide(){
        int expected = 1;
        int actual = instance.divide(2,2);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("intial Test Demo")
    void testAddString(){
        int expected = 6;
        int actual = instance.add("1,2,3");
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("intial Test Demo")
    void testAddWithArray(){
        int expected = 6;
        int actual = instance.add(new int[]{1,2,3});
        assertEquals(expected,actual);
    }
}