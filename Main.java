package com.company;

import java.util.Scanner;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Queue<Character> q = new Queue<Character>();
        Stack<Character> s = new Stack<Character>();
        Link<Character> l = new Link<Character>();
        Character[] c = {'a','b','c','-','-','d','-'};
        for(int i = 0; i<c.length; i++){
            if(c[i] != '-'){
                q.enqueue(c[i]);
            }
            else if(!q.isEmpty())
                System.out.printf(q.dequeue() + " ");
        }
        System.out.println();
        for(int i = 0; i<c.length; i++){
            if(c[i] != '-'){
                s.push(c[i]);
            }
            else if(!s.isEmpty())
                System.out.printf(s.pop() + " ");
        }
        //链表

        l.insertHead(c , c.length);
        l.printLink();
        l.deleteList(3);
        l.printLink();
        l.insertList('P',3);
        l.printLink();
        l.clear();
        l.insertTail(c, c.length);
        l.printLink();
    }
}