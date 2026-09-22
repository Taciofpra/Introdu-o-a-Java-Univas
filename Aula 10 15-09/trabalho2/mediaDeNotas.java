/* Média de Notas com Validação por do-while - Desenvolva um programa que calcule
a média de 4 notas. Use um loop do-while para garantir que o usuário só possa
inserir notas no intervalo entre 0 e 10. Se uma nota inválida for digitada, o programa
deve mostrar uma mensagem de erro e pedir a mesma nota novamente. Após a
leitura das 4 notas válidas, calcule e exiba a média */

import java.util.Scanner;

public class mediaDeNotas {
    public static void main(String[] args) {
        
        int[] notas = new int[4];
        int i = 0;
        float media = 0;


        System.out.println("----------------------------------");
        System.out.println("---Media de notas com validação---");
        System.out.println("----------------------------------");
        
        System.out.println("Digite notas com valor de 0 a 10");
        
        try(Scanner input = new Scanner(System.in)){
            do { 
            
                System.out.print("digite o valor da " +(i+1)+"ª nota: ");

                notas[i] = input.nextInt();
            
                if(notas[i] >= 0 && notas[i] <= 10){
                    i++;
                }else{
                    System.out.println("Valor invalido! Digite notas com valor de 0 a 10!");
                }
            } while (i<4);
        }
        
        for(i=0;i<4;i++){
            media += notas[i];
        }

        media /= 4;

        System.out.println("Media final: "+media);
    }
}
