package org.bra.projetojava;

import javax.swing.*;

public class MeuFrame {
    public MeuFrame(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MeuFrame();
    }
}
