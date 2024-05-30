package org.example;

import procesadores.Procesadores;
import procesadores.Procesadores_AMD;
import procesadores.Procesadores_moviles;
import procesadores.Procesadores_Intel;


public class Main {
    public static void main(String[] args) {

        Procesadores p1 = new Procesadores();
        //Christian Márquez integrante x

        //Alisson Muñoz
        //Mateo Torres
        Procesadores_AMD m1 = new Procesadores_AMD(16, 105.0, 3.4,"Ryzen 9 5950X", "AM4");
        Procesadores_moviles m2 = new Procesadores_moviles(4,45.5,3.5,"Snapdragon 750",true);
        Procesadores_Intel m3 = new Procesadores_Intel(16, 125.4, 3.2,"Core i9-12900K", "LGA 1700", false);

        //Adrian Ramos

        //Richard Soria

        // Walter Cobacango
    }

}