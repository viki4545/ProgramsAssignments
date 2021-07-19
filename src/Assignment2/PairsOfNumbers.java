package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PairsOfNumbers {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements present in the array are: "+ Arrays.toString(arr));
        return arr;
    }
    public static void pairsOfNumber(int arr[]){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int a,b;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                b = target - a;
                if(b == arr[j]){
                    System.out.print("(" + a + "," + b + ")" + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = inputArray();
        pairsOfNumber(arr);
    }
}
