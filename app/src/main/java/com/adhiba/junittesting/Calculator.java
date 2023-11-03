package com.adhiba.junittesting;

public class Calculator {

    public int add(int a, int b) { //metode untuk menambahkan 2 angka
        return a + b;
    }

    public int subtract(int a, int b) { //metode untuk pengurangan 2 angka
        return a - b;
    }

    public int multiply(int a, int b) { //metode untuk perkalian 2 angka
        return a * b;
    }

    public double divide(int a, int b) { //metode untuk pembagian 2 angka
        if (b == 0) {
            throw new IllegalArgumentException("Tidak bisa melakukan pembagian dengan nol.");
        }
        return (double) a / b; //menggunakan pembagian floating-point untuk mendapatkan hasil desimal
    }
}

