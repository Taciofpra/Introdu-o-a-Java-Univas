/* Peça ao usuário para digitar um número inteiro n. Use
um loop for para somar os quadrados de todos os números pares de 1 a n e exiba o
resultado */

import java.util.Scanner;

public class somaQuadradosPares{
    public static void main(String[] args) {
        int soma = 0;
        int n, i;
        
        System.out.println("-----------------------------------");
        System.out.println("---Soma dos quadrados pares de N---");
        System.out.println("-----------------------------------");

        //entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite o valor de N: ");
            n = input.nextInt();
        }

        //processamento de dados
        for(i=0;i<=n;i++){
            if(i%2 ==0){
                soma += i*i;
            }
        }
        
        //saida de dados
        System.out.println("Soma dos quadrados de 1 a "+n+" = "+soma);
    }
}
