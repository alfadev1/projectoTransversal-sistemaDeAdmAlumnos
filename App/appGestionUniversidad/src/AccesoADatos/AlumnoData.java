/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

/**
 *
 * @author cyka
 */
import Entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO `alumno`(`dni`, `apellido`, `nombre`, `fechaNac`, `estado`) "
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getfNac()));
            ps.setBoolean(5, alumno.isEstado());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
<<<<<<< Updated upstream

    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNac FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

        }

        return alumno;
    }

    public Alumno buscarAlumnoDni(int dni) {
        Alumno alumno = null;

        String sql = "SELECT * FROM alumno WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
                System.out.println(alumno.getIdAlumno());
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

        }

        return alumno;
    }

}
=======
        
    }
    public Alumno buscarAlumno(int id){
        Alumno alumno=null;
        String sql="SELECT  `dni`, `apellido`, `nombre`, `fechaNac`, `estado` FROM `alumno` WHERE ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                alumno=new Alumno();
               alumno.setIdAlumno(id);
               alumno.setApellido(rs.getString("apellido"));
               alumno.setNombre(rs.getString("nombre"));
               //alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate();
               alumno.isEstado();
               return alumno;
            }else{
                JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
            }
            }
            /*
<<<<<<< Updated upstream
           ResultSet rs= ps.executeQuery();
           while (rs.next()){ //Daniel:Esta linea me tira como error
            System.out.println("Apellido"+rs.getString("apellido")
            +"Nombre"+rs.getString("nombre")
            +"DNI"+ rs.getInt("dni")
            +"Estado"+rs.getBoolean("estado"));
           
        }
           
=======
>>>>>>> Stashed changes
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al encontrar Alumno ");
        }
<<<<<<< Updated upstream
        return null;
=======
 
     
>>>>>>> Stashed changes
    }
}
>>>>>>> Stashed changes
