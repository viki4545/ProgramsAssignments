package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSortedOrNot {
    public static int[] arrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements in the array are: " + Arrays.toString(arr));
        return arr;
    }
    public static void checkArray(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                System.out.println("Array is unsorted");
                return ;
            }
            arr[i] = arr[i+1];
        }
        System.out.println("Array is sorted");
    }
    public static void main(String[] args) {
        int arr[] = arrayInput();
        checkArray(arr);
    }
}
