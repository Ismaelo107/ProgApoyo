package Actividad01_Repaso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while (menu != 4) {
            System.out.println("""
                    1.- Crear alumnos
                    2.- Buscar alumnos
                    3.- Calcular media de notas
                    """);
            System.out.println("Instroducir opción del menu: ");
             menu = sc.nextInt();
            switch (menu) {

                case 1:
                    System.out.println("Insertar Nombre:");
                    String nombre = sc.next();
                    System.out.println("Insertar Nota:");
                    float nota = sc.nextFloat();
                    alumnos.add(new Alumno(nombre, nota));
                    break;

                case 2:
                    System.out.println("""
                            Has seleccionado Buscar alumno por nombre
                            Instroducir nombre de alumno:
                            """);
                    String alumnoAl = sc.next();
                    Iterator<Alumno> it = alumnos.iterator();
                    Alumno alumno;
                    alumno = it.next();
                    while (it.hasNext()) {
                        if (alumno.getNombre().equals(alumnoAl)) {
                            System.out.println("Alumno encontrado");
                            System.out.println(alumno);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Has seleccionado hacer media total");
                    float media =0;
                    for (Alumno avg :
                            alumnos) {
                        media += avg.getNota()/alumnos.size();
                    }
                    System.out.println(media);
                    break;

                case 4:
                    System.out.println("Adiós");
            }

        }
    }
}
