package AceptaElReto.Problema149;

import java.util.Random;
import java.util.Scanner;

public class Problema407 {
    public static void main(String[] args) {

        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introuducir  casilla");
        int casilla = sc.nextInt();

        System.out.println("Introducir posicion");
        int posicion = sc.nextInt();

        System.out.println("Tirada");
        int tirada = sc.nextInt();

        int tot = posicion + tirada;
        int f_rango = tot - casilla;
        int pos_final = casilla-f_rango;
        boolean win = false;


        while (!win) {
            if (casilla == tot) {
                System.out.println("Has ganado");
                 win = true;
            } else {
                if (tot < casilla) {
                    System.out.println("Tirada");
                    tirada = sc.nextInt();
                    int jugada = tot + tirada;
                    if (casilla == jugada) {
                        System.out.println("Has ganado");
                        win = true;}


                } else {
                    System.out.println("Te has pasado");
                    System.out.println(pos_final);
                    System.out.println("Sigue tirando");
                    tirada = sc.nextInt();
                    int intento = tirada+ pos_final;
                        if (casilla == tot) {
                            System.out.println("Has ganado");
                            win = true;}
                }
            }
        }
    }
}
