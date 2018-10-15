package com.algorithm.section.chapter3_4;

public class LinearProbingHashST<Key, Value> {
    private int N;
    private int M;
    private Key[] keys;
    private Value[] vals;

    public LinearProbingHashST(int capacity) {
        M = capacity;
        keys = (Key[]) new Object[M];
        vals = (Value[]) new Object[M];
    }

    public int size() {
        return N;
    }

    public boolean isEmpth() {
        return size() == 0;
    }

    public boolean contains(Key key) {
        return get(key) != null;

    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff % M);
    }

    private void resize(int capacity) {
        LinearProbingHashST<Key, Value> temp = new LinearProbingHashST<Key, Value>(capacity);
        for (int i = 0; i < M; i++) {
            if (keys[i] != null)
                temp.put(keys[i], vals[i]);
        }
        keys = temp.keys;
        vals = temp.vals;
        M = temp.M;
    }

    public void put(Key key, Value val) {
        if (N >= M / 2) resize(M * 2);

        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % M) {
            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }
        }
        keys[i] = key;
        vals[i] = val;
        N++;
    }

    public Value get(Key key) {
        for (int i = hash(key); keys[i] != null; i = (i + 1) % M)
            if (keys[i].equals(key)) return vals[i];
        return null;
    }

    public void delete(Key key) {
        if (!contains(key)) return;

        int i = hash(key);

        while (!key.equals(keys[i]))
            i = (i + 1) % M;

        keys[i] = null;
        vals[i] = null;

        i = (i + 1) % M;
        while (keys[i] != null) {
            Key keytorehash = keys[i];
            Value valtorehash = vals[i];
            keys[i] = null;
            vals[i] = null;
            N--;
            put(keytorehash, valtorehash);
            i = (i + 1) % M;
        }

        N--;

        if (N > 0 && N <= M / 8) resize(M / 2);


    }


}
