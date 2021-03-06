package com.algorithm.section.chapter2_1.demo;

import com.algorithm.section.chapter2_1.demo.Example;
import edu.princeton.cs.algs4.In;

public class Selection extends Example {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }

    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSort(a);
        show(a);
    }

}
