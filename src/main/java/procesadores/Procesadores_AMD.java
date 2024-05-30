package procesadores;

public class Procesadores_AMD extends Procesadores_escritorio{
    Boolean sensor_temperatura;
    public Procesadores_AMD(int i, double v, int i1, String ryzen9, String am5, boolean b) {}

    public Procesadores_AMD(int nucleos, Double consumo, Double velocidad, String nombre, String socket) {
        super(nucleos, consumo, velocidad, nombre, socket);
        this.sensor_temperatura=sensor_temperatura;
    }

    public Boolean getSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(Boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }
}
