package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Console {

    public static void play() {
        System.out.println("Стандартная реализация стека");
        Stack<String> stack = new Stack<String>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.print(stack);
        System.out.println();
        System.out.println();

        System.out.println("Выполнение задачи на основе стандартной реализации");
        Stack<String> stackInvert = new Stack<String>();
        for (int i = 0; !stack.isEmpty(); stackInvert.push(stack.pop())) ;
        System.out.print(stackInvert);
        System.out.println();
        System.out.println();

        System.out.println("Выполнение задачи на основе своей реализации");
        MyStack mystack = new MyStack();
        mystack.myPush("1");
        mystack.myPush("2");
        mystack.myPush("3");
        mystack.myPush("4");
        mystack.myPush("5");


        mystack.print();
    }
}
