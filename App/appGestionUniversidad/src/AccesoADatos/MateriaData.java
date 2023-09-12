package AccesoADatos;

import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author @SimonettaDaniel
 */
public class MateriaData {
    //Daniel: Lo cree incompleto porque queria probar algo de las consultas
    
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    
    
    public List<Materia> listarAlumnos() {

        List<Materia> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();

                
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }
}
