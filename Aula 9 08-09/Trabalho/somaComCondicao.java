/* Use um loop while para ler números inteiros
do usuário e somá-los. A repetição deve parar se a soma total ultrapassar
100. Ao final, exiba o valor da soma e o último número digitado */

import java.util.Scanner;

public class somaComCondicao {
    public static void main(String[] args) {
        int soma = 0;
        int num;
        
        System.out.println("----------------------");
        System.out.println("---Soma de inteiros---");
        System.out.println("----------------------");

        //entrada de dados
        
        do{
            try(Scanner input = new Scanner(System.in)){
                System.out.print("Digite um numero: ");
                num = input.nextInt();
            }
            //processamento de dados
            soma += num;
        }while(soma <=100);

        //saida de dados
        System.out.println("Soma = "+soma);
        System.out.println("Ultimo numero: "+num);
    }
}
