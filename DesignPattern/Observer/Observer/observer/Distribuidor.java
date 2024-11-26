package observer;

public class Distribuidor implements Observador {

    private Double precoLivro;

    @Override
    public void atualizar(Double preco) {
        this.precoLivro = preco * 0.85; // Preço com 15% de desconto
    }

    @Override
    public Double getPrecoAtual() {
        return this.precoLivro;
    }
}