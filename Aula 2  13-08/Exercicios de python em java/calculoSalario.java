import java.util.Scanner;

public class calculoSalario {
    public static void main(String[] args){
        float sHoras, horasT, salarioFinal;

        Scanner input = new Scanner(System.in);
            System.out.print("Digite seu salário por hora: ");
            sHoras = input.nextFloat();
            System.out.print("Digite o total de horas trabalhadas: ");
            horasT = input.nextFloat();
        input.close();

        salarioFinal = sHoras * horasT;

        System.out.println("Salário final: "+ salarioFinal);
    }
}
