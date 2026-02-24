package quadradoPerfeito;

import java.util.Scanner;

public class quadradoPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int raiz = (int) Math.sqrt(n);

        if (raiz * raiz == n) {
            System.out.println("É quadrado perfeito!");
        } else {
            System.out.println("Não é quadrado perfeito!");
        }
    }
}