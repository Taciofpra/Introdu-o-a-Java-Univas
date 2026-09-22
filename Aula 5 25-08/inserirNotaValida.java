import java.util.Scanner;

public class inserirNotaValida {
    public static void main(String[] args){
        int nota = 0;
        
        Scanner input = new Scanner(System.in);

            System.out.print("Digite uma nota de 0 a 10: ");
            nota = input.nextInt();

            while(nota > 10 || nota < 0){
                System.out.println("Nota Invalida!");
                System.out.print("Digite uma nota de 0 a 10: ");
                nota = input.nextInt();
            }

            System.out.println("Nota Valida!");
            
        input.close();
    }    
}

/* Crie um programa que peça ao usuário para digitar uma nota entre
0 e 10. Enquanto o usuário digitar um valor inválido (menor que 0
ou maior que 10), o programa deve mostrar uma mensagem de
erro e pedir para digitar a nota novamente. Quando uma nota
válida for inserida, o programa deve exibir "Nota válida!" e
terminar. A condição do while precisará verificar duas coisas ao
mesmo tempo. Você pode usar o operador lógico || (OU). A
condição para a estrutura de repetição continuar será nota < 0 ||
nota > 10 */