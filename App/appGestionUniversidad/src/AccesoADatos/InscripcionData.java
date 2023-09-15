package AccesoADatos;

/**
 *
 * @author @SimonettaDaniel
 */

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class InscripcionData {
    private Connection con = null;
    AlumnoData ad = new AlumnoData();
    MateriaData md = new MateriaData();

    public InscripcionData() {
        this.con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        try {
            String sql = "INSERT INTO `Inscripcion`(`idAlumno`, `idMateria`, `nota`) "
                    + "VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción registrada");          
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Inscripción " + ex.getMessage());
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        try {
            String sql = "UPDATE Inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas>0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");          
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Inscripción " + ex.getMessage());
        }
    }
    
    public void borrarInscripcionMateriaAlumno (int idAlumno, int idMateria){
        try {
            String sql = "DELETE FROM Inscripcion WHERE idAlumno = ? and idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if (filas>0) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada");          
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Inscripción " + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM Inscripcion";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto")); //Acá fijense el nombre que tengan en sus bases, por las dudas.
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("Nota"));
                cursadas.add(insc);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Inscripción" + ex.getMessage());
        }
        return cursadas;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM Inscripcion WHERE idAlumno";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("Nota"));
                cursadas.add(insc);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Inscripción" + ex.getMessage());
        }
        return cursadas;
    }
    
    public List<Materia> obtenerMateriaCursadas(int idAlumno){
    List<Materia> materiasCursadas = new ArrayList<>();
        
        String sql = "SELECT inscripcion.idMateria, nombre, ano FROM inscripcion JOIN materia "
                + "ON(inscripcion.idMateria=materia.idMateria) WHERE inscripcion.idAlumno = ?;";
//      String sql = "SELECT inscripcion.idMateria, nombre, ano FROM inscripcion,"
//                + "materia WHERE inscripcion.idMateria = materia.idMateria"
//                + "AND inscripcion.idAlumno = ?;";
//Asi lo implementa el pelado
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery();) {
            ps.setInt(1, rs.getInt("idAlumno"));
            while (rs.next()) {
                Materia mat= new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAno(rs.getInt("ano"));
                materiasCursadas.add(mat);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Base de Datos" + ex.getMessage());
        }

        return materiasCursadas;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
    List<Materia> materiasNOCursadas = new ArrayList<>();
        
        String sql = "SELECT M.idMateria, M.nombre, M.ano\n"
                + "FROM Materia M\n"
                + "WHERE M.idMateria NOT IN (\n"
                + "    SELECT I.idMateria\n"
                + "    FROM Inscripcion I\n"
                + "    WHERE I.idAlumno = ?\n"
                + ");";
//      String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
//                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery();) {
            ps.setInt(1, rs.getInt("idAlumno"));
            while (rs.next()) {
                Materia mat= new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAno(rs.getInt("ano"));
                materiasNOCursadas.add(mat);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Base de Datos" + ex.getMessage());
        }

        return materiasNOCursadas;
    }
    
    public List<Alumno> obtenerAlumnoXMateria(int idMateria){
       ArrayList<Alumno> alumnosxmateria = new ArrayList<>();
        
        try {
//            String sql = "SELECT a.idAlumno,dni,nombre,apellido,fechaNac,estado WHERE idAlumno"
//                    +"FROM inscripcion i, alumno a WHERE i.idAlumno=a.idAlumno AND idMateria = ? AND a.estado=1";
//Lo cambie porque me tiraba error. Corroboren si les pasa lo mismo.
            String sql = "SELECT a.idAlumno, a.dni, a.apellido, a.nombre, a.fechaNac, a.estado FROM `inscripcion`  "
                + "JOIN alumno a ON(a.idAlumno=inscripcion.idAlumno)  "
                + "JOIN materia m ON(m.idMateria=inscripcion.idMateria) WHERE inscripcion.idMateria= ?;" ;
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                Alumno axm = new Alumno();
                axm.setIdAlumno(rs.getInt("idAlumno"));
                axm.setDni(rs.getInt("dni"));
                axm.setNombre("nombre");
                axm.setApellido("apellido");
                axm.setfNac(rs.getDate("fechaNac").toLocalDate());
                axm.setEstado(rs.getBoolean("estado"));
                alumnosxmateria.add(axm);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso" + ex.getMessage());
        }
        return alumnosxmateria; 
    }
    
} 

