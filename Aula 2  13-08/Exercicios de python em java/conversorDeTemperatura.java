import java.util.Scanner;

public class conversorDeTemperatura {
    public static void main(String[] args){
        float celsius, fahrenheit;

        //entrada de dados
        Scanner input = new Scanner(System.in);
            System.out.print("Digite uma temperatura em Fahrenheit: ");
            fahrenheit = input.nextFloat();
        input.close();

        //processamento de dados
        celsius = 5 * ( fahrenheit - 32)/9;

        //saida de dados
        System.out.println("Fahrenheit = "+ fahrenheit);
        System.out.println("Celsius = "+ celsius);
    }
}
