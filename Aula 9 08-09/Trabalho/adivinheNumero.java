/* Refatore o "Jogo da Adivinhação"
(exercício já fornecido nos slides ) para que o usuário tenha um número limitado de
tentativas (por exemplo, 5). O loop deve terminar quando o usuário acertar ou as
tentativas acabarem. Se as tentativas acabarem, exiba o número secreto. */

import java.util.Random;
import java.util.Scanner;

public class adivinheNumero {
    public static void main(String[]  args){
        int num, numSecreto, tentativas = 0;
        
        System.out.println("-----------------------");
        System.out.println("---Adivinhe o número---");
        System.out.println("-----------------------");

        //gera numero aleatorio e guarda em numSecreto
        Random gerador = new Random();
        numSecreto = gerador.nextInt(100) + 1;

        //solicita numero secreto, sai do loop se adivinhar ou tentativas = 5
        do{
            tentativas++;

            //entrada de dados
            try(Scanner input = new Scanner(System.in)){
                System.out.print("Digite um numero entre 1 e 100: ");
                num = input.nextInt();
            }

            if(num > numSecreto){
                System.out.println("O numero secreto é menor que "+ num);
            }else if(num < numSecreto){
                System.out.println("O numero secreto é maior que "+num);
            }
        }while(num != numSecreto && tentativas <5);

        //saida de dados
        if(tentativas == 5){
            System.out.println("Você perdeu! O numero correto era: "+numSecreto);
        }else{
            System.out.println("Você venceu em "+tentativas+" Tentativasde 5 tentativas!");
        }

    }
}