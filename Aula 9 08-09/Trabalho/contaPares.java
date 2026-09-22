/*  Peça ao usuário para digitar um número inteiro.
Use um loop while para contar quantos dígitos pares (0, 2, 4, 6, 8) o número
possui. */
import java.util.Scanner;

public class contaPares {
    public static void main(String[] args) {
        String num;
        int i, tamanho, n;
        int digPar=0;

        System.out.println("----------------------------");
        System.out.println("---Contando digitos pares---");
        System.out.println("----------------------------");

        //entrada de dados
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite um numero: ");
            num = input.nextLine();
        }
        
        //processamento de dados
        tamanho = num.length();

        for(i=0;i<tamanho;i++){
            n = Character.getNumericValue(num.charAt(i));

            //verifica par
            if(n%2 == 0){
                digPar++;
            }
        }

        //Saida de dados
        if( digPar == 1){
            System.out.println("O numero "+num+" possui "+digPar+" digito par");
        }else{
            System.out.println("O numero "+num+" possui "+digPar+" digitos pares");
        }
    }
}
