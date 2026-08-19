import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        String nome;
        int idade;
        double altura;
        boolean estudando;
        
        Scanner input = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();
            
            System.out.print("Digite sua idade: ");
            idade = input.nextInt();

            System.out.print("Digite sua altura: ");
            altura = input.nextDouble();

            System.out.print("Está estudando? true ou false: ");
            estudando = input.nextBoolean();

        input.close();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        if(estudando == true){
            System.out.println("Está estudando: Sim ");
        }else{
            System.out.println("Está estudando: Não");
        }

    }
}