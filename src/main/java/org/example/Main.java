package org.example;

import procesadores.Procesadores;
import procesadores.Procesadores_Intel;
import procesadores.Procesadores_AMD;
import procesadores.Procesadores_moviles;

public class Main {
    public static void main(String[] args) {

        Procesadores p1 = new Procesadores();
        //Cambio Mireya Garcia
        Procesadores_Intel pro_3 = new Procesadores_Intel(5,7.5,5.5, "Corei7","LGA1158",true);
        Procesadores_Intel pro_4 = new Procesadores_Intel(4,4.5,8.1, "Corei8","LGA1159",true);
        Procesadores_Intel pro_5 = new Procesadores_Intel(6,6.5,4.0, "Corei4","LGA1153",false);

        //Christian Márquez integrante x
        Procesadores_moviles Movil1 = new Procesadores_moviles(8, 10.0, 2.84, "Snapdragon 888", true);
        Procesadores_moviles Movil2 = new Procesadores_moviles(6, 6.0, 2.73, "Exynos 2100", true);
        Procesadores_moviles Movil3 = new Procesadores_moviles(8, 5.0, 3.1, "Apple A14 Bionic", true);
        Procesadores_moviles Movil4 = new Procesadores_moviles(8, 8.5, 2.86, "Kirin 9000", true);


        //Alisson Muñoz
        Procesadores_AMD AMD = new Procesadores_AMD(12, 150.0, 2.84, "Ryzen 9 5900HX", "AM4");
        Procesadores_Intel Intel = new Procesadores_Intel(8, 3.2, "Core i7", true);
        Procesadores_AMD AMD3 = new Procesadores_AMD(8,95.0,35.0,"Intel Core i7-11700K","LGA 1200");


        //David Muela
        Procesadores_AMD amd1 = new Procesadores_AMD(12,65.00,3.5,"Ryzer 3 3200G","AMD4");
        Procesadores_AMD amd2 = new Procesadores_AMD(8,35.00,2.5,"Ryzer 5 5600G","AMD4");
        Procesadores_AMD amd3 = new Procesadores_AMD(16,85.00,4.5,"Ryzer 5 5600X","AMD4");

        //Alejandro Gutierrez
        Procesadores_AMD procesador1 = new Procesadores_AMD(16,56.,5.7,"Ryzen 9 7950X","ARM");
        Procesadores_Intel procesador2 = new Procesadores_Intel(8,50.,2.7,"Intel Core 15","LGA",false);
        Procesadores_moviles procesador3 = new Procesadores_moviles(16,56.,5.7,"Snapdragon Gen 8",true);



        //Adrian Ramos

        //Richard Soria
        Procesadores_AMD p12 = new Procesadores_AMD(12, 105.0, 3,"AMD Ryzen™ 9 5900X", "AM4", true);
        Procesadores_AMD p13 = new Procesadores_AMD(8, 35.0, 3,"AMD Ryzen™ 7 PRO 8700GE", "AM5", true);
        Procesadores_AMD p14 = new Procesadores_AMD(6, 65.0, 4,"AMD Ryzen™ 5 8600G", "AM4", true);

        //Anderson Vilatuña
        Procesadores_AMD amdVA1 = new Procesadores_AMD(12,65.00,3.5,"Ryzer 5 3200G","AMD4");
        Procesadores_AMD amdVA= new Procesadores_AMD(8,35.00,2.5,"Ryzer 8 5600G","AMD4");
        Procesadores_AMD amdVA3 = new Procesadores_AMD(16,85.00,4.5,"Ryzer 7 5600X","AMD4");

        //Wilmer Vargas
        Procesadores_AMD pamd1 = new Procesadores_AMD(8, 105.0, 4, "Ryzen 7 5800X", "AM4", false);
        Procesadores_Intel pIntel1 = new Procesadores_Intel(6, 3.9, "Core i5-11600K", true);
        Procesadores_Intel pIntel2 = new Procesadores_Intel(8, 3.5, "Core i9-11900K", true);

        //Mateo Cardenas
        Procesadores_AMD p21 = new Procesadores_AMD(12, 105.0, 3,"AMD Ryzen™ 9 5900X", "AM4", true);
        Procesadores_AMD p22 = new Procesadores_AMD(8, 3.0, 3,"AMD Ryzen™ 8 PRO 8700GE", "AM5", true);
        Procesadores_AMD p23 = new Procesadores_AMD(6, 65.0, 4,"AMD Ryzen™ 7 8600G", "AM4", true);



        //Cambios de Alisson Viteri
        Procesadores_AMD proc_1 = new Procesadores_AMD(3,10.5,18, "Ryzen9","AM5",false);
        Procesadores_AMD proc_2 = new Procesadores_AMD(8,12.5,10, "Epy77","FM1",false);
        Procesadores_AMD proc_3 = new Procesadores_AMD(4,13,5, "Threadripper","B650",true);
        //Marlon Nicolalde
        Procesadores_Intel pi1=new Procesadores_Intel(16, 3.74, 5.9, "Core i9-14900KS", "Socket H4 LGA-1151", false);
        Procesadores_Intel pi2=new Procesadores_Intel(12, 2.45, 5.8, "Core i5-14450HX", "Socked 1200 Boxed", true);
        Procesadores_Intel pi3=new Procesadores_Intel(8, 2.12, 2.14, "Core i7-8705G", " Socket LGA1366", true);





        //Anthony Astudillo
        Procesadores_Intel p15 = new Procesadores_Intel(20,260.45,5.6,"intel core i7-14700KF","LGA1700",true);
        Procesadores_AMD p16 = new Procesadores_AMD(7, 105.0, 4,"Ryzen 5 4500 4gen", "AM4", false);
        Procesadores_moviles p17 = new Procesadores_moviles(6,7.25,3.23,"Chip A15 Bionic",true);


        //Elkin Diaz
        Procesadores_Intel p9 = new Procesadores_Intel(24, 6.8, 5.6,"Intel Core I9","LGA 2066", true);
        Procesadores_AMD  p10 = new Procesadores_AMD(12, 4.8, 3, "AMD Ryzen 9 5900X","AM4",true);
        Procesadores_moviles p11 = new Procesadores_moviles(8, 2.2, 8.0, "MediaTek Helio G99",true);
    }

































    // Walter Cobacango
    Procesadores_AMD prec1 = new Procesadores_AMD(12, 105.0, 4.8, "AMD Ryzen 9 5900X", "AM4");
    Procesadores_AMD prec2 = new Procesadores_AMD(8, 105.0, 4.7, "AMD Ryzen 7 5800X", "Socket AM4");
    Procesadores_AMD prec3 = new Procesadores_AMD(6, 65.0, 4.6, "AMD Ryzen 5 5600X", "Socket AM4");




}