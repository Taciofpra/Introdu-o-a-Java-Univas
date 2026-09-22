import java.util.Scanner;
public class contagemRegressiva {
    public static void main(String[] args){
        int num;

        Scanner input = new Scanner(System.in);
            System.out.print("Digite um número: ");
            num = input.nextInt();
        input.close();

        while (num > 0){
            System.out.println(num);
            num--;
        }
        
        System.out.println("Lançar!");
    }
}
