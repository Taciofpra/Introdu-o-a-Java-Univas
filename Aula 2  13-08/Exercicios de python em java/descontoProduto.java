import java.util.Scanner;

public class descontoProduto {
    public static void main(String[] args){
        float produto, desconto, total;

        //entrada de dados
        Scanner input = new Scanner(System.in);
            System.out.print("Digite o valor do produto: ");
            produto = input.nextFloat();
            System.out.print("Digite o valor do Desconto em %: ");
            desconto = input.nextFloat();
        input.close();

        //processamento de dados
        total = produto *(1 - desconto/100);

        //saida de dados
        System.out.println("Valor final:"+ total );
    }
}
