package observer;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String nomeLivro;
    private Double precoLivro;
    private List<Observador> observadores;

    public Livro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
        this.precoLivro = 0.0;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    public void alterarPreco(Double novoPreco) {
        this.precoLivro = novoPreco;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(precoLivro);
        }
    }
}