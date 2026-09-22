/* Use um loop while para calcular o Máximo Divisor
Comum de dois números inteiros digitados pelo usuário, utilizando o algoritmo de
Euclides. */

import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        int num1, num2, i;
        int menor, mdc = 0;

        System.out.println("-------------------------");
        System.out.println("---MDC de dois numeros---");
        System.out.println("-------------------------");

        //entrada de daddos
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite o valor do Num1: ");
            num1 = input.nextInt();
            System.out.print("Digite o valor do Num2: ");
            num2 = input.nextInt();
        }

        //processamento de dados
        if(num1<num2){
            menor = num1;
        }else{
            menor = num2;
        }

        for(i=1; i<=menor;i++){
            if(num1 % i == 0 && num2 % i == 0){
                mdc = i;
            }
        }

        //exibe MDC
        System.out.println("MDC de "+num1+" e "+num2+" = "+mdc);
    }
}
