import java.util.Scanner;

public class areaDoCirculo {
    public static void main(String[] args){
        double raio, area;
        double pi = 3.14159;

        //entrada de dados
        Scanner input = new Scanner(System.in);
            System.out.print("Digite o raio do circulo: ");
            raio = input.nextDouble();
        input.close();

        //processamento de dados
        area = pi*(raio*raio);

        //saida de dados
        System.out.println("Area do circulo: "+ area);
    }
    
}