/* Número de Palindromo: Peça ao usuário para digitar um número inteiro
positivo. Usando um loop while e operações matemáticas, verifique se o
número é um palíndromo (ou seja, se lido da esquerda para a direita ou da
direita para a esquerda, é o mesmo). Exiba o resultado da verificação
 */
import java.util.Scanner;

public class numPalindromo {
    public static void main(String[] args) {
        String num;
        int i, j, tamanho;
        boolean palindromo = true;


        System.out.println("-----------------------");
        System.out.println("---numero Palindromo---");
        System.out.println("-----------------------");

        //entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite um numero: ");
            num = input.nextLine();
        }
        
        //processamento de dados
        tamanho = num.length();

        i = 0;
        j =tamanho -1;

        while(i <= (tamanho/2)-1 && j >= (tamanho/2)){
            if(num.charAt(i) != num.charAt(j)){
                palindromo = false;
            }
            i++;
            j -= 1;
        }

        //Saida de dados
        if(palindromo){
            System.out.println("O numero "+num+" é um palindromo!");
        }else{
            System.out.println("O numero "+num+" não é um palindromo!");
        }
    }
}
