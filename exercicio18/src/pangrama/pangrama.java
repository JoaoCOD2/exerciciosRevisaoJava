package pangrama;

import java.util.Scanner;

public class pangrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();

        boolean pangrama = true;

        for (char letra = 'a'; letra <= 'z'; letra++) {
            if (!frase.contains(String.valueOf(letra))) {
                pangrama = false;
                break;
            }
        }

        if (pangrama) {
            System.out.println("É um pangrama!");
        } else {
            System.out.println("Não é um pangrama!");
        }
    }
}