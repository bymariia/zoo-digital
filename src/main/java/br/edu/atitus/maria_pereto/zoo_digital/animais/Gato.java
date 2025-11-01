package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Gato extends Mamifero implements Corredor, Predador {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
    @Override
    public void correr() {
        System.out.println("Gato correndo atrás de um novelo.");
    }
    @Override
    public void cacar() {
        System.out.println("Gato caçando um rato de brinquedo.");
    }
}
