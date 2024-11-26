package com.singleton;

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        System.out.println(config1 == config2); // true

        config1.exibirMensagem();
    }
}