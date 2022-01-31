package org.bra.projetojava;

import javax.swing.*;
import java.awt.*;

public class Layouts extends JFrame {

    public Layouts()  {
        getContentPane().add(new JButton("Botão centralizado"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layouts();
    }
}
