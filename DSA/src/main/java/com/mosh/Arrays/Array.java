package com.mosh.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int count) {
        this.items = new int[count];
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
