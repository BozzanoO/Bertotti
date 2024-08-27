package Bertotti.DesignPattern.Strategy.TimeCalc;

public class Strategy {
    private VeiculoInterface strategy;

    public void setStrategy(VeiculoInterface strategy) {
        this.strategy = strategy;
    }

    public Double calcularTempo(Double distance) {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de viagem definida.");
        }
        return strategy.calcularTempoViagem(distance);
    }
}
