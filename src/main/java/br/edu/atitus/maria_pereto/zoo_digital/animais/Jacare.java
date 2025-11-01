package br.edu.atitus.maria_pereto.zoo_digital.animais;

import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.Predador;

public class Jacare extends Reptil implements Nadador, Predador {
    @Override
    public void emitirSom() {
        System.out.println("Som gutural de jacaré.");
    }
    @Override
    public void nadar() {
        System.out.println("Jacaré nadando.");
    }
    @Override
    public void cacar() {
        System.out.println("Jacaré esperando uma presa na água.");
    }
}