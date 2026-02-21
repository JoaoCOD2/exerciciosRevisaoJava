package verificaAdolecente;

import java.util.Scanner;


public class verificaAdolecente {

    
    public static void main(String[] args) throws InterruptedException {
        //Estrutura de decisão
        
        //Verifique se é adolescente (12 a 17 anos):
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Vamos verificar se você ainda é um adolecente!");
        
        Thread.sleep(2000); //Teste delay de mensagem.
        
        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();
        
        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos, não é mais um adolecente!");
        }else if (idade > 12 && idade <= 17) {
            System.out.println("Você tem " + idade + " anos, você ainda é um adolecente!");
        }else{
            System.out.println("Você tem " + idade + " anos, você é uma criança!");
        }
        
        
        
        
    }
    
}
