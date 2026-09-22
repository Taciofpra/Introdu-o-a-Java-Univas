/* Crie um programa que use um loop for para
exibir todos os números ímpares de 1 a 50. */

public class imprimindoImpares {
    public static void main(String[] args){
        int i;

        System.out.println("---------------------");
        System.out.println("---Imprime Impares---");
        System.out.println("---------------------");

        //verifica e imprime impar
        for(i=0; i<50; i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }
}