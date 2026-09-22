/* Contador de Dígitos: Peça ao usuário que digite um número inteiro. Use um
loop while para contar quantos dígitos o número possui e exiba o resultado */

import java.util.Scanner;

public class contadorDeDigitos {
    public static void main(String[] args) {
        int tamanho=1;
        boolean verificaFim = false;
        long i = 10;
        long num;

        System.out.println("-------------------------");
        System.out.println("---Contagem de digitos---");
        System.out.println("-------------------------");

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite um numero: ");
            num = input.nextLong();
        }

        
        while(!verificaFim){
            if(num - i >= 0){
                tamanho++;
                i*=10;
            }else{
                verificaFim = true;
            }
        }

        if(tamanho == 1){
            System.out.println("O numero "+num+" Possui "+tamanho+" Digito");
        }else{
            System.out.println("O numero "+num+" Possui "+tamanho+" Digitos");
        }
    }
}
