package com.Singleton;

public class Configuracao {

    private static Configuracao instancia;

    private Configuracao() {
    }
    
    // Método público para acessar a instância
    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public void exibirMensagem() {
        System.out.println("Configuração Singleton ativa!");
    }
}

