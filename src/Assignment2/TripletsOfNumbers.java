package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TripletsOfNumbers {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements present in the array are: "+ Arrays.toString(arr));
        return arr;
    }
    public static void tripletsOfNumbers(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value which you want triplets of: ");
        int target = sc.nextInt();
        int a,b,c;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                b = arr[j];
                for (int k = j + 1; k < arr.length; k++) {
                    c = target - (a + b);
                    if(c == arr[k]){
                        System.out.print("(" + a + "," + b + "," + c + ") ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = inputArray();
        tripletsOfNumbers(arr);
    }
}
