package com.algorithm.section.chapter1_1.exercise;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_19 {

    public static long[] tempArr;

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {
        int N = 25;
        long startTime = System.currentTimeMillis();    //获取开始时间
        for (int i = 0; i < N; ++i) {
            StdOut.println(i + " : " + F(i));
        }
        long endTime = System.currentTimeMillis();    //获取结束时间

        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间


        startTime = System.currentTimeMillis();    //获取开始时间
        tempArr = new long[N+1];
        for (int i = 0; i < N; ++i) {
            StdOut.println(i + " : " + Fibonacci(i));
        }
        endTime = System.currentTimeMillis();    //获取结束时间

        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间

        startTime = System.currentTimeMillis();    //获取开始时间
        for (int i = 0; i < N; ++i) {
            StdOut.println(i + " : " + Fib(i));
        }
        endTime = System.currentTimeMillis();    //获取结束时间

        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间

        startTime = System.currentTimeMillis();    //获取开始时间
        for (int i = 0; i < N; ++i) {
            StdOut.println(i + " : " + fib(i));
        }
        endTime = System.currentTimeMillis();    //获取结束时间

        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间

    }


    public static long Fibonacci(int N) {
        long[] arr = tempArr;
        return f(N, arr);
    }

    public static long f(int N, long[] arr) {
        if (arr[N]==0){
            if (N == 1) arr[N] = 1;
            else if (N > 1) {
                arr[N] = f(N - 1, arr) + f(N - 2, arr);
            }
        }
        return arr[N];
    }

    public static long Fib(int N) {
        long[] f = new long[N + 1];
        return Fib(N, f);
    }

    public static long Fib(int N, long[] f) {
        if (f[N] == 0) {
            if (N == 1)
                f[N] = 1;
            else if (N > 1)
                f[N] = Fib(N - 1, f) + Fib(N - 2, f);
        }

        return f[N];
    }

    public static long fib(int n) {
        long[] array = new long[n+1]; // vector<int > array(n+1);
        if(n == 0 || n == 1)
            return n;
        array[0] = 0;
        array[1] = 1;
        int i = 2;
        while(i < n+1)
        {
            array[i] = array[i-1] + array[i-2];
            i++;
        }
        return array[n];
    }
}
