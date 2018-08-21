package com.algorithm.section.chapter1_1.demo;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double low = Double.parseDouble(args[1]);
        double high = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(low,high);
            StdOut.printf("%.2f\n", x);
        }
    }
}
