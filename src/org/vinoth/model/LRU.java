package org.vinoth.model;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class LRU {
    private Deque<Integer> dq;
    private HashMap<Integer,Integer> hm;


    public LRU() {
        dq = new LinkedList<>();
        hm = new HashMap<>();
    }

    public Deque<Integer> getDq() {
        return dq;
    }

    public void setDq(Deque<Integer> dq) {
        this.dq = dq;
    }

    public HashMap<Integer, Integer> getHm() {
        return hm;
    }

    public void setHm(HashMap<Integer, Integer> hm) {
        this.hm = hm;
    }

}
