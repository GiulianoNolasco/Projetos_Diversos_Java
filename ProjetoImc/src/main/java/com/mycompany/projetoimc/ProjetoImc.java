package com.mycompany.projetoimc;

import javax.swing.JOptionPane;

public class ProjetoImc {

    public static void main(String[] args) {
        pessoa p1 = new pessoa(
                JOptionPane.showInputDialog(null, "Qual o seu nome?"),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o seu peso?")),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua altura?")));

        JOptionPane.showMessageDialog(null, p1.avaliacaoFinal(p1));
    }
}
