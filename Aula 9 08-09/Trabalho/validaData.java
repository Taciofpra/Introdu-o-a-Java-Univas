/* Solicite ao usuário que digite um ano e um mês (ex: 2025,
2). Use um loop while para verificar se os valores digitados são válidos. O ano
deve ser maior que 0 e o mês entre 1 e 12. Se algum valor for inválido, o
programa deve pedir para digitar novamente */

import java.util.Scanner;

public class validaData {
    public static void main(String[] args) {
        int ano, mes;
        //string que armazena meses
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("-----------------------");
        System.out.println("---Validador de Data---");
        System.out.println("-----------------------");

        
        do{
            //entrada de dados
            try(Scanner input = new Scanner(System.in)){
                System.out.print("Digite um ano: ");
                ano = input.nextInt();
                System.out.print("Digite um mes: ");
                mes = input.nextInt();
            }
            //processamento de dados
            if(ano <= 0 || mes <= 0 || mes > 12){
                System.out.println(("Ano ou mês invalidos! tente novamente!"));
            }
        }while(ano <= 0 || mes <= 0 || mes > 12);
        
        //exibindo mes e ano digitados
        System.out.println("Você digitou "+meses[mes-1]+" de "+ano);
    }
    
}
