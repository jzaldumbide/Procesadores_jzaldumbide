package org.example;

import procesadores.Procesadores;
import procesadores.Procesadores_AMD;
import procesadores.Procesadores_moviles;

public class Main {
    public static void main(String[] args) {

        Procesadores p1 = new Procesadores();
        //Christian Márquez integrante x

        //Alisson Muñoz

        //Ithan Camacho


        //Adrian Ramos
        Procesadores_moviles quealcom = new Procesadores_moviles(8, 6.3, 12.6, "Snapdragon 8 gen3", true);

        // Carlos Perez
        Procesadores_AMD procesador1 = new Procesadores_AMD(6, 65.0, 3.5, "AMD RYZEN5 5600X", "AM4");
    }
}