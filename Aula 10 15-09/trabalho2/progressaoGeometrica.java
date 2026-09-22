/* Progressão Geométrica Limitada - Peça ao usuário para digitar um número inteiro
inicial (a) e um limite máximo (limite). Use um loop for para calcular e exibir a
progressão geométrica onde cada termo é o dobro do anterior (2 * a), começando
pelo número inicial, até que o termo ultrapasse o limite máximo. */

import java.util.Scanner;

public class progressaoGeometrica {
    public static void main(String[] args) {
        int numPG, limite, i;


        System.out.println("------------------------------");
        System.out.println("---Calculo de PG até limite---");
        System.out.println("------------------------------");

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite o numero inicial: ");
            numPG = input.nextInt();
            System.out.print("Digite o Limite: ");
            limite = input.nextInt();
        }

        System.out.print("PG: ");
        System.out.print(numPG+" ");
        for(i=0;numPG < limite;i++){
            numPG *= 2;
            System.out.print(numPG+" ");
        }

    }
}
