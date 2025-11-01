package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Voador;

public class Pato extends Ave implements Nadador, Voador {

    @Override
    public void emitirSom() {
        System.out.println("Quack quack!");
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadando no lago.");
    }

    @Override
    public void voar() {
        System.out.println("Pato voando baixo.");
    }
}