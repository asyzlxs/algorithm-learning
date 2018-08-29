package com.algorithm.section.chapter1_3.exercise;


import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_3_4 {
    /**
     * Parentheses
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        String string = StdIn.readString();
        String[] inputs = string.split("");
        for (String s : inputs) {
            if (s.equals("{") || s.equals("(") || s.equals("["))
                stack.push(s);
            else if (!stack.isEmpty()) {
                if (!match(stack.pop(), s)) {
                    StdOut.println("false");
                    return;
                }
            }

        }
        StdOut.println(stack.isEmpty());
    }


    public static boolean match(String lr, String ri) {
        if (lr.equals("[") && ri.equals("]"))
            return true;
        else if (lr.equals("{") && ri.equals("}"))
            return true;
        else if (lr.equals("(") && ri.equals(")"))
            return true;
        return false;
    }

}
