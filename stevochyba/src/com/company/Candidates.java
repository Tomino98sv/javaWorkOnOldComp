package com.company;

import java.util.LinkedList;

public class Candidates {
    private LinkedList<Integer> candidates = new LinkedList<Integer>();
    private boolean deleted = false;
    public void push(int element){
        if(deleted){
            return;
        }
        candidates.add(element);
    }
    public LinkedList<Integer> getCandidates(){
        return deleted?null:this.candidates;
    }
    public int getSize(){
        return deleted?0:this.candidates.size();
    }
    public void delete(){
        deleted = true;
        candidates = null;
    }
}
