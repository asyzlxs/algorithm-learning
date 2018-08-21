package com.algorithm.section.chapter1_1.exercise;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_24 {

    public static int eculid(int p, int q) {
        if (p < 1 || q < 1) return -1;
        while (p != q) {
            if (p > q)
                p = p - q;
            if (p < q)
                q = q - p;
        }
        return p;
    }

    public static void main(String[] args) {
        StdOut.println(eculid(105,24));
    }
}
