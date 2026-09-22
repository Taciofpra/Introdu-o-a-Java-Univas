/*  Calcule a soma da série harmônica H(n)=1+1/2+1/3+1/4+⋯+1/n.
Peça ao usuário para digitar o valor de n e use um loop for para calcular e exibir a
soma */

import java.util.Scanner;

public class serieHarmonica {
    public static void main(String[] args) {
        double serie = 0;
        double n, i;

        System.out.println("---------------------");
        System.out.println("---Serie Harmonica---");
        System.out.println("---------------------");

        //entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite o valor de N: ");
            n = input.nextInt();
        }

        //processamento de dados
        for(i=1;i<=n;i++){
            serie += (1/i);
        }

        //saida de dados
        System.out.print("Serie harmonica "+n+" = "+serie);
    }
}
