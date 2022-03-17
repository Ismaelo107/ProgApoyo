package AceptaElReto.Problema149;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P149 {
    public static void main(String[] args) {

        List<Integer> toros = new ArrayList<>();
        List<Integer> velocidad = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas prubas desea realizar: ");
        int pruebas = sc.nextInt();

        for (int i = 0; i < pruebas; i++) {

            int toro;
            System.out.println("Cuantos toros quieres añadir: ");
            toros.add(toro = sc.nextInt());
            Random random = new Random();

            for (int j = 0; j < toros.get(0); j++) {
                int ran = random.nextInt(20);
                velocidad.add(ran);
            }


            System.out.println("Hay " + toros + " toros");
            System.out.println("A las siguientes velocidades:");
            System.out.println(velocidad);

            int velMax = 0;

            for (Integer max :
                    velocidad) {
                if (max > velMax) {
                    velMax = max;
                }
            }
            System.out.println("La velocidad a la que deben ir los participantes es la siguiente: "+velMax);
        }
    }
}