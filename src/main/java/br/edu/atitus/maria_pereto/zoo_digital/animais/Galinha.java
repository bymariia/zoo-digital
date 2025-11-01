package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Corredor;

public class Galinha extends Ave implements Corredor {
    @Override
    public void emitirSom() {
        System.out.println("Cocorocó!");
    }
    @Override
    public void correr() {
        System.out.println("Galinha ciscando e correndo.");
    }
}