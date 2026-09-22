/*Crie um programa que peça ao usuário para digitar um
PIN de 4 dígitos. Use um loop do-while para continuar pedindo o PIN até que
ele seja "1234". A cada tentativa, informe se o PIN está incorreto*/

import java.util.Scanner;

public class validandoPin {
    public static void main(String[] args) {
        int pinUser, pin = 1234;

        System.out.println("-----------------------");
        System.out.println("---Validador de Pin---");
        System.out.println("-----------------------");

        
        //entrada de dados
        do{
            try(Scanner input = new Scanner(System.in)){
                System.out.print("Digite o Pin: ");
                pinUser = input.nextInt();
            }
            //processamento de dados
            if(pinUser != pin){
                System.out.println("Pin incorreto! tente novamente.");
            }
        }while(pinUser != pin);

        //saida de dados
        System.out.println("Bem vindo!");
    }
    
}
