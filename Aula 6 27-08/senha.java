/* Crie um programa que solicita ao usuário a criação de uma senha. O
programa deve pedir para que o usuário digite a senha e, em seguida,
confirme a senha. As duas senhas digitadas precisam ser idênticas
para que o programa aceite e continue. Se forem diferentes, o
programa deve mostrar uma mensagem de erro e pedir para que o
usuário digite as senhas novamente até que elas sejam iguais. */

import java.util.Scanner;

public class senha {
    public static void main(String[] args){
        String senha, confirmaSenha;

        System.out.println("----------------------");
        System.out.println("---Criador de Senha---");
        System.out.println("----------------------");
        System.out.println();

        Scanner input = new Scanner(System.in);
            System.out.print("Digite sua nova senha: ");
            senha = input.nextLine();

            do{
                System.out.print("Confirme sua senha: ");
                confirmaSenha = input.nextLine();

                if(!senha.equals(confirmaSenha)){
                    System.out.println("As senhas não coincidem, tente novamente!");
                }else{
                    System.out.println("Senha criada com sucesso!");
                }
            }while(!senha.equals(confirmaSenha));
        input.close();
    }
}
