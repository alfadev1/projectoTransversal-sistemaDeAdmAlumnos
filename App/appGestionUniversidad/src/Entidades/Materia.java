package Entidades;

/**
 *
 * @author @SimonettaDaniel
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int ano; //Yo me hago cargo
    private boolean estado;

    public Materia(int idMateria, String nombre, int ano, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.ano = ano;
        this.estado = estado;
    }

    public Materia(String nombre, int ano, boolean estado) {
        this.nombre = nombre;
        this.ano = ano;
        this.estado = estado;
    }

    public Materia() {
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", ano=" + ano + ", estado=" + estado + '}';
    }
}
