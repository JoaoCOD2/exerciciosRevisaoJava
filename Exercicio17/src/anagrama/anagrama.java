package anagrama;

import java.util.Arrays;
import java.util.Scanner;

public class anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String p1 = sc.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String p2 = sc.nextLine();

        char[] a1 = p1.toLowerCase().toCharArray();
        char[] a2 = p2.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("São anagramas!");
        } else {
            System.out.println("Não são anagramas!");
        }
    }
}