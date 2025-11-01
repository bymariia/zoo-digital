package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;

public class PeixeMorcego extends Peixe implements Nadador {

    @Override
    public void emitirSom() {
        System.out.println("Glub glub.");
    }

    @Override
    public void nadar() {
        System.out.println("Peixe-morcego nadando no fundo do oceano.");
    }
}