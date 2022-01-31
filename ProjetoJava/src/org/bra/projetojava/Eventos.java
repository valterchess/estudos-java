package org.bra.projetojava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos extends JFrame implements ActionListener {
    public Eventos(){
        super("Meus Eventos");

        JButton botao = new JButton("clique");
        botao.addActionListener(this);

        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Eventos();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Você clicou!");
    }
}