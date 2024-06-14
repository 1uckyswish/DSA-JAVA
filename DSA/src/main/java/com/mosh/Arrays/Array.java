package com.mosh.Arrays;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int count) {
        this.items = new int[count];
    }

    public void reverse(){
        int[] newArray = new int[items.length -1];
        for(int i = 1; i < items.length - 1; i++){
            newArray[i] = items[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    public int max(){ // O(n) run time due to worst case biggest number is at the end
        int start = items[0];

        for(int i : items){
            if(i > start){
                start = i;
            }
        }
        return start;
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int number){
        if(items.length == count){
            int[] newArray = new int[count * 2];
            for(int i = 0; i < count; i++){
                newArray[i] = items[i];
            }
            items = newArray;
        }
        items[count++] = number;

    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

//        for(int i = index; i < count; i++){
//            items[i] = items[i + 1];
//            count--;
//        }

        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int value){
        for(int i = 0; i < items.length; i++){
            if(items[i] == value){
                return i;
            }
        }
        return -1;
    }

}
