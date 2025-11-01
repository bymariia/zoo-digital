package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;

public class Golfinho extends Mamifero implements Nadador {

    @Override
    public void emitirSom() {
        System.out.println("Assobio de golfinho.");
    }

    @Override
    public void nadar() {
        System.out.println("Golfinho nadando e saltando.");
    }
}