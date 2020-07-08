package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Choice extends JFrame {
    private JPanel panelMain;
    private JCheckBox consoleCheckBox;
    private JCheckBox windowCheckBox;
    private JButton startButton;
    public static boolean console1;
    public static boolean window1;


    public Choice() {
        this.setTitle("Выбор формата");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLocationRelativeTo(null); //запуск окна в центре

        final int[] console = new int[1];
        final int[] window = new int[1];

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(console[0] == 1 && window[0] != 1) {
                    Choice.this.setVisible(false);
                    Console.play();
                }
                if (window[0] == 1 && console[0] != 1){
                    Choice.this.setVisible(false);
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            (new Window()).setVisible(true);
                        }
                    });
                }
                if (console[0] == 0 && window[0] == 0) {
                    JOptionPane.showMessageDialog(null, "Выбрано сразу два или не выбрано ничего, пожалуйста повторите");
                }
                if (console[0] == 1 && window[0] == 1) {
                    JOptionPane.showMessageDialog(null, "Выбрано сразу два или не выбрано ничего, пожалуйста повторите");
                }
                console[0] = 0;
                window[0] = 0;
            }
        });


        consoleCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == 1) {
                    console[0] = 1;
                }
            }
        });

        windowCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == 1) {
                    window[0] = 1;
                }
            }
        });

    }
}
