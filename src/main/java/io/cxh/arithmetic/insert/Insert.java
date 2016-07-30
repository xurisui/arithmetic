package io.cxh.arithmetic.insert;

import java.util.Scanner;

/**
 * 插入排序，不完美
 * Created by cxh on 16-7-30.
 */
public class Insert {

    public static void main(String[] args) {

        System.out.println("please enter a int number:");
        Scanner num = new Scanner(System.in);
        int res = num.nextInt();
        int [] arr = {1,3,5,7,9,11,13,15,17,19,25,35,45,55,65,75,85,95,101};
        int [] arr2 = new int[arr.length + 1];

        for (int i = 0; i < arr.length - 1; i ++) {

            if (arr[i] <= res && res <=arr[i + 1]) {
                arr2[i + 1] =res;
                for (int k = 0; k <= i; k ++) {
                    arr2[k] = arr[k];
                }
                for (int j = i + 2; j <arr2.length; j++) {
                    arr2[j] = arr[j - 1];
                }
            }

            if (res > arr[arr.length - 1]) {
                int max = arr2.length - 1;
                arr2[max] = res;
                for (int x = 0; x < arr.length; x++) {
                    arr2[x] = arr[x];
                }
            }

            if (res < arr[0]) {
                arr2[0] = res;
                for (int y = 1; y < arr2.length; y ++) {
                    arr2[y] = arr[y - 1];
                }
            }

        }
        for (int i = 0; i < arr2.length; i ++) {

            System.out.print(arr2[i]);
            System.out.print(" ");
        }
    }
}
