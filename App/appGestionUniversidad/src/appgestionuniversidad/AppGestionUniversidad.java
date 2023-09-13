package appgestionuniversidad;


import java.sql.PreparedStatement;
import AccesoADatos.*;
import java.sql.Connection;

/**
 *
 * @author cyka
 */
public class AppGestionUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con = null; //Objeto Connection
        PreparedStatement ps = null; //Objeto PreparedStatement
        con = Conexion.getConexion(); //Llamado al método "getConexion()" que retorna tipo "Connection" y establece la conexión
        
        /*Test inscripcion como esta en el video==>
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();
        */
        
    }
    
}
