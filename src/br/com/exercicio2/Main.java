package br.com.exercicio2;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    CadastroConta novoCadastro = new CadastroConta();
    try {
      String nome = JOptionPane.showInputDialog(null, "Informe o nome");
      int agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código da agencia"));
      String conta = JOptionPane.showInputDialog(null, "Informe o numero da conta");

      novoCadastro.setNome(nome);
      novoCadastro.setAgencia(agencia);
      novoCadastro.setConta(conta);

    } catch (NumberFormatException | InputMismatchException e) {
      JOptionPane.showMessageDialog(null, "Tipo de parametro inválido");
    }
  }
}
