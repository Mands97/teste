package projetointegrador;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Declarando
        double x1, x2, c, soma, produto, a ;
        
        //Entrada / dando os valores, guardando. 
        System.out.print("Escreva o valor de X1: ");
        x1 = leitor.nextDouble();
        System.out.print("Escreva o valor de X2: ");
        x2 = leitor.nextDouble();
        System.out.print("Escreva o valor de C: ");
        c = leitor.nextDouble();
        
        //Processamento
         soma = x1 + x2;
         produto = x1 * x2;
         a = c / produto;
       
        
        //Saída
        
        System.out.println("A equação que tem raizes x1 e X2 é ax² + bx + c: " + a );
        
        
        
        
    }

}
