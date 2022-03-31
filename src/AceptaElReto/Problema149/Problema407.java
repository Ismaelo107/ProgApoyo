package AceptaElReto.Problema149;

import java.util.Scanner;

public class Problema407 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casilla, posicion, tirada;

        while (true) {
            casilla = sc.nextInt();
            posicion = sc.nextInt();
            tirada = sc.nextInt();

            if (posicion == 0 && casilla == 0 && tirada == 0) {
                break;
            }

            if (posicion + tirada > casilla) {
                System.out.println(casilla - (posicion + tirada - casilla));
            } else {
                System.out.println(posicion + tirada);
            }

        }
    }
}

