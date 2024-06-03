package com.brocode.stack;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        // Given a string, reverse the string using a stack.

        String word = "Hello";
        System.out.println(reverse(word));
    }

    public static String reverse(String word) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the word onto the stack
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        // Pop each character from the stack and append to the StringBuilder
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
