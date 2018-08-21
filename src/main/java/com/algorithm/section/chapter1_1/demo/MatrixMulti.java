package com.algorithm.section.chapter1_1.demo;

import edu.princeton.cs.algs4.StdOut;

public class MatrixMulti {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{1, 0}, {1, 1}};
        int N = 2;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++)
                    result[i][j] += a[i][k] * b[k][j];
                System.out.println("i,j:" + result[i][j]);
            }
        }
        StdOut.println("hello world");
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("---------");
        for(int i=0;i<5;++i){
            System.out.println(i);
        }
    }
}

