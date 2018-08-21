package com.algorithm.section.chapter1_1.demo;

public class BaseCalculation {

    public static double abs(double x) {
        if (x < 0) return -x;
        else return x;
    }

    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i * i < N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (abs(t - t / c) > err * t)
            t = (t + c / t) / 2.0;
        return t;
    }

    public static double hypotenuse(double a, double b) {
        return sqrt(a * a + b * b);
    }

}
