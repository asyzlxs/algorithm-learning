package com.algorithm.section.chapter2_1.demo;

import com.algorithm.section.chapter2_1.demo.Example;
import edu.princeton.cs.algs4.In;

public class Insertion extends Example {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j >0 && less(a[j], a[j - 1]); j--)
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
