package com.algorithm.section.chapter1_2.exercise;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_2_6 {

    public static void main(String[] args) {

        StdOut.print("s:");
        String s = StdIn.readLine();
        StdOut.print("t:");
        String t = StdIn.readLine();
        if(s.length()==t.length() && s.concat(s).indexOf(t)>=0)
            StdOut.println(s + " is the circular rotation of " + t);
        else
            StdOut.println(s + " is not the circular rotation of " + t);
    }
}
