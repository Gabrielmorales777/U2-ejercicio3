public class ControlRemoto {

    private ReproductorAudio reproductor;

    public ControlRemoto(ReproductorAudio reproductor) {
        this.reproductor = reproductor;
    }

    public void reproducir() {
        reproductor.play();
    }

    public void pausar() {
        reproductor.pause();
    }

    public void subirVolumen(int nuevoVolumen) {
        reproductor.cambiarVolumen(nuevoVolumen);
    }
}
