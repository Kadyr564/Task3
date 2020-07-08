package com.company;

public class MyStack {
    //private String top;
    private int top;
    private LinkList head;
    private LinkList stackList;

    public MyStack() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void myPush(String data) {
        LinkList temp = new LinkList(data);
        temp.next = head;
        head = temp;
    }

    public void myPop() {
        LinkList cur = head;
        LinkList prev = null;
        if (cur == head) {
            head = head.next;
        } else {
            prev.next = cur.next;
        }
    }

    public void print() {
        LinkList temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("]");
    }

}
