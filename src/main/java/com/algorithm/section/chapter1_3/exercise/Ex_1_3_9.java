package com.algorithm.section.chapter1_3.exercise;


import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_3_9 {

    public static void main(String[] args) {
        Stack<String> vals = new Stack<String>();
        Stack<String> ops = new Stack<String>();
        String s = StdIn.readString();
        String[] inputs = s.split("");

        for (String i : inputs) {
            if (i.equals("-") || i.equals("+") || i.equals("*") || i.equals("/"))
                ops.push(i);
            else if (i.equals(")")) {
                String ri = vals.pop();
                String op = ops.pop();
                String le = vals.pop();
                String re = "(" + le + op + ri + ")";
                vals.push(re);
            } else
                vals.push(i);
        }

        StdOut.println(vals.pop());
    }
}
