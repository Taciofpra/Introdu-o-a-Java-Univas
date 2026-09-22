/* Soma de Dígitos: Solicite ao usuário que digite um número inteiro positivo.
Use um loop while para calcular a soma de todos os dígitos desse número.
Por exemplo, se o número for 123, a soma é 6 */

import java.util.Scanner;

public class somaDigitos {
    public static void main(String[] args) {
        String num;
        int i, tamanho, n;
        int somaDig=0;

        System.out.println("---------------------");
        System.out.println("---somando digitos---");
        System.out.println("---------------------");

        //entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite um numero: ");
            num = input.nextLine();
        }
        
        //processamento de dados
        tamanho = num.length();

        for(i=0;i<tamanho;i++){
            n = Character.getNumericValue(num.charAt(i));

            somaDig = somaDig + n;
        }

        //Saida de dados
        System.out.println("A soma dos digitos de "+num+" é: "+somaDig);
    }
}
