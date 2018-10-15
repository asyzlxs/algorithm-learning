package com.algorithm.section.chapter2_2.demo;

import com.algorithm.section.chapter2_1.demo.Example;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class MergeBU extends Example {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) {
//            StdOut.printf("sz:%d\n",sz);
            for (int lo = 0; lo < N - sz; lo = lo + sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
//                StdOut.printf("lo:%d mid:%d hi:%d\n",lo,lo+sz-1,Math.min(lo + sz + sz - 1, N - 1) );
//                show(a);

            }
//            show(a);
        }
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSort(a);
        show(a);
    }
}
