import java.util.Scanner;

public class nomeESaudacao {
    public static void main(String[] args){
        String nome;

        Scanner input = new Scanner(System.in);
            
            System.out.print("Digite seu nome: ");
            nome = input.next();
        
        input.close();

        System.out.println("Bem Vindo, "+ nome);
    }
}
