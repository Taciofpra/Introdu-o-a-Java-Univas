import java.util.Scanner;

public class triangulo {
    public static void main(String[] args){
        double l1, l2, l3;

        Scanner input = new Scanner(System.in);
            System.out.print("Digite o valor do lado 1: ");
            l1 = input.nextInt();
            System.out.print("Digite o valor do lado 2: ");
            l2 = input.nextInt();
            System.out.print("Digite o valor do lado 3: ");
            l3 = input.nextInt();
        input.close();

        if((l1 + l2)> l3 && (l2 + l3) > l1 && (l3 + l1)> l2){
            System.out.println("Os lados fornecidos formam um triangulo!");
            if(l1 == l2 && l2 == l3){
                System.out.println("Classificação: Triangulo Equilátero");
            }else if(l1 == l2 || l1 == l3 || l3 == l2){
                System.out.println("Classificação: Triangulo Isóceles");
            }else{
                System.out.println("Classificação: Triangulo Escaleno");
            }
        }else{
            System.out.println("Os lados fornecidos não formam um triangulo");
        }
    }
}
