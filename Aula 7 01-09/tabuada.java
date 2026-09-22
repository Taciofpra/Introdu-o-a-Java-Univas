/* Peça ao usuário para digitar um número inteiro. Use um loop
for para exibir a tabuada desse número, do 1 ao 10. Por
exemplo, se o usuário digitar 7, o programa deve exibir: */

import java.util.Scanner;


public class tabuada {
    public static void main(String[] args){
        int num, i;

        System.out.print("Digite um numero: ");
        Scanner input = new Scanner(System.in);
            num = input.nextInt();
        input.close();

        for(i=1;i<=10;i++){
            System.out.println(i+ " * "+num+" = " + i*num);
        }
    }    
}
