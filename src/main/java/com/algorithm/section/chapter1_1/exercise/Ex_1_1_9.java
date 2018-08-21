package com.algorithm.section.chapter1_1.exercise;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_9 {

    public static void main(String[] args) {
        int a = 16;
        StdOut.println(Integer.toBinaryString(a));

        String s = "";
        for (int n = a; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        StdOut.println(s);
        StdOut.println(Math.log(1));
    }
}
