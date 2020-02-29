package com.company;

import java.util.Scanner;

public class Sorting {


    public static void main(String[] args) {
        //Sorting
         int i, j, n, temp, key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: (range) ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Sorted Elements: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Binary
        System.out.println("Enter the value of key: ");
        key = sc.nextInt();
        int mid, beg = 0, end = n-1;
        mid = (beg + end) / 2;
        while (beg <= end) {
            if (arr[mid] < key) {
                beg = mid+1;
            } else if (arr[mid] > key) {
                end = mid-1;
            } else {
                System.out.println(key + " found on Position: " + (mid+1));
                break;
            }
            mid = (beg+end)/2;
        }
        if(beg>end){
            System.out.println("Elements Not found!");
        }

    }


}
