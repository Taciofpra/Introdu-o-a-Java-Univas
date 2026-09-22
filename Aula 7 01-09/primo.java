/* Peça ao usuário para digitar um número inteiro. Use um loop
for para verificar se esse número é primo. Um número é
primo se for divisível apenas por 1 e por ele mesmo. O
programa deve imprimir uma mensagem informando se o
número é primo ou não */

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        int num, i;

        Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero para verificação de primo: ");
            num = input.nextInt();
        input.close();

        for(i=2;i<num/2;i++){
            if(num%i == 0){
                i = num-1;//sinaliza saida antecipada do for
                System.out.println("O numero "+num+" Não é primo.");
            }
        }

        //utliza ausencia de saida antecipada do for para inferir que o numero é primo
        if(i != num || num == 2){
            System.out.println("O numero "+num+" é primo.");
        }
    }    
}
