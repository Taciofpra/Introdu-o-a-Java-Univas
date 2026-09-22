import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) {
        double vImovel, salario, limite, prestacao;
        String nome;
        int anos;

        Scanner input = new Scanner(System.in);
            System.out.println("---Validador de emprestimo---");
            System.out.print("Digite seu nome completo: ");
            nome = input.nextLine();
            System.out.print("Digite o valor do Imovel: ");
            vImovel = input.nextDouble();
            System.out.print("Digite seu Salário: ");
            salario = input.nextDouble();
            System.out.print("Digite em quantos anos deseja pagar: ");
            anos = input.nextInt();
        input.close();

        limite = salario * 0.3;
        prestacao = vImovel / (anos * 12);

        if (prestacao <= limite) {
            System.out.println("*------------------------------------*");
            System.out.println("|-------Financiamento aproado!-------|");
            System.out.println("*------------------------------------*\n");
        } else {
            System.out.println("*------------------------------------*");
            System.out.println("|-------Financiamento negado!--------|");
            System.out.println("*------------------------------------*\n");
        }

        System.out.println("*------------------------------------*");
        System.out.println("| Nome: " + nome);
        System.out.println("| Prestação: " + prestacao);
        System.out.println("| Limite de prestação: " + limite);
        System.out.println("*------------------------------------*");
    }
}