package com.MishaVolinets.BinarySearch;

/**
 * Created by misha on 27.07.16.
 */
public class BinarySearch {

    public static int[] sort(int[] sortArray){

        for(int i = sortArray.length-1;i>0;i--){
            for(int j = 0;j<i;j++){

                if(sortArray[j] > sortArray[j+1]){
                    int var = sortArray[j];
                    sortArray[j] = sortArray[j+1];
                    sortArray[j+1] = var;

                }

            }
        }

        return sortArray;
    }


    public static int search(int number,int[] array, int low, int higth){
        int mid = low + (higth-low)/2;

        if(array[mid] > number)
            return search(number,array,low,mid-1);
        if(array[mid]< number)
            return search(number,array,mid+1,higth);
        if(array[mid] == number)
            return mid;


        return -1;


    }


}
