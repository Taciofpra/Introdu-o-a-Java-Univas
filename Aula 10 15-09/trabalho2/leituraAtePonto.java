/* Leitura de Caracteres até o Ponto Final - Crie um programa que leia
caracteres digitados pelo usuário um por um. O loop deve ser do tipo while e
deve continuar lendo e exibindo os caracteres na tela enquanto o caractere
digitado não for um ponto final (.). Ao final, exiba a contagem total de
caracteres (excluindo o ponto final). */

import java.util.Scanner;

public class leituraAtePonto {
    public static void main(String[] args) {
        char[] caracteres = new char[500];
        int i = 0, tamanho=0;
        int j;

        //limpa console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("-----------------------------");
        System.out.println("---Leitura até ponto final---");
        System.out.println("-----------------------------");

        try(Scanner input = new Scanner(System.in)){
            do{
                
                if(i>0){
                    System.out.print("Caracteres digitados: ");
                    for(j=0;j<i;j++){
                        System.out.print(caracteres[j]);
                    }
                }
                System.out.println();
                System.out.println("Digite o "+(i+1)+"º caractere");
                System.out.print("Digite . para parar: ");
                caracteres[i] = input.next().charAt(0);
                i++;
                tamanho++;

                //limpa console
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }while(caracteres[i-1] != '.');
        }  
        tamanho -= 1;

        System.out.print("Caracteres digitados: ");
        
        for(j=0;j<=tamanho;j++){
            System.out.print(caracteres[j]);
        }
        System.out.println();
        System.out.println("Quantidade de caracteres: "+tamanho);
        
    }
}
