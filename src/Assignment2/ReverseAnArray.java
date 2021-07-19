package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements you want to enter: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements in the array are: " + Arrays.toString(arr));
        return arr;
    }
    public static void reverseArray(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("Reversed array is: " +Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = inputArray();
        reverseArray(arr);
    }
}
