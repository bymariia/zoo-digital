package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Voador;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Aguia extends Ave implements Voador, Predador {
    @Override
    public void emitirSom() {
        System.out.println("Grito da águia.");
    }
    @Override
    public void voar() {
        System.out.println("Águia voando alto.");
    }
    @Override
    public void cacar() {
        System.out.println("Águia caçando uma cobra.");
    }
}
