package com.algorithm.section.chapter1_1.demo;

public class BinarySearch {

    // recursive binary search
    public static int rank(int k, int[] a) {
        return rank(k, a, 0, a.length - 1);
    }

    public static int rank(int k, int[] a, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (k < a[mid]) return rank(k, a, low, mid - 1);
        else if (k > a[mid]) return rank(k, a, mid + 1, high);
        else return a[mid];
    }


    public static int rank_loop(int k, int[] a) {
        int low = 0;
        int high = a.length - 1;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            if (a[mid] == k) return mid;
            if (a[mid] > k) high = mid - 1;
            if (a[mid] < k) low = mid + 1;
            mid = low + (high - mid) / 2;
        }
        return -1;

    }

}
