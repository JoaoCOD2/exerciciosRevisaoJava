package aptoADoarSangue;

import java.util.Scanner;


public class aptoADoarSangue {

    
    public static void main(String[] args) {
        //Estruturas de decisão
        
        //Verifique se está apto a doar sangue (18 a 69 anos)
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite sua idade para verificar se você esta apto a doar sangue:");
        
        int idade = sc.nextInt();
        
        
        if (idade >= 18 && idade <= 69) {
            System.out.println("Você está apto para doar sangue!");
        }else {
            System.out.println("Você não está apto para doar sangue");
        }
        
    }
    
}
