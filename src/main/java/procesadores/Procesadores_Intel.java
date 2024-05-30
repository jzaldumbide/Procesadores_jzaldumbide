package procesadores;

public class Procesadores_Intel extends Procesadores_escritorio{
    Boolean tarjeta_video;

    public Procesadores_Intel(int i, double v, String coreI7, boolean b) {
    }

    public Procesadores_Intel(int nucleos, Double consumo, Double velocidad, String nombre, String socket, Boolean tarjeta_video) {
        super(nucleos, consumo, velocidad, nombre, socket);
        this.tarjeta_video = tarjeta_video;
    }

    public Boolean getTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(Boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }

    public void imprimir_datos_Intel(){
        System.out.println(this.getTarjeta_video());
    }
}
