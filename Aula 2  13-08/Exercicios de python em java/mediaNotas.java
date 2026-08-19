import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args){
        float notas[] = new float[4];
        float media = 0;
        int i;

        Scanner input = new Scanner(System.in);

        for(i=0;i<4;i++){
            System.out.print("Digite o valor da " + (i+1) + "ª nota: ");
            notas[i] = input.nextFloat();
        }
        
        input.close();
        
        for(i=0;i<4;i++){
            media += notas[i];
        }

        media = media/i;

        System.out.println("Media das notas: "+ media);
    }
    
}
