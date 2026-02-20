package positivoNegativoZero;

import java.util.Scanner;

public class positivoNegativoZero {
    
    public static void main(String[] args) {
    //Estruturas de Decisão
    
    //Verifique se um número é positivo, negativo ou zero:
    Scanner sc = new Scanner (System.in);
     
        System.out.print("Digite um número:"); 
        
        int number = sc.nextInt();
         
        if (number > 0) {
            System.out.println("O número escolhido é positivo!");
        } else if (number < 0) {
            System.out.println("O número escolhido é negativo");
        } else {
            System.out.println("O número escolhido é igual a zero");
        }
    }
    
}