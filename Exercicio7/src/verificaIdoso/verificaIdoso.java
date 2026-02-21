
package verificaIdoso;

import java.util.Scanner;


public class verificaIdoso {

    
    public static void main(String[] args) throws InterruptedException {
        //Estruturas de decisão
        
        //Verifique se é idoso (60+):
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Vamos verificar se você é idoso!");
        
        Thread.sleep(2000);
        
        System.out.print("Insira sua idade:");
        int idade = sc.nextInt();
        
        if (idade >= 60){
            System.out.println("Você tem " + idade + " anos, você é idoso!");
        }else if (idade >= 18 && idade < 60){
            System.out.println("Você tem " + idade + " anos, você é adulto!");
        }else if (idade > 12 && idade <= 17){
            System.out.println("Você tem " + " anos, você é adocelente!");
        }else{
            System.out.println("Você tem " + " anos, você é criança!");
        }
        
        
    }
    
}
