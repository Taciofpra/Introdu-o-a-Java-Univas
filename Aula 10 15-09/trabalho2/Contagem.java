/* Contagem entre dois números: Peça ao usuário para digitar um número
inicial e um número final. Use um loop for para imprimir todos os números
inteiros nesse intervalo, do menor para o maior. */
import java.util.Scanner;

public class Contagem {
    public static void main(String[] args){
        int num1, num2, i;
        int maior, menor;

        System.out.println("---------------");
        System.out.println("---Contagem!---");
        System.out.println("---------------");

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite o primeiro valor para a contagem");
            num1 = input.nextInt();
            System.out.print("Digite o segundo valor para a contagem");
            num2 = input.nextInt();
        }

        if(num1 > num2){
            maior = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }

        for(i=menor;i<=maior;i++){
            System.out.print(i+" ");
        }
    }
}
