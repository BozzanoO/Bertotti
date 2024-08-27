package Bertotti.DesignPattern.Strategy.TimeCalc;

public class Bicicleta implements VeiculoInterface{
    private static final Double velocidade = 15.0; // km/h

    @Override
    public Double calcularTempoViagem(Double distancia){
        return distancia/velocidade*60;
    }
}
