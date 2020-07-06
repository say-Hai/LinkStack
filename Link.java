package com.company;
import java.util.Iterator;
public class Link<Item> {
    private Node head;
    private class Node{
        Node next;
        Item item;
    }
    public boolean isEmpty(){       //判断是否为空
        return head == null;
    }
    public int linkLength(){        //返回长度
        Node first = new Node();
        first = head;
        int n = 0;
        while(first != null){
            n++;
            first = first.next;
        }
        return n;
    }
    public void clear(){
       head = null;
    }
    public boolean insertList(Item item,int i){
        if(i <= 0|| i > linkLength()){
            return false;
        }
        else
        {
            Node first = new Node();
            first = head;
            for( int j = 0; j < i-1; j++){
                first = first.next;
            }
            Node var = new Node();
            var.item = item;
            var.next = first.next;
            first.next = var;
            return true;
        }
    }
    public boolean deleteList(int i){
        if(i <= 0|| i > linkLength()){
            return false;
        }
        else{
            Node first = head;
            for(int j = 0; j < i-1; j++)
                first = first.next;
            Node var = first.next;
            if(var == null)
                return false;
            first.next = var.next;
            return true;
        }
    }
    public void insertHead(Item a[], int n){ //头插法实现链表
        for(int i = 0; i < n; i++){
            Node oldhead =head;
            head = new Node();
            head.item = a[i];
            head.next = oldhead; //i==0时，head.next == oldhead == null;
        }
    }
    public void insertTail(Item a[], int n){
        Node last = head;
        if(last != null)
            while(last.next != null)
                last = last.next;
        for(int i = 0; i < n; i++){
            Node oldlast = new Node();
            oldlast.item = a[i];
            if(last == null)
            {
                last = oldlast;
                head = last;
                continue;
            }
            else
                last.next = oldlast;
            last = oldlast;
           /*
            Node oldlast = last;
            last = new Node();
            last.item = a[i];
            last.next = null;
            if( isEmpty() ){    //如果现在链表为空，则head和last都指向新增的元素,防止空指针异常
                head = last;
            }
            else
                oldlast.next = last;
                */
        }
    }
    public void printLink(){
        Node first = head;
        System.out.println();
        for(int i = 0; i < linkLength(); i++){
            if(first != null) {
                System.out.printf(first.item + " ");
                first = first.next;
            }
            else
                break;
        }
    }
}
