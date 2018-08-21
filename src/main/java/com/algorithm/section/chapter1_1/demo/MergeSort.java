package com.algorithm.section.chapter1_1.demo;

public class MergeSort {

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

    public static void sort(int[] x, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        sort(x, low, mid);
        sort(x, mid + 1, high);
        mergeSort(x, low, mid, high);
        print(x);
    }

    public static void mergeSort(int[] x, int low, int mid, int high) {
        int[] tempArr = new int[x.length];
        int pos = mid + 1;
        int left = low;
        int tmp = low;
        while (low <= mid && pos <= high) {
            if (x[low] <= x[pos]) {
                tempArr[tmp++] = x[low++];
            }
           else {
                tempArr[tmp++] = x[pos++];
            }
        }
        while (low <= mid) {
            tempArr[tmp++] = x[low++];
        }
        while (pos <= high) {
            tempArr[tmp++] = x[pos++];
        }
        while (left <= high) {
            x[left] = tempArr[left++];
        }
    }

    public static void main(String[] args) {
        int[] x = {1,3,5,9,7};
        print(x);
        sort(x,0,4);
    }
}
