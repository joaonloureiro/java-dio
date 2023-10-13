import exceptions.ParametrosInvalidosException;
import flowcontrol.Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }
    }
}