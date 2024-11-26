package Bertotti.DesignPattern.Strategy.TimeCalc;

public class Carro implements VeiculoInterface{
    private static final Double velocidade = 70.0; // km/h

    @Override
    public Double calcularTempoViagem(Double distancia){
        return distancia/velocidade*60;
    }
}
