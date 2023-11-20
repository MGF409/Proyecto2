package Objetos;
public class Libro implements Comparable<Libro> {
    private int codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;
    private String tematica;
    private double precio;

    // Constructor, getters y setters

    public Libro(int codigo2, String titulo2, String autor2, String editorial2, int anioPublicacion2, String tematica2,
            double precio2) {
    }

    @Override
    public int compareTo(Libro otroLibro) {
        return Integer.compare(this.codigo, otroLibro.getCodigo());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
