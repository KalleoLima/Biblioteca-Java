package Biblioteca.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaService <T>  {

    List<Livro> livrosDisponiveis = new ArrayList<>();

    Map<String, Integer> Usuariolist = new HashMap<>();

    Map<String, String> livrosEmprestado = new HashMap<>();



    Scanner input = new Scanner(System.in);

    Usuario usuario;

 public void adicionandoLivro(String titulo, String autor, int isbn, boolean disponibilidade){

livrosDisponiveis.add(new Livro( titulo ,autor ,isbn,  disponibilidade));





 }

    public void mostrarLivros(){

        for (Livro percorre : livrosDisponiveis){
            System.out.println(percorre);
        }
    }

    public void emprestandoLivros(){
     String nomeUsuario;
     String livroEscolhido;
   System.out.println("digite seu nome: ");

 nomeUsuario = input.nextLine();

   if (Usuariolist.containsKey(nomeUsuario)){
       System.out.println("voce ja esta cadastrado!");
       System.out.println("esses são os livros disponiveis");
       mostrarLivros();
       System.out.println("escolha o livro que deseja: ");

       livroEscolhido = input.nextLine();
   for(Livro L: livrosDisponiveis){
       if (L.getTitulo().equalsIgnoreCase(livroEscolhido)){

           if (L.isDisponibilidade() == true){
               System.out.println("Escolhi com sucesso!");
               System.out.println(" Vôce tem até 15 dias para devolver o livro!! ");
               L.setDisponibilidade(false);
               livrosEmprestado.put(L.getTitulo(),nomeUsuario);



           }else {System.out.println(" esse livro não está disponivel");}

       }

   }




   }else {System.out.println(" voce nao esta cadastrado ");}



    }


    public void cadastrarUsuario(String nome, Integer id){
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
    public void devolucao(){
    System.out.println("digite seu nome completo! :");
     String nomeDEvolucao = input.nextLine();
    String livrodevolvido =null;
     for (Map.Entry<String, String> entry : livrosEmprestado.entrySet()){
     if (nomeDEvolucao.equalsIgnoreCase(entry.getValue())){
        System.out.println("o livro que você pegou foi: " + entry.getKey());
         System.out.println("📚 Livro devolvido com sucesso!");
         livrodevolvido = entry.getKey();
            break;
     }}

    if (livrodevolvido != null){
livrosEmprestado.remove(livrodevolvido);

for (Livro L : livrosDisponiveis){
    if (L.getTitulo().equalsIgnoreCase(livrodevolvido)){
        L.setDisponibilidade(true);
        break;
    }


}
    }

else {System.out.println("Nenhum livro encontrado para o nome informado.");}
 }

}
