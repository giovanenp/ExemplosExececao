package br.com.exemplos;

import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        try {
            int dividendo, divisor;
            System.out.println("Digite o valor do dividendo");
            dividendo = s.nextInt();
            System.out.println("Digite o valor do divisor");
            divisor = s.nextInt();

            if (divisor == 0) {
                throw new Exception("Não é possível fazer uma divisão por 0");
            }
            System.out.println(dividendo + "/" + divisor + "=" + (dividendo / divisor));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Bloco Finally");
        }
    }
}
