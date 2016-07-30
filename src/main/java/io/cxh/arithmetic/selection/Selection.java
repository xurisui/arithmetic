package io.cxh.arithmetic.selection;

/**
 * 选择排序
 * Created by cxh on 16-7-30.
 */
public class Selection {

    public static void main(String[] args) {
        int [] arr = {5,3,6,8,4,8,1,9,7,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr [j]) {
                    int z;
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
