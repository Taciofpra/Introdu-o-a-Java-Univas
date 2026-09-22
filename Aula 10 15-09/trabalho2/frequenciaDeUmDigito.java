/* requência de um Dígito – Peça ao usuário para digitar um número inteiro longo e
um dígito simples (de 0 a 9) que ele deseja procurar. Use um loop while para contar
quantas vezes o dígito procurado aparece no número longo. Exemplo: Se o número
for 256282 e o dígito for 2, a resposta deve ser 3. */

import java.util.Scanner;

public class frequenciaDeUmDigito {
    public static void main(String[] args){
        String numString;
        long numero;
        char busca;
        int i, tamanho, cont = 0;


        System.out.println("-----------------------------");
        System.out.println("---Frequencia de um numero---");
        System.out.println("-----------------------------");

        //entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite um numero com mais de 9 digitos: ");
            numero = input.nextLong();
            System.out.print("Digite qual numero deseja buscar: ");
            busca = input.next().charAt(0);
        }
        
        numString = String.valueOf(numero);

        
        //processamento de dados
        tamanho = numString.length();

        for(i=0;i<tamanho;i++){
            if(numString.charAt(i) == busca){
                cont++;
            }
        }

        System.out.println("O numero "+busca+" Aparece "+cont+" Vezes em "+numero);

    }
}
