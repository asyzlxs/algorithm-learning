package com.algorithm.section.chapter2_3.demo;

import edu.princeton.cs.algs4.StdOut;

public class Dutchflag {

    public static void sort(int[] a) {
        int N = a.length;
        int begin = 0, current = 0, end = N - 1;
        int v;
        while (current <= end) {
            if (a[current] == 0) {
                v = a[begin];
                a[begin++] = a[current];
                a[current++] = v;
            } else if (a[current] == 2) {
                v = a[end];
                a[end--] = a[current];
                a[current] = v;
            } else if (a[current] == 1) {
                current++;
            }

//            StdOut.printf("%d,%d,%d\n", begin, current, end);
        }
    }

    public static void show(int[] a) {
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }


    public static void main(String[] args) {
        int[] a = {0, 1, 2, 1, 1, 2, 0, 2, 1, 0, 1, 2, 2, 0};
        Dutchflag.show(a);
        Dutchflag.sort(a);
        Dutchflag.show(a);

    }
}
