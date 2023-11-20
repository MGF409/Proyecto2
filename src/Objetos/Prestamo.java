package Objetos;
public class Prestamo {
    private int numeroIdentificador;
    private int codigoLibro;
    private int numeroSocio;
    private String fechaPrestamo;
    private int plazo;
    private String fechaVencimiento;
    private String estado;
    private String fechaDevolucion;

    
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }
    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
    public int getCodigoLibro() {
        return codigoLibro;
    }
    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }
    public int getNumeroSocio() {
        return numeroSocio;
    }
    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public int getPlazo() {
        return plazo;
    }
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public double getMulta() {
        return multa;
    }
    public void setMulta(double multa) {
        this.multa = multa;
    }
    private double multa;

    // Constructor, getters y setters

    
}

