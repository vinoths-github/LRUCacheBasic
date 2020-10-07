package org.vinoth.impl;

import org.vinoth.model.LRU;

public class LRUImpl {

    private int MAX = 10;
    private int count[] = new int[100];

    LRU lru = new LRU();
    public void add(Integer in) {
        if(lru.getHm().containsKey(in)) {
            count[in]++;
            lru.getDq().remove(in);
            lru.getDq().addFirst(in);
        }
        else {
            count[in] = 0;
            if(lru.getDq().size() == MAX) {
                lru.getDq().removeLast();
                lru.getHm().remove(in);
            }
        }
        lru.getDq().addFirst(in);
        count[in]++;
        lru.getHm().put(in,count[in]);
    }

    public void printQueue() {
        for(Integer in : lru.getDq()) {
            System.out.print(in + " ");
        }
    }
    public Integer update(Integer in, Integer x) {
        if(lru.getHm().containsKey(in)) {
            lru.getDq().remove(in);
            lru.getHm().remove(in);
            in = x;
            lru.getDq().addFirst(in);
            lru.getHm().put(in,0);
        }
        return in;
    }

}
