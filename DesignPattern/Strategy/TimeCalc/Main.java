package Bertotti.DesignPattern.Strategy.TimeCalc;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        Double distancia = 1000.0; //km

        //A pé:
        strategy.setStrategy(new APe());
        System.out.println("\nTempo de viagem caminhando: " + strategy.calcularTempo(distancia) + "minutos \n");
        
        //Bicicleta:
        strategy.setStrategy(new Bicicleta());
        System.out.println("\nTempo de viagem pedalando: " + strategy.calcularTempo(distancia) + "minutos \n");
    
        //Carro:
        strategy.setStrategy(new Carro());
        System.out.println("\nTempo de viagem dirigindo: " + strategy.calcularTempo(distancia) + "minutos \n");
        
        //Moto:
        strategy.setStrategy(new Moto());
        System.out.println("\nTempo de viagem pilotando: " + strategy.calcularTempo(distancia) + "minutos \n");
        
        //Ônibus:
        strategy.setStrategy(new Onibus());
        System.out.println("\nTempo de viagem no ônibus: " + strategy.calcularTempo(distancia) + "minutos \n");
    }
}
