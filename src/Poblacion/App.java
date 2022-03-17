package Poblacion;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Set<Poblacion> poblaciones = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        poblaciones.add(new Poblacion("06210", "Torremejia"));
        poblaciones.add(new Poblacion("06010", "Badajoz"));
        poblaciones.add(new Poblacion("06315", "Merida"));
        poblaciones.add(new Poblacion("06200", "Zafra"));

        System.out.println(poblaciones);

        map.put("06210", "Torremejia");
        map.put("06010", "Badajoz");
        map.put("06315", "Merida");
        map.put("06200", "Zafra");

        // Imprimir Clave y valor.
        Set<Map.Entry<String, String>> codPob = map.entrySet();
        for (Map.Entry<String, String> pob :
                codPob) {
            System.out.println("La poblacion con codigo postal  " + pob.getKey() + " se refiere " + pob.getValue());
        }

        // Imprimir clave
        Set<String> clave = map.keySet();
        for (String cl :
                clave) {
            System.out.println(cl);
        }

        //Imprimir valor
        Collection<String> valor = map.values();
        for (String va :
                valor) {
            System.out.println(va);
            }

        //ArrayList
        List<Poblacion> poblacion = new ArrayList<>();

        poblacion.add(new Poblacion("06210", "Torremejia"));
        poblacion.add(new Poblacion("06010", "Badajoz"));
        poblacion.add(new Poblacion("06315", "Merida"));
        poblacion.add(new Poblacion("06200", "Zafra"));

        System.out.println(poblacion);
    }
}
