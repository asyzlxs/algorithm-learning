package com.algorithm.section.chapter1_1.exercise;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_14 {

    public static int lg(int N) {
        int i = 0;
        while (pow(2, i) < N) {
            i++;
        }
        return i - 1;

    }

    public static int pow(int a, int x) {
        int pow = a;
        for (int i = 0; i < x - 1; i++) {
            pow = pow * a;
        }
        return pow;
    }

    public static void main(String[] args) {

        StdOut.println(lg(18));

    }
}
