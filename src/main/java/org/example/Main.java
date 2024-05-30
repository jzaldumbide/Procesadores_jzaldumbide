package org.example;

import procesadores.Procesadores;
import procesadores.Procesadores_Intel;
import procesadores.Procesadores_AMD;

public class Main {
    public static void main(String[] args) {

        Procesadores p1 = new Procesadores();
        //Cambio Mireya Garcia
        Procesadores_Intel pro_3 = new Procesadores_Intel(5,7.5,5, "Corei7","LGA1158",true);
        Procesadores_Intel pro_4 = new Procesadores_Intel(4,4.5,8, "Corei8","LGA1159",true);
        Procesadores_Intel pro_5 = new Procesadores_Intel(6,6.5,4, "Corei4","LGA1153",false);
        //Christian Márquez integrante x

        //Alisson Muñoz




        //Adrian Ramos

        //Richard Soria



        //Cambios de Alisson Viteri
        Procesadores_AMD proc_1 = new Procesadores_AMD(3,10.5,18, "Ryzen9","AM5",false);
        Procesadores_AMD proc_2 = new Procesadores_AMD(8,12.5,10, "Epy77","FM1",false);
        Procesadores_AMD proc_3 = new Procesadores_AMD(4,13,5, "Threadripper","B650",true);
    }

































    // Walter Cobacango
    Procesadores_AMD prec1 = new Procesadores_AMD(12, 105.0, 4.8, "AMD Ryzen 9 5900X", "AM4");
    Procesadores_AMD prec2 = new Procesadores_AMD(8, 105.0, 4.7, "AMD Ryzen 7 5800X", "Socket AM4");
    Procesadores_AMD prec3 = new Procesadores_AMD(6, 65.0, 4.6, "AMD Ryzen 5 5600X", "Socket AM4");




}