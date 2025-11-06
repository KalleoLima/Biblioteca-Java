package Biblioteca.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BibliotecaService bibliotecaService = new BibliotecaService();
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== 📚 SISTEMA DE BIBLIOTECA =====");
            System.out.println("1️⃣ - Cadastrar Usuário");
            System.out.println("2️⃣ - Cadastrar Livro");
            System.out.println("3️⃣ - Mostrar Livros Disponíveis");
            System.out.println("4️⃣ - Emprestar Livro");
            System.out.println("5️⃣ - Devolver Livro");
            System.out.println("0️⃣ - Sair");
            System.out.println("====================================");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n👤 Cadastro de Usuário");
                    System.out.print("Digite o nome: ");
                    String nome = input.nextLine();
                    System.out.print("Digite o ID numérico do usuário: ");
                    int id = input.nextInt();
                    input.nextLine();
                    bibliotecaService.cadastrarUsuario(nome, id);
                    break;

                case 2:
                    System.out.println("\n📘 Cadastro de Livro");
                    System.out.print("Digite o título do livro: ");
                    String titulo = input.nextLine();
                    System.out.print("Digite o autor: ");
                    String autor = input.nextLine();
                    System.out.print("Digite o ISBN (número): ");
                    int isbn = input.nextInt();
                    input.nextLine();
                    bibliotecaService.adicionandoLivro(titulo, autor, isbn, true);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n📚 LIVROS DISPONÍVEIS:");
                    bibliotecaService.mostrarLivros();
                    break;

                case 4:
                    System.out.println("\n📖 EMPRÉSTIMO DE LIVRO");
                    bibliotecaService.emprestandoLivros();
                    break;

                case 5:
                    System.out.println("\n↩️ DEVOLUÇÃO DE LIVRO");
                    bibliotecaService.devolucao();
                    break;

                case 0:
                    System.out.println("\n👋 Saindo do sistema... até logo!");
                    break;

                default:
                    System.out.println("❌ Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        input.close();
    }
}
