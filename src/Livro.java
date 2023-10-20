public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private String anolancamento;

    public Livro(String titulo, String autor, String editora, String anolancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anolancamento = anolancamento;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(String anolancamento) {
        this.anolancamento = anolancamento;
    }
}
