package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenOdd {
    public static int[]  inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the value in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The value in the array you have entered is: " + Arrays.toString(arr));
        return arr;
    }
    public static void sortEvenOdd(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(arr[left] % 2 == 0){
                left++;
            }
            while(arr[right] % 2 == 1){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        System.out.println("");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = inputArray();
        sortEvenOdd(arr);
    }
}
