package parOuImpar;

import java.util.Scanner;

public class parOuImpar {

    public static void main(String[] args) {
        //Estrutura de decisão

        //Verifique se um número é par ou ímpar:
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro:");
        int number1 = sc.nextInt();

        if (number1 % 2 == 0) {
            System.out.println(number1 + " é par!");
        } else {
            System.out.println(number1 + " é ímpar!");
        }

    }
}
