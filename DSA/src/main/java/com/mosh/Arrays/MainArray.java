package com.mosh.Arrays;

import com.mosh.Arrays.Array;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {
    Array numbers = new Array(3);
    numbers.insert(10);
    numbers.insert(20);
    numbers.insert(30);
    numbers.insert(40);
    numbers.removeAt(2);
        numbers.print();
    }
}
