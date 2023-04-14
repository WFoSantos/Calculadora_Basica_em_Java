import org.w3c.dom.ls.LSInput;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Calculadora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorUm;
        double valorDois;
        String operacao;
        boolean continuar;

try{
    do {
        System.out.println("Digite o Primeiro Valor: ");
        valorUm = scanner.nextDouble();

        System.out.println("Digite a Operação( +, -, /, *): ");
        operacao = scanner.next();

        System.out.println("Digite o Segundo Valor: ");
        valorDois = scanner.nextDouble();

        System.out.println("resultado: " + realizarCalculo(valorUm, valorDois, operacao));

        continuar = verificarNovaOperacao();
    }while (continuar);
} catch (InputMismatchException ex) {
    System.out.println("Por Favor, digite um valor Numérico!");
}
}


    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja Realizar Outra Operação? (S ou N)");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
        Double respostaCalculo = 0.0;
        switch (operacao){
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;

            case "-":
            respostaCalculo = valorUm - valorDois;
                break;

            case "/":
            respostaCalculo = valorUm / valorDois;
                break;

            case "*":
            respostaCalculo = valorUm * valorDois;
                break;

            default:
                System.out.println("Operação Invalida");
        }
        return respostaCalculo;
    }
}