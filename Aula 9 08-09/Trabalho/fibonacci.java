/* Crie um programa que use um loop for para exibir os
primeiros 10 números da sequência de Fibonacci (onde cada número é a
soma dos dois anteriores). A sequência começa com 0 e 1 */

public class fibonacci {
    public static void main(String[] args) {
        int i;
        int[] fib = new int[10];//vetor para guardar a sequencia

        //inicialização dos primeiros elementos
        fib[0] = 0;
        fib[1] = 1;
        
        System.out.println("---------------------------------------");
        System.out.println("---10 primeiros numeros de fibonacci---");
        System.out.println("---------------------------------------\n");

        //processamento de dados
        for(i=0;i<10;i++){
            if(i>1){
                fib[i] = fib[i-1] + fib[i-2];
            }

            //saida de dados
            System.out.print(fib[i]+", ");
        }
    }
}
