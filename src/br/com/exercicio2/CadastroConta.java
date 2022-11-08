package br.com.exercicio2;

import java.util.InputMismatchException;

public class CadastroConta {
  private String nome;
  private int agencia;
  private String conta;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    try {
      this.nome = nome;
    } catch (InputMismatchException e) {
      System.out.println("Parametro inválido");
    }
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    try {
      this.agencia = agencia;
    } catch (InputMismatchException e) {
      System.out.println("Parametro inválido");
    }
  }

  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    try {
      this.conta = conta;
    } catch (InputMismatchException e) {
      System.out.println("Parametro inválido");
    }
  }

  public void inserir() {

  }

}
