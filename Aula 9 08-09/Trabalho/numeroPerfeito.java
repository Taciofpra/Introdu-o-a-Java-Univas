/* Crie um programa que verifique se um número é "perfeito". Um
número perfeito é aquele cuja soma de seus divisores (excluindo ele mesmo) é igual
ao próprio número. Use um loop for para encontrar os divisores e somá-los.
Exemplo: 6 é perfeito, pois seus divisores são 1, 2 e 3, e 1 + 2 + 3 = 6. */

import java.util.Scanner;

public class numeroPerfeito {
    public static void main(String[] args) {
        int numPerfeito, i, soma = 0;

        System.out.println("---------------------");
        System.out.println("---Numero perfeito---");
        System.out.println("---------------------");

        //entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite um numero: ");
            numPerfeito = input.nextInt();
        }

        //processamento de dados
        for(i = numPerfeito/2 ; i>0; i-=1){
            if(numPerfeito % i == 0){
                soma += i;
            }
        }

        //saida de dados
        if(soma == numPerfeito){
            System.out.println("O numero "+numPerfeito+" é perfeito!");
        }else{
            System.out.println("O numero "+numPerfeito+" não é perfeito!");
        }
    }
}
