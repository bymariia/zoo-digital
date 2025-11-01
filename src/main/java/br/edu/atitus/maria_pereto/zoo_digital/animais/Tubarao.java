package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Tubarao extends Peixe implements Nadador, Predador {
    @Override
    public void emitirSom() {
        System.out.println("Som de tubarão.");
    }
    @Override
    public void nadar() {
        System.out.println("Tubarão nadando.");
    }
    @Override
    public void cacar() {
        System.out.println("Tubarão caçando focas.");
    }
}