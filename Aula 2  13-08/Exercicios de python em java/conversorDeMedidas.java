import java.util.Scanner;

public class conversorDeMedidas {
    public static void main(String[] args){
        float metros, centimetros;

        //entrada de dados
        Scanner input = new Scanner(System.in);
            System.out.print("Digite um valor em Metros: ");
            metros = input.nextFloat();
        input.close();

        //processamento de dados
        centimetros = metros * 100;

        //saida de dados
        System.out.println("Metros: "+ metros);
        System.out.println("Centimetros: "+ centimetros);
    }
}
