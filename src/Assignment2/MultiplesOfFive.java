package com.company;

public class MultiplesOfFive {
    public static int multiplesOfFiveInArray(){
        int count = 0;
        int arr[] = {5,45,23,63,27,80,15,2,65,30};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%5 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int output = multiplesOfFiveInArray();
        System.out.println(output);
    }
}
