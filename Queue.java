package com.company;
import java.util.Iterator;
public class Queue<Item> {
    private int N;
    private Node first;
    private Node last;
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
    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){    //如果现在队列为空，则first和last都指向新增的元素
            first = last;
        }
        else
            oldlast.next = last;
        N++;
    }
    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if( isEmpty() ){    //如果队列为空，则将last指向空值
            last = null;
        }
        N--;
        return item;
    }
}
