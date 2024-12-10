public class Esfera {
    public static double calcularEsfera(double raio){
        double volume;
        volume = (4 * Math.PI * raio * raio * raio) / 3.0;
        return volume;
    }
}
