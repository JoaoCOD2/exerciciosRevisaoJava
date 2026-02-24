package fibonacciNumero;

import java.util.Scanner;

public class fibonacciNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        boolean achou = false;

        while (a <= n) {
            if (a == n) {
                achou = true;
                break;
            }
            int c = a + b;
            a = b;
            b = c;
        }

        if (achou) {
            System.out.println("O numero pertence ao Fibonacci!");
        } else {
            System.out.println("O numero NÃO pertence ao Fibonacci!");
        }
    }
}