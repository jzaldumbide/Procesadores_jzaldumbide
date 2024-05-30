package org.example;

import procesadores.Procesadores;
import procesadores.Procesadores_Intel;
import procesadores.Procesadores_AMD;
import procesadores.Procesadores_moviles;

public class Main {
    public static void main(String[] args) {

        Procesadores p1 = new Procesadores();
        //Cambio Mireya Garcia
        Procesadores_Intel pro_3 = new Procesadores_Intel(5,7.5,5, "Corei7","LGA1158",true);
        Procesadores_Intel pro_4 = new Procesadores_Intel(4,4.5,8, "Corei8","LGA1159",true);
        Procesadores_Intel pro_5 = new Procesadores_Intel(6,6.5,4, "Corei4","LGA1153",false);
        //Christian Márquez integrante x

        //Alisson Muñoz

        //David Muela
        Procesadores_AMD amd1 = new Procesadores_AMD(12,65.00,3.5,"Ryzer 3 3200G","AMD4");
        Procesadores_AMD amd2 = new Procesadores_AMD(8,35.00,2.5,"Ryzer 5 5600G","AMD4");
        Procesadores_AMD amd3 = new Procesadores_AMD(16,85.00,4.5,"Ryzer 5 5600X","AMD4")





        //Adrian Ramos

        //Richard Soria
        //Richard Soria
        Procesadores_AMD p12 = new Procesadores_AMD(12, 105.0, 3.7,"AMD Ryzen™ 9 5900X", "AM4", true);
        Procesadores_AMD p13 = new Procesadores_AMD(8, 35.0, 3.6,"AMD Ryzen™ 7 PRO 8700GE", "AM5", true);
        Procesadores_AMD p14 = new Procesadores_AMD(6, 65.0, 4.3,"AMD Ryzen™ 5 8600G", "AM4", true);


        // Walter Cobacango

        //Cambios de Alisson Viteri
        Procesadores_AMD proc_1 = new Procesadores_AMD(3,10.5,18, "Ryzen9","AM5",false);
        Procesadores_AMD proc_2 = new Procesadores_AMD(8,12.5,10, "Epy77","FM1",false);
        Procesadores_AMD proc_3 = new Procesadores_AMD(4,13,5, "Threadripper","B650",true);

        //Ithan Camacho
        Procesadores_moviles quealcom = new Procesadores_moviles(8, 6.0, 12.6, "Snapdragon 8 gen2", true);

    }

}