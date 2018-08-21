package com.algorithm.section.chapter1_1.exercise;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex_1_1_15 {

    public static int[] histogram(int[] a, int m) {
        int[] x = new int[m];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < m)
                x[a[i]]++;
        }
        return x;
    }

    public static void main(String[] args) {
        int M = 30;
        int N = 20;
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(M);
        }

        int[] histogram = histogram(a,M);
        int sum = 0;

        for(int i=0;i<histogram.length;i++){
            StdOut.printf("%d:%d\t",i,histogram[i]);
            sum += histogram[i];
        }
        StdOut.println();
        StdOut.println(sum);
    }
}
