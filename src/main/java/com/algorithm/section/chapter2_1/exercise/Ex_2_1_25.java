package com.algorithm.section.chapter2_1.exercise;

import com.algorithm.section.chapter2_1.demo.Example;
import edu.princeton.cs.algs4.In;

public class Ex_2_1_25 extends Example {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int k = 0;
        for (int i = 1; i < N; i++) {
            if (less(a[i], a[k])) k = i;
        }
        exch(a, 0, k);
        for (int i = 1; i < N; i++) {
            for (int j = i; less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSort(a);
        show(a);
    }
}
