package lab5.src.test;


import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lab5.src.main. *;

public class CalculatorTest {

    private Calculator calc;

    @BeforeClass
    public static void start() {
        System.out.println("Inicializando testes...");
    }

    @Before
    public void init() {
        calc = new Calculator();
    }

    @Test
    public void addTest() {
        double result1;
        result1 = calc.add(0.6, 0.4);
        assertEquals(1, result1, 0.01);

        double result2;
        result2 = calc.add(100, 100);
        assertEquals(200, result2, 0.01);

        double result3;
        result3 = calc.add(0, 0);
        assertEquals(0, result3, 0.01);

    }

    @Test
    public void divideTest() {
        double result1;
        result1 = calc.divide(10, 0);
        assertEquals(0, result1, 0.01);

        double result2;
        result2 = calc.add(10, 1);
        assertEquals(11, result2, 0.01);

        double result3;
        result3 = calc.add(1, 2);
        assertEquals(3, result3, 0.01);
    }

    @Test
    public void sqrtTest() {
        double result1;
        result1 = calc.sqrt(100);
        assertEquals(10, result1, 0.01);

        double result2;
        result2 = calc.sqrt(-100);
        assertEquals(0, result2, 0.01);

        double result3;
        result3 = calc.sqrt(10);
        assertEquals(3.16227766017, result3, 0.01);
    }

    @AfterClass
    public static void close() {
        System.out.println("Testes finalizados!");
    }

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        calcTest.init();
        
        calcTest.addTest();
        calcTest.divideTest();
        calcTest.sqrtTest();
    }
}
