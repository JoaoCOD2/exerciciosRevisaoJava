package exercicio3;

import java.util.Scanner;

public class divisivelPorOutro {
     public static void main(String[] args) {
         //Estrutura de decisão
         
         //Verifique se um número é divisível por outro:
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Vamos verificar se um número é divisivel pelo o outro!");
         
         System.out.print("Escolha o primeiro número: ");
         int number1 = sc.nextInt();
         
         System.out.print("O primeiro número escolhido foi " + number1 + " escolha outro numero:");
         int number2 = sc.nextInt();
         int calculo = (number1/number2);
         
         if (calculo == 0) {
             System.out.println("O numero " + number1 + " é divisivel por " + number2 + "!");
         }else {
             System.out.println("O numero " + number1 + " não é divisivel por " + number2 + "!");
         }
    

    }
    
}
