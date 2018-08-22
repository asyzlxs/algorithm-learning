package com.algorithm.section.chapter1_2.demo;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TypicalStringProcess {

    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; ++i) {
            if (s.charAt(i) != s.charAt(N - 1 - i))
                return false;
        }
        return true;
    }

    //    检查一个字符串数组重的元素是否按照字母表顺序排列
    public boolean isSorted(String[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
//       从命令行提取文件名和扩展名
        String s = args[0];
        int dot = s.indexOf(".");
        String base = s.substring(0, dot);
        String extension = s.substring(dot + 1, s.length());

//        打印出标准输入中所有含有通过命令行指定的字符串的行
        String query = args[0];
        while (!StdIn.isEmpty()) {
            String ss = StdIn.readLine();
            if (s.contains(query)) StdOut.println(ss);
        }

//        以空白字符为分隔符，建立一个输入字符串的数组
        String input = StdIn.readAll();
        String[] word = input.split("\\s+");
    }
}
