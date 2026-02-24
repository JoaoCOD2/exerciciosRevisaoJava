package numeroPerfeito;

import java.util.Scanner;

public class numeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        if (soma == n) {
            System.out.println("O numero é perfeito!");
        } else {
            System.out.println("O numero NÃO é perfeito!");
        }
    }
}