/* Desenvolva um programa que permita ao usuário digitar
vários números inteiros. O programa deve somar todos os
números positivos digitados. A estrutura de repetição deve
parar quando o usuário digitar um número negativo. Ao final,
o programa deve exibir a soma total dos números positivos. */

import java.util.Scanner;

public class somaNumeros{
    public static void main(String[] args){
            int num = 0, soma = 0;

            System.out.println("------------------------");
            System.out.println("---Somador de numeros---");
            System.out.println("------------------------");
            System.out.println();

            Scanner input = new Scanner(System.in);
                 do{
                    soma += num;
                    
                    System.out.print("Digite um numero positivo, digite -1 para sair: ");
                    num = input.nextInt();
                }while(num >= 0);
            input.close();
                
            System.out.println("Total: "+soma);
        }
}