package Bertotti.DesignPattern.Strategy.TimeCalc;

public class Moto implements VeiculoInterface{
    private static final Double velocidade = 90.0; // km/h

    @Override
    public Double calcularTempoViagem(Double distancia){
        return distancia/velocidade*60;
    }
}
