package exercicio5;

import java.util.Scanner;


public class VerificaIdade {

    
    public static void main(String[] args) {
        //Estrutura de decisão
        
       //Verifique se uma pessoa é maior de idade (18+):
       Scanner sc = new Scanner (System.in);
       
        System.out.println("Verificação de idade");
        System.out.print("Qual é sua idade?");
        int idade = sc.nextInt();
        
        if (idade > 18) {
            System.out.println("Você tem " + idade + " anos, você é maior de idade!");
        }else {
            System.out.println("Você tem " + idade + " anos, você é menor de idade!");
        }
       
    }
    
}
