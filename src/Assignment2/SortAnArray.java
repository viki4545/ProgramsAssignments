package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {
    public static int[] arrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements present in the unsorted array is: " + Arrays.toString(arr));
        return arr;
    }
    public static void sortTheArray(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            int left = arr[i];
            int right = arr[j];
            if(left == 0){
                i++;
            }
            if(right == 1){
                j--;
            }
            if(left == 1 && right == 0){
                arr[i] = right;
                arr[j] = left;
                i++;
                j--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = arrayInput();
        sortTheArray(arr);
    }
}
