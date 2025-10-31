package Biblioteca.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BibliotecaService bibliotecaService = new BibliotecaService();
    Livro livros = new Livro();
    Usuario usuario = new Usuario();
        Scanner input = new Scanner(System.in);
int opcoes =3;



 bibliotecaService.AdicionandoLivro("habitos atomico",3);
bibliotecaService.AdicionandoLivro("nao tenho fe para ser ateu", 4);
bibliotecaService.AdicionandoLivro("livro 2", 4);
        bibliotecaService.CadastrarUsuario("kalleo", 1);
while (opcoes != 5){
    opcoes = input.nextInt();
         if (opcoes == 2){
            bibliotecaService.MostrarLivros();
        }
        else if (opcoes == 3){

            bibliotecaService.EmprestandoLivros();
        }
    }

// CADASTRAR "ALUNO"
         // EMPRESTAR LIVRO
        //         // LIVROS DISPONIVEISOS
         // RETIRAR UM  LIVRO DA SESSÃO
         //SAIR
         //
         //












    }
}
