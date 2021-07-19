package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CountPrimeNumbers {

   public static int[] inputArray(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of an array: ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter the array elements: ");
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
       System.out.println("Elements present in the array are: " + Arrays.toString(arr));
       return arr;
   }
   static boolean checkPrime (int n){
       if(n < 2) return false;
       for (int j = 2; j <= Math.sqrt(n); j++) {
           if(n%j == 0){
               return false;
           }
       }
       return true;
   }
   public static int countPrime(int arr[]){
       int count = 0    ;
       for (int i = 0; i < arr.length; i++) {
           if(checkPrime(arr[i])){
               count++;
           }
       }
       System.out.println("No of prime numbers in the array are: " + count);
       return count;
   }
    public static void main(String[] args) {
       int arr[] = inputArray();
       countPrime(arr);
    }
}
