package AceptaElReto.Problema149;

import java.util.Scanner;

public class P405 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ini = 1, num = sc.nextInt(),next, fin;

        while (num != 0) {
            num = sc.nextInt();
            next =ini+num;
            System.out.println(num);
            System.out.println(next);

        }


    }
}
