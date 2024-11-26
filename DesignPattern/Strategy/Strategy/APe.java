package Bertotti.DesignPattern.Strategy.TimeCalc;

public class APe implements VeiculoInterface{
    private static final Double velocidade = 5.0; // km/h

    @Override
    public Double calcularTempoViagem(Double distancia){
        return (distancia/velocidade)*60;
    }
}
