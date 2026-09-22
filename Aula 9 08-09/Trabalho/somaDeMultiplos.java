/* Soma de Números Múltiplos: Use um loop while para somar todos os
números de 1 a 20 que sejam múltiplos de 3 ou 5. */

public class somaDeMultiplos {
    public static void main(String[] args) {
        int soma = 0;
        int i;

        System.out.println("-------------------------------");
        System.out.println("---Soma de multipos de 3 e 5---");
        System.out.println("-------------------------------");

        //processamento de dados
        for(i=1;i<20;i++){
            if(i%3 ==0 || i%5 ==0){
                soma +=i;
            }
        }

        //saida de dados
        System.out.println("Soma de multiplos: "+soma);
    }
    
}
