package org.example;

import procesadores.Procesadores;
import procesadores.Procesadores_AMD;
import procesadores.Procesadores_Intel;
import procesadores.Procesadores_moviles;


public class Main {
    public static void main(String[] args) {

        Procesadores_Intel procesador1 = new Procesadores_Intel(8,65.5,3.5,"Intel i7 11700","LGA 1152",true);
        Procesadores_AMD procesador2 = new Procesadores_AMD(4,40.5,2.5,"AMD Ryzen 7 5700G","AM4");
        Procesadores_moviles movil1 = new Procesadores_moviles(2,2.5,3.5,"iPhone 11",true);

    }
}