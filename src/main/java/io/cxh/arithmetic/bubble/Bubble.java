package io.cxh.arithmetic.bubble;

/**
 * 冒泡排序
 * Created by cxh on 16-7-30.
 */
public class Bubble {

    public static void main(String[] args) {
        int [] arr = {3,5,3,6,8,7,1,9,4,10};
        for (int i = 0; i < arr.length - 1; i ++) {
            for (int j = i + 1; j < arr.length; j ++) {
                int z;
                if (arr[i] > arr[j]) {
                    z = arr[i];
                    arr[i] = arr[j];
                    arr[j] = z;
                }
            }
        }
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
