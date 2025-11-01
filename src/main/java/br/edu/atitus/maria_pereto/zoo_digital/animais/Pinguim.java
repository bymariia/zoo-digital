package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Pinguim extends Ave implements Nadador, Predador { 

    @Override
    public void emitirSom() {
        System.out.println("Som de pinguim.");
    }

    @Override
    public void nadar() {
        System.out.println("Pinguim nadando rapidamente.");
    }

    @Override
    public void cacar() {
        System.out.println("Pinguim está caçando comida no gelo.");
    }
}
