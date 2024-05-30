package procesadores;

public class Procesadores_moviles extends Procesadores{
    Boolean optimizacion_energia;

    public Procesadores_moviles() {
    }

    public Procesadores_moviles(int nucleos, Double consumo, Double velocidad, String nombre, Boolean optimizacion_energia) {
        super(nucleos, consumo, velocidad, nombre);
        this.optimizacion_energia = optimizacion_energia;
    }

    public Boolean getOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(Boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    public void imprimir_datos_moviles(){
        System.out.println(this.optimizacion_energia);
    }
}
