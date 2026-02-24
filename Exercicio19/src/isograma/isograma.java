package isograma;

import java.util.Scanner;

public class isograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        boolean isograma = true;

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j < palavra.length(); j++) {
                if (palavra.charAt(i) == palavra.charAt(j)) {
                    isograma = false;
                    break;
                }
            }
        }

        if (isograma) {
            System.out.println("É um isograma!");
        } else {
            System.out.println("Não é um isograma!");
        }
    }
}