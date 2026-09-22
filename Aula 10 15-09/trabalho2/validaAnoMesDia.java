/* Validação Múltipla de Dados (Ano, Mês, Dia)
Crie um programa que solicite ao usuário o ano, o mês e o dia de nascimento. Use
um loop do-while para a entrada de cada valor. O programa deve garantir que:
Ano: Seja um valor entre 1900 e o ano atual (você pode definir um ano fixo como
limite superior, como 2024).
Mês: Seja um valor entre 1 e 12.
Dia: Seja um valor entre 1 e 31 */

import java.util.Scanner;

public class validaAnoMesDia {
    public static void main(String[] args) {
        int ano, mes, dia;
        boolean validaDia = false;

        System.out.println("-------------------------------------");
        System.out.println("---Validação de data de nascimento---");
        System.out.println("-------------------------------------");
        
        try(Scanner input = new Scanner(System.in)){
            //ano
            do{
                System.out.print("Digite o ano: ");
                ano = input.nextInt();
                if(ano < 1900 || ano > 2026){
                    System.out.println("Ano invalido! digite um valor entre 1900 e 2026");
                }
            }while(ano < 1900 || ano > 2026);

            //mes
            do{
                System.out.print("Digite o Mes: ");
                mes = input.nextInt();
                if(mes < 1 || mes > 12){
                    System.out.println("Mes invalido! digite um valor entre 1 e 12");
                }
            }while(mes < 1 || mes > 12);

            //dia -> valida em relação ao mês
            do{
                System.out.print("Digite o dia: ");
                dia = input.nextInt();
                
                switch(mes){
                    case 1, 3, 5, 7, 8, 10, 12 ->{
                        if(dia < 0  || dia > 31){
                            System.out.println("Dia invalido! digite um valor entre 1 e 31");
                        }else{
                            validaDia = true;
                        }
                    }
                    case 4, 6, 9, 11 ->{
                        if(dia < 0  || dia > 30){
                            System.out.println("Dia invalido! digite um valor entre 1 e 30");
                        }else{
                            validaDia = true;
                        }
                    }
                    default ->{
                        if(dia < 0  || dia > 28){
                            System.out.println("Dia invalido! digite um valor entre 1 e 28");
                        }else{
                            validaDia = true;
                        }
                    }
                }
            }while(!validaDia);
        }
        if(dia<10){
            if(mes < 10)
                System.out.println("Data digitada: 0"+dia+"/0"+mes+"/"+ano);
            else{
                System.out.println("Data digitada: 0"+dia+"/"+mes+"/"+ano);
            }
        }else if(mes<10){
            System.out.println("Data digitada: "+dia+"/0"+mes+"/"+ano);
        }else{
            System.out.println("Data digitada: "+dia+"/"+mes+"/"+ano);
        }
    
    }
}
