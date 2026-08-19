import java.util.Scanner;

public class somaDoisNumeros {
    public static void main(String[] args){
        int num1, num2;

        Scanner input = new Scanner(System.in);

            System.out.print("Digite o valor de A: ");
            num1 = input.nextInt();

            System.out.print("Digite o valor de B: ");
            num2 = input.nextInt();

        input.close();

        System.out.println("A + B = "+ (num1 + num2));

    }
}
