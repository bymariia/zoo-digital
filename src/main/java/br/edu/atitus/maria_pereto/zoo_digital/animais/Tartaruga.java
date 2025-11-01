package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Corredor;

public class Tartaruga extends Reptil implements Nadador, Corredor {
    @Override
    public void emitirSom() {
        System.out.println("Som de tartaruga.");
    }
    @Override
    public void nadar() {
        System.out.println("Tartaruga nadando lentamente.");
    }
    @Override
    public void correr() {
        System.out.println("Tartaruga andando lentamente.");
    }
}