package numeroArmstrong;

import java.util.Scanner;

public class numeroArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int original = n;
        int soma = 0;
        int digitos = String.valueOf(n).length();

        while (n > 0) {
            int digito = n % 10;
            soma += Math.pow(digito, digitos);
            n = n / 10;
        }

        if (soma == original) {
            System.out.println("É numero de Armstrong!");
        } else {
            System.out.println("Não é numero de Armstrong!");
        }
    }
}