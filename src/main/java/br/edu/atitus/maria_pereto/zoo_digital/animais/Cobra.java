package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Cobra extends Reptil implements Corredor, Predador {
    @Override
    public void emitirSom() {
        System.out.println("Ssssss!");
    }
    @Override
    public void correr() {
        System.out.println("Cobra rastejando rapidamente.");
    }
    @Override
    public void cacar() {
        System.out.println("Cobra caçando um rato.");
    }
}