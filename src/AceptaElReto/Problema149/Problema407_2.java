package AceptaElReto.Problema149;

import java.util.Random;
import java.util.Scanner;

public class Problema407_2 {
    public static void main(String[] args) {

        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int casilla = sc.nextInt(), posicion = sc.nextInt(), tirada = sc.nextInt();


            if (posicion + tirada > casilla) {
                System.out.println(casilla - (posicion + tirada - casilla));
            } else {
                System.out.println(posicion + tirada);
            }


    }
}
