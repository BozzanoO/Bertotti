package observer;

public class Cliente implements Observador {

    private Double precoLivro;

    @Override
    public void atualizar(Double preco) {
        this.precoLivro = preco * 1.10; // Preço com 10% de acréscimo
    }

    @Override
    public Double getPrecoAtual() {
        return this.precoLivro;
    }
}