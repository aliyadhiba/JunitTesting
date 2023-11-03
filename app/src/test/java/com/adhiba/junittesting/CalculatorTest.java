package com.adhiba.junittesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator(); //membuat objek calculator
        int result = calculator.add(10, 3); //memanggil metode add untuk menguji penambahan
        assertEquals(13, result); //menggunakan metode assertEquals untuk membandingkan hasil dengan nilai yang diharapkan
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator(); //membuat objek calculator
        int result = calculator.subtract(7, 2); //memangggil metode substrac untuk menguji pengurangan
        assertEquals(5, result); //menggunakan metode assertEquals untuk membandingkan hasil dengan nilai yang diharapkan
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator(); //membuat objek calculator
        int result = calculator.multiply(2, 5); //memanggil metode multiplay untuk menguji perkalian
        assertEquals(10, result); //menggunakan metode assertEquals untuk membandingkan hasil dengan nilai yang diharapkan
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator(); //membuat objek calculator
        double result = calculator.divide(10, 2); //memanggil metode divide untuk menguji pembagian
        assertEquals(5.0, result, 0.001); //menggunakan metode assertEquals untuk membandingkan hasil dengan nilai yang di harapkan. Toleransi error (delta) digunakan karena pembagian adalah operasi floating-point.
    }
}
