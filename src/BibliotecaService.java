package Biblioteca.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaService <T>  {

    Map<String, Integer> livrosDisponiveis = new HashMap<>();

    Map<String, Integer> Usuariolist = new HashMap<>();

    Map<String, String> livrosEmprestado = new HashMap<>();




    Scanner input = new Scanner(System.in);

    Usuario usuario;

 public  T AdicionandoLivro(String livro, Integer quantidade){
     livrosDisponiveis.put(livro,quantidade);



    return null;

 }

    public void MostrarLivros(){

        livrosDisponiveis.forEach((key, value) -> {
            if (value >= 1)
            System.out.println("nome do livro: " + key + "\nquantidades disponveis na biblioteca: " + value);
            System.out.println();
        });
    }

    public void EmprestandoLivros(){
     String nomeUsuario;
     String livroEscolhido;
   System.out.println("digite seu nome: ");

 nomeUsuario = input.nextLine();

   if (Usuariolist.containsKey(nomeUsuario)){
       System.out.println("voce ja esta cadastrado!");
       System.out.println("esses são os livros disponiveis");
       MostrarLivros();
       System.out.println("escolha o livro que deseja: ");

       livroEscolhido = input.nextLine();

       if (livrosDisponiveis.containsKey(livroEscolhido)){

           int qtdAtual = livrosDisponiveis.get(livroEscolhido);
        if (qtdAtual > 0){
            livrosDisponiveis.put(livroEscolhido, qtdAtual - 1);
            System.out.println(" você tem até 15 dias para devolver o livro! ");
            livrosEmprestado.put(nomeUsuario,livroEscolhido);
        }else {
            System.out.println(" desculpe, o livro não esta mais disponivel");
        }
       }else {System.out.println("esse livro não existe no catalogo");}




   }else {System.out.println(" voce nao esta cadastrado ");}



    }


    public void CadastrarUsuario(String nome, Integer id){
String opcao;
        if (Usuariolist.containsKey(nome)){
            System.out.println("esse nome ja existe, deseja adicionar ele novamente?");
            opcao = input.nextLine();
            if (opcao.equalsIgnoreCase("sim")){
                Usuariolist.put(nome,id);
                System.out.println(" adicionamos novamente ");
            }
            else {System.out.println(" não adicionamos.");}

        }else {Usuariolist.put(nome,id);

        System.out.println("adicionado com sucesso");
        }
//



    }


}
