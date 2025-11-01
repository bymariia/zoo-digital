package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Leao extends Mamifero implements Corredor, Predador {
    @Override
    public void emitirSom() {
        System.out.println("Roar!");
    }
    @Override
    public void correr() {
        System.out.println("Leão correndo na savana.");
    }
    @Override
    public void cacar() {
        System.out.println("Leão caçando uma zebra.");
    }
}