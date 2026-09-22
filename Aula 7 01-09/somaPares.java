/* Crie um programa que use um loop for para somar todos os
números pares de 1 a 100. Ao final, imprima o valor total da
soma */

public class somaPares {
    public static void main(String[] args){
        int i, soma = 0;

        System.out.println("Soma dos pares de 1 a 100");

        for(i=1;i<=100;i++){
            if(i % 2 == 0){
                soma += i;
            }
        }

        System.out.println("Total: "+ soma);
    }
}
