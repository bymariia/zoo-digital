package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Corredor;

public class Lagarto extends Reptil implements Corredor {
    @Override
    public void emitirSom() {
        System.out.println("Som de lagarto.");
    }
    @Override
    public void correr() {
        System.out.println("Lagarto correndo pelas pedras.");
    }
}