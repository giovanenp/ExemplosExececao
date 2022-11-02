package br.com.exercicio1;

import javax.swing.JOptionPane;

public class AplicacaoDivisao {
  public static void main(String[] args) throws Exception {
    int numA = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
    int numB = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));

    Divisao divisao = new Divisao();

    try {
      JOptionPane.showMessageDialog(null, divisao.calcula(numA, numB));
    } catch (ArithmeticException e1) {
      JOptionPane.showMessageDialog(null, "Não pode dividir por zero!");
    }
  }
}
