public class Hexagono {
    public static double calcularHexagono(double lado, double altura){
        double volume;
        volume = (3 * Math.sqrt(3) * lado * lado * altura) / 2.0;
        return volume;
    }
}