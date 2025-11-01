package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Cachorro extends Mamifero implements Corredor, Nadador, Predador { 

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void correr() {
        System.out.println("Cachorro correndo.");
    }

    @Override
    public void nadar() {
        System.out.println("Cachorro nadando (estilo cachorrinho).");
    }

    @Override
    public void cacar() {
        System.out.println("Cachorro está caçando a meia que roubou.");
    }
}