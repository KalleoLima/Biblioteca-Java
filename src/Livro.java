package Biblioteca.src;

public class Livro  {

    private String titulo;
    private String Autor;
    private boolean disponibilidade = true;
    private int isbn;
    BibliotecaService bibliotecaService;


    public Livro(String titulo, String autor,  int isbn, boolean disponibilidade) {
        this.titulo = titulo;
        Autor = autor;
        this.disponibilidade = disponibilidade;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Nome do livro: " + titulo+ "\nAutor do livro: " + Autor +
                "\nisbn: " + isbn + "\n";
    }


//    private String titulo;
//    private String Autor;
//    private boolean disponibilidade = true;
//    private int isbn;
}



