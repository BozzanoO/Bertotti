package Bertotti.DesignPattern.Strategy.TimeCalc;

public class Onibus implements VeiculoInterface{
    private static final Double velocidade = 50.0; // km/h

    @Override
    public Double calcularTempoViagem(Double distancia){
        return distancia/velocidade*60;
    }
}
