package exercicio4;

import java.util.Scanner;


public class VerificaAnoBissexto {

  
    public static void main(String[] args) {
        //Estrutura de decisão
        
        //Verifique se um ano é bissexto:
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Vamos verificar se um ano é bissexto");
        System.out.print("Escolha um ano: ");
        int year = sc.nextInt();
        
        if (year % 400 == 0){
            System.out.println(year + " é um ano bissexto");
        }else if (year % 4 == 0 && year % 100 !=0) {
            System.out.println(year + " é um ano bissexto");
        }else {
            System.out.println(year + " não é um ano bissexto");
        }
       
    }
    
}
