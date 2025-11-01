package br.edu.atitus.maria_pereto.zoo_digital.animais;

public abstract class Animal {

    private String nome;
    private int idade;
    private String especie;
    
    private static int contador = 0;

    // Construtor
    public Animal() {
        Animal.contador++; // Incrementa o contador toda vez que um animal é criado
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public static int getContador() {
        return contador;
    }

    public abstract void emitirSom();

    public void comer() {
        System.out.println(this.getEspecie() + " está comendo."); 
    }
}