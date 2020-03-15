package algorith;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main ob = new Main();
        ob.Binary();
    }

    void arrSum() {
        int i;
        int n;
        int s = 0;
        System.out.println("Enter the range of Array: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            s += arr[i];
        }
        System.out.println("Result " + s);
    }

    void dupplicacy() {
        int i, j, count = 0, n;
        System.out.println("Enter the range");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println("duplicate elements are: " + arr[j]);
                }
            }
        }
        System.out.println("total duplicate numbers are: " + count);
    }

    void insert() {
        int i, k, n, pos;
        System.out.println("Enter the range of array: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int arr[] = new int[n];
        int newarr[] = new int[n + 1];
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("main arr:  ");
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
        System.out.println("which position you wanna insert: ");
        pos = input.nextInt();
        for (i = 0; i < newarr.length; i++) {
            if (i < pos - 1) {
                newarr[i] = arr[i];
            } else if (i == pos - 1) {
                System.out.println("Enter the elements in position: " + pos);
                k = input.nextInt();
                newarr[i] = k;
            } else {
                newarr[i] = arr[i - 1];
            }
        }
        System.out.print("new array: ");
        for (i = 0; i < n + 1; i++) {
            System.out.print(" " + newarr[i] + " ");
        }
        System.out.println();
    }

    void Binary() {
        int i, n, key;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of the array: ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array: ");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the search value: ");
        key = input.nextInt();
        int first = 0, last = n - 1, mid = (first + last) / 2;
        while (first <= last) {
            if (key < 0) {
                System.out.println("invalid input");
                break;
            }
            if (arr[mid] < key)
                first = mid + 1;

            else if (arr[mid] == key) {
                System.out.println(key + " Elements found on position : " + (mid + 1));
                break;
            } else
                last = mid - 1;
            mid = (first + last) / 2;

        }
        if (first > last)
            System.out.println("Element is not found!");


    }


}
