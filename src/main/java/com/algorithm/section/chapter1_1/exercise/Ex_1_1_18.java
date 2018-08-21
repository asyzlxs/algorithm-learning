package com.algorithm.section.chapter1_1.exercise;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_18 {

    public static int mystery(int a, int b) {
        StdOut.printf("1...%d,%d\t",a,b);
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery_new(int a, int b) {
        StdOut.printf("2...%d,%d\t",a,b);
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery_new(a + a, b / 2);
        return mystery_new(a + a, b / 2) * a;
    }

    public static void main(String[] args) {
        StdOut.println(mystery(2, 25));

        StdOut.println(mystery_new(2,25));
    }
}
