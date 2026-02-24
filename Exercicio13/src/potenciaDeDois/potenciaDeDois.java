package potenciaDeDois;

import java.util.Scanner;

public class potenciaDeDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        boolean potencia = true;

        if (n < 1) {
            potencia = false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                potencia = false;
                break;
            }
            n = n / 2;
        }

        if (potencia) {
            System.out.println("É potencia de 2!");
        } else {
            System.out.println("Não é potencia de 2!");
        }
    }
}