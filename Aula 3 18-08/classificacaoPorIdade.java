import java.util.Scanner;

public class classificacaoPorIdade {
    public static void main(String[] args){
        int idade;

        Scanner input = new Scanner(System.in);
            System.out.print("Digite uma idade: ");
            idade = input.nextInt();
        input.close();

        if(idade < 12){
            System.out.println("Criança!");
        }else if(idade < 17){
            System.out.println("Adolescente!");
        }else{
            System.out.println("Adulto!");
        }
    }
}
