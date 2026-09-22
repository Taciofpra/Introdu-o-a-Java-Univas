import java.util.Scanner;

public class somaValores {
    public static void main(String[] args){
        int num = 0, total = 0;

        System.out.println("Somador de números: Digite um numero para somar");
        System.out.println("Digite -1 para sair");
       
        Scanner input = new Scanner(System.in);

            do{
                total += num;
                
                System.out.print("Digite um numero: ");
                num = input.nextInt();
            } while (num >= 0);

        input.close();

        System.out.println("Total da soma: " + total);
    }
}


/* 
Desenvolva um programa que permita ao usuário digitar
vários números inteiros. O programa deve somar todos os
números positivos digitados. A estrutura de repetição deve
parar quando o usuário digitar um número negativo. Ao final,
o programa deve exibir a soma total dos números positivos. */