/* Peça ao usuário para digitar uma palavra. Use um loop
for para imprimir a palavra de trás para frente. Por exemplo, se a entrada for
"Java", a saída deve ser "avaJ". */

import java.util.Scanner;

public class invertePalavra {
    public static void main(String[] args) {
        int tamanho, i, j;
        String palavra;
        char temp;

        System.out.println("---------------------");
        System.out.println("---Inverte Palavra---");
        System.out.println("---------------------");

        //entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite uma palavra: ");
            palavra = input.nextLine();
        }

        //processamento de dados
        tamanho = palavra.length();
        char[] cPalavra = palavra.toCharArray();

        i = 0;
        j = tamanho-1;

        while(i<j){
            temp = cPalavra[i];
            cPalavra[i] = cPalavra[j];
            cPalavra[j] = temp;

            i++;
            j -= 1;
        }

        //saida de dados
        System.out.println("Palavra invertida : "+ new String(cPalavra));
    }
}