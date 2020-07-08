package com.company;

import javax.swing.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                (new Choice()).setVisible(true);
            }
        });
    }

    public static String[] process(String[] arr) {
        List.arrayToList(arr).forWindowInArray();
        return arr;
    }
}


