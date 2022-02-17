
package atividade;

public class Livro {
   private String titulo,autor,genero;
   private int ano;
   private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
   
   public void livros(){
   this.titulo = "As aventuras de alguem";
   this.genero = "aventura";
   this.autor = "pablo picasso";
   this.ano = 1996;
   this.preco = 79;
   
   this.titulo = "Poças de sangue";
   this.genero = "Drama";
   this.autor = "pablo picasso";
   this.ano = 1992;
   this.preco = 98;
   }
}
