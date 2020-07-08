package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    private  LinkList head;
    public static java.util.List<String> list = new ArrayList<String>();
    public static String[] arr;
    public List() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(String data) {
        LinkList temp = new LinkList(data);
        temp.next = head;
        head = temp;
    }

    public void remove(String key) {
        LinkList cur = head;
        LinkList prev = null;
        if (isEmpty()) {
            System.err.print("Лист пуст");
            return;
        } else {
            while (cur.data != key) {
                prev = cur;
                cur = cur.next;
            }
            if (cur == head) {
                head = head.next;
            } else {
                prev.next = cur.next;
            }
        }
    }

    public int find(String key) {
        LinkList temp = head;
        int n = 0;
        while (temp != null) {
            if (temp.data == key) {
                return n;
            }
            temp = temp.next;
            n++;
        }
        return -1;
    }

    public void printAd(String key) {
        LinkList temp = head;

        while (temp == null) {
            System.out.print(temp.data);
            System.out.println();
            temp = temp.next;
        }
    }

    public void print() {
        LinkList temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            System.out.println();
            temp = temp.next;
        }
    }

    public void forWindowInArray() {
        list.clear();
        LinkList cur = head;
        while (cur != null ) {
            list.add(cur.data);
            cur = cur.next;
        }
        arr = new String[list.size()];
    }

    public static List arrayToList(String[] arr) {
        List list = new List();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static String [] coupList (){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
//        for (int i = 0; i < arr.length / 2; i++) {
//            String tmp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = tmp;
//        }

        return arr;
    }

    public void sum() {
        List sumlist = new List();

        LinkList cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
            sumlist.add(cur.data + cur.next.data);
        }
       sumlist.print();
    }
}
