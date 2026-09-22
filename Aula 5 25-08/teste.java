import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        String nome;
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite seu nome: ");
            nome = input.next();
        }
        
        System.out.println("Sua idade é: "+nome);
    }
    
}