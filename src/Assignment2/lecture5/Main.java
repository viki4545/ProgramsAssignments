package com.company.lecture5;

import java.util.Scanner;

public class Main {
    static int search (int[] arr,int l, int h, int key){
        if(l > h) return -1;

        int mid = l + (h-l)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[l] <= arr[mid]){
            if(key >= arr[l] && key <= arr[mid]){
                return search(arr,l,mid - 1,key);
            }
            return search(arr,mid + 1,h,key);
        }

            if(key >= arr[mid] && key <= arr[h]){
                return search(arr,mid+1,h,key);
            }
            return search(arr,l,mid-1,key);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        int key = 10;
        int i = search(arr,0,n-1,key);
        if(i != -1){
            System.out.println("Element found at Index: " + i);
        }else{
            System.out.println("Element not found");
        }
    }
}
