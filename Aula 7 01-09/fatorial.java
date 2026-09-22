/* Peça ao usuário para digitar um número inteiro positivo. Use
um loop for para calcular o fatorial desse número. O fatorial
de um número é o produto de todos os inteiros positivos de 1
até esse número. O programa deve imprimir o resultado */

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        int num, fatorial, i;

        Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero para calculo de fatorial: ");
            num = input.nextInt();
        input.close();

        fatorial = num;
        for(i = fatorial-1; i>0;i--){
            fatorial *= i;
        }
    
        System.out.println("Total de "+num+"! = "+fatorial);
    }
}
