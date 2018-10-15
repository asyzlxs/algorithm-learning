package com.algorithm.section.chapter2_3.demo;

import com.algorithm.section.chapter2_1.demo.Example;
import edu.princeton.cs.algs4.In;

public class Quick3way extends Example {

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }


    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt--);
            else i++;
        }
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSort(a);
        show(a);
    }
}
