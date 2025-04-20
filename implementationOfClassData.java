package Classe_Objetos.Date;
import java.util.Scanner;


public class implementationOfClassData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o numero de datas que voce quer inserir: ");
        int rangeOfDates = input.nextInt(); 

        classDate[] datas = new classDate[rangeOfDates];
        
        for (int i = 0 ; i < rangeOfDates ; i++) {

            datas[i] = new classDate();

            System.out.printf("Insira o dia da data[%d]: ",i + 1);
            datas[i].day = input.nextInt();
            System.out.printf("Insira o mês da data[%d]: ",i + 1);
            datas[i].month = input.nextInt();
            System.out.printf("Insira o ano da data[%d]: ",i + 1);
            datas[i].year = input.nextInt();
        }

        System.out.println("Datas informadas: ");
        for (int i = 0 ; i < rangeOfDates ; i++ ) {
            System.out.println(datas[i].showDate());
        }

        input.close();
    }
}