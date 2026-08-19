import java.util.Scanner;

public class aluguelCarro {
    public static void main(String[] args){
        double kmPercorrido, dias, total;

        //entrada de dados
        Scanner input = new Scanner(System.in);
            System.out.print("Digite a quantidade de quilometros percorridos: ");
            kmPercorrido = input.nextFloat();
            System.out.print("Digite a quantidade de Dias com o veiculo: ");
            dias = input.nextFloat();
        input.close();

        //processamento de dados
        total = 60 * dias + 0.15*kmPercorrido;

        //saida de dados
        System.out.println("Total final: "+ total);
    }
}
