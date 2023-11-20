package Objetos;

public class Socio implements Comparable<Socio> {
    private int numeroAsociado;
    private String dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String telefono;
    private String estado;

    // Constructor, getters y setters

    public Socio(int numeroSocio, String dni2, String nombre2, String apellido2, String domicilio2, String telefono2,
            String estado2) {
    }

    @Override
    public int compareTo(Socio otroSocio) {
        return Integer.compare(this.numeroAsociado, otroSocio.getNumeroAsociado());
    }

    public int getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(int numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
