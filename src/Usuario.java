package Biblioteca.src;

public class Usuario  {
    BibliotecaService bibliotecaService = new BibliotecaService();
    protected String name = "";
    protected Integer id = 1;


    public void Cadastrando(String name) {
        this.name = name;
        this.id = id;
                this.id ++;

        bibliotecaService.CadastrarUsuario(name, id);



    }



}
