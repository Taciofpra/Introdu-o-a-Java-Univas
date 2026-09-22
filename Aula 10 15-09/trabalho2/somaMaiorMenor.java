/* Soma do Maior e Menor: Peça ao usuário para digitar 5 números inteiros. Use
um loop for para ler os números e, ao final, exiba a soma do maior e do
menor número digitado. */

import java.util.Scanner;

public class somaMaiorMenor {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int maior, menor, soma;
        int i;


        System.out.println("---------------------------");
        System.out.println("---Soma do maior e menor---");
        System.out.println("---------------------------");

        try(Scanner input = new Scanner(System.in)){
            for(i=0;i<5;i++){
                System.out.print("Digite o "+ (i+1) +"º numero: ");
                numeros[i] = input.nextInt();
            }
        }  
        maior = numeros[0];
        menor = numeros[0];

        for(i=1;i<5;i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }else if(numeros[i] < menor ){
                menor = numeros[i];
            }
        }

        soma = maior + menor;

        System.out.println("A soma do maior ("+maior+") e do menor ("+menor+") é: "+soma);

    }
}
