package br.edu.atitus.maria_pereto.zoo_digital.app;

import br.edu.atitus.maria_pereto.zoo_digital.animais.*; 
import br.edu.atitus.maria_pereto.zoo_digital.comportamentos.*; 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ZooDigitalApp {

    private List<Animal> animais;
    private Scanner scanner;

    public ZooDigitalApp() {
        this.animais = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ZooDigitalApp app = new ZooDigitalApp();
        app.run();
    }
    
    private void printHeader(String title) {
        System.out.println("\n========================================");
        System.out.println("      " + title);
        System.out.println("========================================");
    }

    private void clearConsole() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    
    private void pause() {
        // --- ESTA É A LINHA CORRIGIDA ---
        System.out.print("\n[Pressione Enter para voltar ao menu] "); 
        scanner.nextLine();
    }
    
    public void run() {
        clearConsole();
        printHeader("Bem-vindo ao Zoo Digital!");
        System.out.println("   Gerenciamento de animais via CLI.");

        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            try {
                String entrada = scanner.nextLine(); 
                if (entrada.isEmpty()) {
                    System.out.println("\n[ERRO] Nenhuma opção digitada. Tente novamente.");
                    pause();
                    continue; 
                }
                opcao = Integer.parseInt(entrada);
                
                clearConsole(); 
                
                switch (opcao) {
                    case 1:
                        cadastrarAnimal();
                        break;
                    case 2:
                        listarTodosAnimais();
                        break;
                    case 3:
                        listarAnimaisCorredores();
                        break;
                    case 4:
                        listarAnimaisNadadores();
                        break;
                    case 5:
                        listarAnimaisVoadores();
                        break;
                    case 6:
                        listarAnimaisPredadores();
                        break;
                    case 7:
                        exibirTotalAnimais();
                        break;
                    case 0:
                        printHeader("Obrigado por visitar o Zoo Digital!");
                        System.out.println("                  Até logo!");
                        System.out.println("========================================");
                        break;
                    default:
                        System.out.println("\n[ERRO] Opção inválida. Tente novamente.");
                        break;
                }
                
                if (opcao != 0) {
                    pause(); 
                }

            } catch (NumberFormatException e) {
                System.out.println("\n[ERRO] Entrada inválida. Por favor, digite um NÚMERO.");
                pause();
            } catch (Exception e) {
                System.out.println("\n[ERRO] Ocorreu um erro inesperado: " + e.getMessage());
                pause();
            }
        }
        scanner.close(); 
    }

    private void exibirMenu() {
        clearConsole();
        printHeader("Zoo Digital - Menu Principal");
        System.out.println("   1. Cadastrar Animal");
        System.out.println("   2. Listar Todos os Animais");
        System.out.println("   3. Listar Animais Corredores");
        System.out.println("   4. Listar Animais Nadadores");
        System.out.println("   5. Listar Animais Voadores");
        System.out.println("   6. Listar Animais Predadores");
        System.out.println("   7. Exibir Total de Animais Cadastrados");
        System.out.println("\n   0. Sair");
        System.out.print("\nEscolha sua opção: ");
    }

    private void cadastrarAnimal() {
        printHeader("1. Cadastrar Novo Animal");
        System.out.println("   Escolha um tipo de animal da lista abaixo:");
        System.out.println("   - Mamíferos: cachorro, gato, leao, golfinho");
        System.out.println("   - Aves:      aguia, galinha, pinguim, pato");
        System.out.println("   - Répteis:   cobra, jacare, tartaruga, lagarto");
        System.out.println("   - Peixes:    tubarao, salmao, traira, peixemorcego");
        
        System.out.print("\n   Digite o tipo: ");
        String tipo = scanner.nextLine().toLowerCase().trim();

        Animal novoAnimal = null;

        switch (tipo) {
            case "cachorro": novoAnimal = new Cachorro(); break;
            case "gato": novoAnimal = new Gato(); break;
            case "leao": novoAnimal = new Leao(); break;
            case "golfinho": novoAnimal = new Golfinho(); break;
            case "aguia": novoAnimal = new Aguia(); break;
            case "galinha": novoAnimal = new Galinha(); break;
            case "pinguim": novoAnimal = new Pinguim(); break;
            case "pato": novoAnimal = new Pato(); break;
            case "tubarao": novoAnimal = new Tubarao(); break;
            case "salmao": novoAnimal = new Salmao(); break;
            case "traira": novoAnimal = new Traira(); break;
            case "peixemorcego": novoAnimal = new PeixeMorcego(); break;
            case "cobra": novoAnimal = new Cobra(); break;
            case "jacare": novoAnimal = new Jacare(); break;
            case "tartaruga": novoAnimal = new Tartaruga(); break;
            case "lagarto": novoAnimal = new Lagarto(); break;
            default:
                System.out.println("\n[ERRO] Tipo de animal desconhecido: " + tipo);
                return; 
        }

        try {
            System.out.print("   Digite o nome do animal: ");
            novoAnimal.setNome(scanner.nextLine());
            
            System.out.print("   Digite a idade do animal: ");
            novoAnimal.setIdade(Integer.parseInt(scanner.nextLine()));
            
            novoAnimal.setEspecie(tipo); 

            animais.add(novoAnimal);
            System.out.println("\n[SUCESSO] " + novoAnimal.getNome() + " (o " + novoAnimal.getEspecie() + ") foi cadastrado!");

        } catch (NumberFormatException e) {
            System.out.println("\n[ERRO] A idade deve ser um número. Animal não cadastrado.");
        }
    }

    private void listarTodosAnimais() {
        printHeader("2. Lista de Todos os Animais");
        if (animais.isEmpty()) {
            System.out.println("   Nenhum animal cadastrado ainda.");
            return;
        }
        
        for (Animal animal : animais) {
            System.out.println("\n----------------------------------------");
            System.out.println("   Nome:    " + animal.getNome());
            System.out.println("   Idade:   " + animal.getIdade());
            System.out.println("   Espécie: " + animal.getEspecie());
            System.out.print("   Som:     ");
            animal.emitirSom(); 
            System.out.print("   Comida:  ");
            animal.comer();     
        }
        System.out.println("----------------------------------------");
    }

    private void listarAnimaisCorredores() {
        printHeader("3. Animais Corredores");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Corredor) {
                System.out.println("\n   -> " + animal.getNome() + " (" + animal.getEspecie() + ")");
                System.out.print("      Ação: ");
                ((Corredor) animal).correr(); 
                count++;
            }
        }
        if (count == 0) {
            System.out.println("   Nenhum animal corredor encontrado.");
        }
    }

    private void listarAnimaisNadadores() {
        printHeader("4. Animais Nadadores");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Nadador) {
                System.out.println("\n   -> " + animal.getNome() + " (" + animal.getEspecie() + ")");
                System.out.print("      Ação: ");
                ((Nadador) animal).nadar(); 
                count++;
            }
        }
        if (count == 0) {
            System.out.println("   Nenhum animal nadador encontrado.");
        }
    }

    private void listarAnimaisVoadores() {
        printHeader("5. Animais Voadores");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Voador) {
                System.out.println("\n   -> " + animal.getNome() + " (" + animal.getEspecie() + ")");
                System.out.print("      Ação: ");
                ((Voador) animal).voar(); 
                count++;
            }
        }
        if (count == 0) {
            System.out.println("   Nenhum animal voador encontrado.");
        }
    }

    private void listarAnimaisPredadores() {
        printHeader("6. Animais Predadores");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Predador) {
                System.out.println("\n   -> " + animal.getNome() + " (" + animal.getEspecie() + ")");
                System.out.print("      Ação: ");
                ((Predador) animal).cacar(); 
                count++;
            }
        }
        if (count == 0) {
            System.out.println("   Nenhum animal predador encontrado.");
        }
    }

    private void exibirTotalAnimais() {
        printHeader("7. Total de Animais");
        int totalInstanciado = Animal.getContador();
        int totalNaLista = animais.size();
        
        System.out.println("   Total de animais CRIADOS (static): " + totalInstanciado);
        System.out.println("   Total de animais ATUAIS (lista):   " + totalNaLista);
        
        if (totalInstanciado != totalNaLista) {
            System.out.println("\n   (Nota: A diferença ocorre se um cadastro falhar após a criação do objeto.)");
        }
    }
}