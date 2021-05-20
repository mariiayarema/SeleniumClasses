package com.syntax.test;

public class g {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,5,0};
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j]=arr[j-1];
                }
                i++; // we don't want to traverse over the duplicate zero
            }
            System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}
