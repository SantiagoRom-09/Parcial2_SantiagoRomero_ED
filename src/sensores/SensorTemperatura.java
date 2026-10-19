package sensores;

import java.util.Random;

/**
 * Sensor de temperatura. Rango válido: [-10, 50] °C.
 */
public class SensorTemperatura extends Sensor {

    public static final int MIN = -10;
    public static final int MAX = 50;
    private static final Random RND = new Random();

    public SensorTemperatura(String id, int capacidad) {
        super(id, "C", capacidad);
    }

    @Override
    public int generarLectura() {
        // Genera de -20 a 60, para que a veces salga fuera de rango [-10, 50]
        int valor = RND.nextInt(MAX - MIN + 21) + (MIN - 10);
        registrarLectura(valor);
        return valor;
    }

    @Override
    public boolean fueraDeRango(int valor) {
        return valor < MIN || valor > MAX;
    }
}