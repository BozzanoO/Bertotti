package observer;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis");
        
        Observador cliente = new Cliente();
        Observador distribuidor = new Distribuidor();
        
        livro.adicionarObservador(cliente);
        livro.adicionarObservador(distribuidor);
        
        livro.alterarPreco(50.00); // Define o preço inicial do livro
        
        System.out.println("Preço para o cliente: R$ " + cliente.getPrecoAtual());
        System.out.println("Preço para o distribuidor: R$ " + distribuidor.getPrecoAtual());
    }
}