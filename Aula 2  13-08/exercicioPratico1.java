import java.util.Scanner;

public class exercicioPratico1 {
    public static void main(String[] args) {
        //declarando Variaveis
        int num1, num2;

        //Interface
        System.out.println("----Calculadora simples----\n");
        //entrada de dados
        Scanner input = new Scanner(System.in);

            System.out.print("Digite o valor de A: "); 
            num1 = input.nextInt();

            System.out.print("Digite o valor de B: ");
            num2 = input.nextInt();

        input.close();

        //saída de dados
        System.out.println("\n+-------------------------+");
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
        System.out.println("A++ = " + (++num1));
        System.out.println("B-- = " + (--num2));
        System.out.println("+-------------------------+\n");
    }
}
