package Entidades;

import java.time.LocalDate;

/**
 *
 * @author @SimonettaDaniel
 */
public class Alumno {
    private int idAlumno;
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fNac;
    private boolean estado;

    public Alumno(int idAlumno, String nombre, String apellido, int dni, LocalDate fNac, boolean estado) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fNac = fNac;
        this.estado = estado;
    }

    public Alumno(String nombre, String apellido, int dni, LocalDate fNac, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fNac = fNac;
        this.estado = estado;
    }

    public Alumno() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fNac=" + fNac + ", estado=" + estado + '}';
    }
}
