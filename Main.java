
public class Main {

    public static void main(String[] args) {

        ReproductorAudio reproductor = new ReproductorAudio();

        ControlRemoto control = new ControlRemoto(reproductor);

        control.reproducir();

        control.subirVolumen(80);

        control.pausar();

        // Probamos una validación
        control.subirVolumen(120);
    }
}
