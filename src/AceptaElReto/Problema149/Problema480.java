package AceptaElReto.Problema149;

import java.util.Scanner;

public class Problema480 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Introducir número de casos; ");
        int casos = s.nextInt();
        double uvas;
        double a, b;
        double calculo;

        for (int i = 0; i < casos; i++) {
            System.out.println("Introducir número de UVAS; ");
            uvas = s.nextDouble();
            System.out.println("Introducir número de uvas malas; ");

            a = s.nextDouble();
            System.out.println("Introducir número de buenas; ");

            b = s.nextDouble();

            calculo = Math.ceil((uvas / b * a)+1 );


            System.out.println((int) calculo);

        }

    }
}
