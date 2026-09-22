/* Peça ao usuário para digitar uma base e um expoente
(ambos inteiros). Use um loop for para calcular o resultado
da potência (base^expoente) sem usar a função Math.pow().
Imprima o resultado.
• Exemplo: Se a base for 2 e o expoente for 3, o programa deve
calcular 2 * 2 * 2. */

import java.util.Scanner;

public class potencia {
    public static void main(String[] args){
        int base, expoente;
        long total;

        System.out.println("Calculo de potencia");

        Scanner input = new Scanner(System.in);
            System.out.print("Digite o valor da base: ");
            base = input.nextInt();
            System.out.print("Digite o valor do expoente: ");
            expoente = input.nextInt();
        input.close();

        total = base;

        for(int i=1;i<expoente;i++){
            total *= base;
        }

        System.out.println("Total de "+ base + "^"+expoente+": "+total);
    }
}
