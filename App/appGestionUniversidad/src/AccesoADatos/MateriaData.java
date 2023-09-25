package AccesoADatos;

import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author @SimonettaDaniel
 */
public class MateriaData {
    
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO `materia`(`nombre`, `ano`,`estado`) "
                + "VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAno());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito.");          
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Materias" + ex.getMessage());
        }

    }
    
//    public Materia buscarMateriaPorId(int id) {
//        Materia materia = null;
//        String sql = "SELECT * FROM materia where id=? AND estado=1;";
//        try (PreparedStatement stp = con.prepareStatement(sql); ResultSet rs = stp.executeQuery()) {
//            stp.setInt(1, id);
//            if (rs.next()) {
//                materia = new Materia();
//                materia.setIdMateria(rs.getInt("idMateria"));
//                materia.setNombre(rs.getString("nombre"));
//                materia.setAno(rs.getInt("ano"));
//                materia.setEstado(rs.getBoolean("estado"));
//} else {
//                System.out.println("Materia no encontrada");
//                JOptionPane.showMessageDialog(null, "No existe la materia");
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error SQL contacte administrador" + e.getMessage(), "Error Conexion base de datos sql", JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
//        } 
//        return materia;
//}
    public Materia buscarMateriaPorId(int id) {
        Materia materia = null;
        String sql = "SELECT nombre, ano FROM materia WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAno(rs.getInt("ano"));
                materia.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia con ese id");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Materias" + ex.getMessage());

        }

        return materia;
    }
    
    public Materia buscarMateria(String nombre) {
        Materia materia = null;
        String sql = "SELECT nombre, ano, idMateria FROM Materia WHERE nombre = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(nombre);
                materia.setAno(rs.getInt("ano"));
                materia.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Materias" + ex.getMessage());

        }

        return materia;
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ?, ano = ?, estado = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAno());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            int guardar = ps.executeUpdate();
            if (guardar == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó correctamente la materia");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar/modificar en modificar x id" + ex.getMessage());
        }
    }
     public void modificarNombreMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ?, ano = ?,  WHERE nombre = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAno());
            int guardar = ps.executeUpdate();
            if (guardar == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó correctamente el nombre de la materia");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar/modificar en modificar x nombre" + ex.getMessage());
        }
    }
    
    
    public void eliminarMateria(int id) {
        String sql = "DELETE FROM materia WHERE idMateria = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int eliminar = ps.executeUpdate();
            if (eliminar == 1) {
                JOptionPane.showMessageDialog(null, "La materia con ese ID ha sido eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la materia" + ex.getMessage());
        }
    }
    
    public void eliminarMateriaxNombre(String nombre) {
        String sql = "DELETE FROM materia WHERE nombre = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);

            int eliminar = ps.executeUpdate();
            if (eliminar == 1) {
                JOptionPane.showMessageDialog(null, "La materia ha sido eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la materia" + ex.getMessage());
        }
    }

    public List<Materia> listarMaterias() {

        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAno(rs.getInt("ano"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de Materias" + ex.getMessage());
        }
        return materias;
    }

}
