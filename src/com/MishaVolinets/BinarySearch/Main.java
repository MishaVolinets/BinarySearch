package com.MishaVolinets.BinarySearch;

/**
 * Created by misha on 27.07.16.
 */
public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{25,4,13,2,6,234,12,56,3,26};
        int i = 0;
        array = BinarySearch.sort(array);
        for (int x:
             array) {
            System.out.println(i + ". " + x);
            i++;
        }

        int n = BinarySearch.search(56,array,0,array.length-1);
        if(n != -1) System.out.println(n);
        else System.out.println("ERROR");
        System.out.println("Hello GitHub, I love YOU! ;)");
    }
}
