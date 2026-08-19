import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args){
        int numero;

        //entrada de dados
        Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            numero = input.nextInt();
        input.close();

        //saida de dados
        if(numero % 2 == 0){
            System.out.println("O numero "+ numero +" é par!");
        }else{
            System.out.println("O numero "+ numero +" é impar!");
        }
    }
    
}