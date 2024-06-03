package com.brocode.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //stack - LIFO - last in first out

        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");

        stack.pop(); //removes the last item from the stack

        stack.peek(); //returns the last item in the stack

        stack.search("Skyrim"); //returns the index of the item

        stack.push("Java"); //adds an item to the stack

        for(int i = 0; i < 1000; i++){
            stack.push("Item " + i);
        }

        System.out.println(stack);

    }
}
