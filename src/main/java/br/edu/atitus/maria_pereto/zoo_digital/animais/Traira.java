package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Traira extends Peixe implements Nadador, Predador {

    @Override
    public void emitirSom() {
        System.out.println("Som de traíra.");
    }

    @Override
    public void nadar() {
        System.out.println("Traíra nadando no rio.");
    }

    @Override
    public void cacar() {
        System.out.println("Traíra dando o bote em um peixe menor.");
    }
}