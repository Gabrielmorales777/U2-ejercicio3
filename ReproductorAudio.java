public class ReproductorAudio {

    private int volumenActual;
    private String estado;

    public ReproductorAudio() {
        volumenActual = 50;
        estado = "detenido";
    }

    public void play() {
        estado = "reproduciendo";
        System.out.println("Audio reproduciéndose.");
    }

    public void pause() {
        if (estado.equals("reproduciendo")) {
            estado = "pausado";
            System.out.println("Audio pausado.");
        } else {
            System.out.println("No se puede pausar: el audio no está reproduciéndose.");
        }
    }

    public void cambiarVolumen(int nuevoVolumen) {
        if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            volumenActual = nuevoVolumen;
            System.out.println("Volumen cambiado a: " + volumenActual);
        } else {
            System.out.println("Error: el volumen debe estar entre 0 y 100.");
        }
    }
}
