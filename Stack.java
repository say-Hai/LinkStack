package com.company;
import java.util.Iterator;
public class Stack<Item>{
    private int N;
    private Node first;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item=item;
        first.next=oldfirst;
        N++;
    }
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
