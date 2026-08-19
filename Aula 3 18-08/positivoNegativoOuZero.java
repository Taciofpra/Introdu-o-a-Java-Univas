import java.util.Scanner;

public class positivoNegativoOuZero {
    public static void main(String[] args){
        int numero;

        //entrada de dados
        Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            numero = input.nextInt();
        input.close();

        //saida de dados
        if(numero> 0){
            System.out.println("O Numero "+ numero +" é positivo.");
        }else if(numero < 0){
             System.out.println("O Numero "+ numero +" é negativo.");
        }else{
             System.out.println("O Numero é Zero.");
        }
    }
}
