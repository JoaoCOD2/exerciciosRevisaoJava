package verificacaoDoTipoDeTriangulo;

import java.util.Scanner;


public class verificacaoDoTipoDeTriangulo {

    
    public static void main(String[] args) throws InterruptedException {
        //Verifique o tipo de triângulo (equilátero, isósceles ou escaleno):
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Vamos verificar o tipo de triângulo!");
        
        Thread.sleep(2000);
        
        System.out.print("Insira o primeiro angulo em números inteiros: ");
        int angulo1 = sc.nextInt();
        
        System.out.print("Insira o segundo angulo em números inteiros: ");
        int angulo2 = sc.nextInt();
        
        System.out.print("Insira o terceiro angulo em números inteiros: ");
        int angulo3 = sc.nextInt();
        
        Thread.sleep(1500);
        
        System.out.println("Ótimo, agora vamos para os lados!");
        
        Thread.sleep(2000);
        
        System.out.print("Insira o primeiro lado em números inteiros: ");
        int lado1 = sc.nextInt();
        
        System.out.print("Insira o segundo lado em números inteiros: ");
        int lado2 = sc.nextInt();
        
        System.out.print("Insira o terceiro lado em números inteiros: ");
        int lado3 = sc.nextInt();
        
        if(angulo1 == angulo2 && angulo2 == angulo3 &&
           lado1 == lado2 && lado2 == lado3){
            System.out.println("Esse triângulo é équilatero!");
            
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Esse triangulo é isóceles");
        
        }else {
            System.out.println("Esse triango é escaleno");
        }
        
        
    }
    
}
