/* Contador de Vogais: Solicite ao usuário que digite uma palavra. Use um loop
for para contar quantas vogais (a, e, i, o, u) a palavra contém e exiba o total.
Para acessar o caracter da palavra utilize “palavra.charAt(i)” */

import java.util.Scanner;

public class contadorDeVogais {
    public static void main(String[] args){
        int i, tamanho, nVogais = 0;
        String palavra;
        char c;

        System.out.println("------------------------");
        System.out.println("---Contagem de Vogais---");
        System.out.println("------------------------");

        //Entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite uma palavra: ");
            palavra = input.nextLine();
        }
        
        //processamento de dados
        tamanho = palavra.length();

        for(i=0;i<tamanho;i++){

            c = Character.toLowerCase(palavra.charAt(i));
            
            if( c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u'){
                nVogais++;
            }
        }   

        //saida de dados
        System.out.println("Total de vogais em "+palavra+" = "+nVogais);

    }
}
