package com.algorithm.section.chapter2_3.demo;

import com.algorithm.section.chapter2_1.demo.Example;
import com.algorithm.section.chapter2_1.demo.Insertion;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

public class Quick extends Example {

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(v, a[--j])) if (j == lo) break;
            while (less(a[++i], v)) if (i == hi) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSort(a);
        show(a);
    }
}
