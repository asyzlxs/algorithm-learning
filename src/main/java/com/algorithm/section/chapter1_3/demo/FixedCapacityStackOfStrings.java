package com.algorithm.section.chapter1_3.demo;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStrings<Item> {
    private Item[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap) {
//        a = new String[cap];
//        a = new Item[cap];   创建范型数组在java中不允许
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    /**
     * exercise 1_3_1
     * @return
     */
    public boolean isFull() {
        return a.length == N;
    }

    public void push(Item item) {
        if (N == a.length)
            resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

    private void resize(int max) {
//        将大小为N<=max 的栈移动到一个新的大小为max的数组中
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }


    public static void main(String[] args) {
        FixedCapacityStackOfStrings<String> s = new FixedCapacityStackOfStrings<String>(5);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty())
                StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }


}
