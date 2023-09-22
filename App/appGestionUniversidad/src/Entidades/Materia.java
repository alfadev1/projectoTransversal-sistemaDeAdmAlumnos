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
        return nombre+" - " + ano + "." ;
    }
    
    //para cuando se guarda en treeset se ordenen por id
    public int compareTo(Materia m) {
        //fijate si funciona esto
        return Integer.compare(idMateria, m.idMateria);
//        if(idMateria==m.idMateria){
//            return 0;
//        }else if(idMateria>m.idMateria){
//            return 1;
//        }else{
//            return -1;
//        }
    }
    
}
