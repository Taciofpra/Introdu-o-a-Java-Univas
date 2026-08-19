import java.util.Scanner;

public class idadeVoto {
    public static void main(String[] args){
        int idade;

        Scanner input = new Scanner(System.in);
            System.out.print("Digite sua idade: ");
            idade = input.nextInt();
        input.close();

        if(idade < 16){
            System.out.println("Não pode votar!");
        }else if(idade < 18){
            System.out.println("Voto Facultativo!");
        }else{
            System.out.println("Voto Obrigatório");
        }
    }
}
