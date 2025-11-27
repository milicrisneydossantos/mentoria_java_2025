package entities;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private Categoria categoria;

    public Livro() {
    }
    
    public Livro(String titulo, String autor, int ano, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", categoria=" + categoria + '}';
    }
    
    public void atualizarCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    
}
