import java.util.Random;
import java.util.Scanner;

public class adivinheNumero {
    public static void main(){
        int numSecreto = 0, tentativa = 0, guess;

        Random gerador = new Random();
        numSecreto = gerador.nextInt(100) + 1;

        System.out.println("Tente adivinhar o número secreto!");
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite um número entre 1 e 100: ");
            guess = input.nextInt();
        
            while(guess != numSecreto){
                
                while(guess > 100 || guess <= 0){
                    System.out.print("Valor invalido! digite um numero entre 1 e 100: ");
                    guess = input.nextInt();
                } 

                tentativa++;

                if(guess > numSecreto){
                    System.out.println("O numero sereto é menor que "+ guess + "!");
                    System.out.print("Tente novamente: ");
                    guess = input.nextInt();
                }else if(guess < numSecreto){
                    System.out.println("O numero sereto é maior que "+ guess + "!");
                    System.out.print("Tente novamente: ");
                    guess = input.nextInt();
                }
            }
        } 
            tentativa++;
            System.out.println("Você acertou o numero secreto em "+ tentativa+" Tentativas!");
    }
}
/* Crie um jogo onde o programa "pensa" em um número secreto
entre 1 e 100. O usuário deve tentar adivinhar qual é esse
número. A cada tentativa, o programa deve dar uma dica,
dizendo se o número secreto é maior ou menor que o palpite.
O jogo termina quando o usuário acerta o número, e o
programa deve informar quantas tentativas foram
necessárias. */