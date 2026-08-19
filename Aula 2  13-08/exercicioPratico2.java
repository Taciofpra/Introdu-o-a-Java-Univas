import java.util.Scanner;

public class exercicioPratico2 {
    public static void main(String[] args) {
        //declarando variaveis
        double[] notas = new double[3];
        double media = 0;
        int i;

        //entrada de dados
        Scanner input = new Scanner(System.in);
       
            for(i=0;i<3;i++){
                System.out.print("Digite o "+ (i+1) + "ª nota: ");
                notas[i] = input.nextDouble();
            }

            input.close();
    
        //processamento de dados
        for(i=0;i<3;i++){
            media += notas[i];
        }

        media = media/3;

        //Saida de dados
        System.out.println(String.format("Media final: %.2f",  media));
    }
}
