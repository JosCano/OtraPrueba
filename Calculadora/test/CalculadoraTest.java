/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(1,2);
        int expResult = 3;
        int result = instance.suma();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora(2,2);
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta2() {
        System.out.println("resta 2");
        Calculadora instance = new Calculadora(2,4);        
        assertFalse(instance.resta2());
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = new Calculadora(3,2);
        int expResult = 6;
        int result = instance.multiplica();
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = new Calculadora(4,2);
        int expResult = 2;
        int result = instance.divide();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        System.out.println("divide 2");
        Calculadora instance = new Calculadora(4,0);        
        Integer result = instance.divide();
        assertNull(result);        
    }
    
    /**
     * Test of divide0 method, of class Calculadora.
     */
    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivide0() {
        System.out.println("divide 0");
        Calculadora instance = new Calculadora(4,0);        
        Integer result = instance.divide0();
          
    }
    
    
    
}
