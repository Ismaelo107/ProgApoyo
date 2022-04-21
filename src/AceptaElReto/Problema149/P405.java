package AceptaElReto.Problema149;

import java.util.Scanner;

public class P405 {
    public static void main(String[] args) {
        /*
        int casos = sc.nextInt(),
        while (casos != 0) {
            casos--;}
            */

        Scanner sc = new Scanner(System.in);
        int ini = sc.nextInt();
        int num = -1;
        int next;
        int aux = 0;
        String result;
        boolean consecutivo=false;


        while (num != 0) {
            num = sc.nextInt();
            next = num + 1;
            if (next - num == 1 && num !=0) {
                if (next !=0){
                    aux = next-1 ;
                    result= ini+"-"+aux;

                } else{
                    ini=
                }
            }
        }




    }
}

