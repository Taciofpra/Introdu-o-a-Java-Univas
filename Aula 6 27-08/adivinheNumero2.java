/* Crie um jogo onde o programa "pensa" em um número secreto
entre 1 e 100. O usuário deve tentar adivinhar qual é esse
número. A cada tentativa, o programa deve dar uma dica,
dizendo se o número secreto é maior ou menor que o palpite.
O jogo termina quando o usuário acerta o número, e o
programa deve informar quantas tentativas foram */
import java.util.Random;
import java.util.Scanner;

public class adivinheNumero2 {
    public static void main(String[]  args){
        int num, numSecreto, tentativas = 0;
        
        System.out.println("-----------------------");
        System.out.println("---Adivinhe o número---");
        System.out.println("-----------------------");

        Random gerador = new Random();
        numSecreto = gerador.nextInt(100) + 1;

        tr(Scanner input = new Scanner(System.in)){
            do{
                tentativas++;

                System.out.print("Digite um numero entre 1 e 100: ");
                num = input.nextInt();

                if(num > numSecreto){
                    System.out.println("O numero secreto é menor que "+ num);
                }else if(num < numSecreto){
                    System.out.println("O numero secreto é maior que "+num);
                }

            }while(num != numSecreto);
        }
        
        System.out.println("Você venceu em "+tentativas+" Tentativas!");


    }
}
