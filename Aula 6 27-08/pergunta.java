/* Crie um programa que peça para o usuário digitar uma resposta para
a pergunta "Você gosta de programar?". O programa deve continuar
fazendo essa mesma pergunta repetidamente, enquanto a resposta
não for "sim". Se o usuário digitar qualquer outra coisa, a pergunta é
feita novamente. Quando o usuário finalmente digitar "sim", o
programa deve exibir uma mensagem de parabéns e encerrar. */

import java.util.Scanner;

public class pergunta {
    public static void main(String[] args){
        String resposta;

        Scanner input = new Scanner(System.in);
            do{
                System.out.print("Você gosta de programar? ");
                resposta = input.nextLine();
            }while((!resposta.equals("sim")) && (!resposta.equals("Sim")));
        input.close();
    }
}
