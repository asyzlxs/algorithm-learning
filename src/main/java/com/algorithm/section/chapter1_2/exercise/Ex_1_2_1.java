package com.algorithm.section.chapter1_2.exercise;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_2_1 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] point2DS = new Point2D[N];
        for (int i = 0; i < N; i++) {
            point2DS[i] = new Point2D(Math.random(), Math.random());
        }
        if (N > 1) {
            double min = 0.0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (point2DS[i].distanceTo(point2DS[j]) < min)
                        min = point2DS[i].distanceTo(point2DS[j]);
                }
            }
            StdOut.println(min);
        }

    }
}
