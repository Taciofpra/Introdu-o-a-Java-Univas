/* Peça ao usuário para digitar um nome de usuário. Use
um loop do-while para garantir que o nome de usuário não seja vazio. Se o
usuário apenas pressionar Enter, o programa deve continuar pedindo o nome */
import java.util.Scanner;

public class entradaObrigatoria {
    public static void main(String[] args) {
        String usuario = "";

        System.out.println("----------------------------------");
        System.out.println("---Entrada obrigatoria de dados---");
        System.out.println("----------------------------------");

        //caso string vazia, continua solicitando usuário
        while(usuario.equals("")){
            try(Scanner input = new Scanner(System.in)){
                System.out.print("Digite seu usuário: ");
                usuario = input.nextLine();
            }
        }

    }
}
