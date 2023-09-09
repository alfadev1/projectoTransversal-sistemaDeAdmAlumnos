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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        
    }
    public Alumno buscarAlumno(int id){
        //ayuuuda chicos ajajjaj
        //al id que es pasado por parámetro lo guardo un una variable para después utilizarla en el sql
        //Daniel:Ahi me fijo
        int llave=id;
        String sql="SELECT*  FROM `alumno` WHERE id=llave";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
           ResultSet rs= ps.executeQuery();
           While (rs.next()){ //Daniel:Esta linea me tira como error
            System.out.println("Apellido"+rs.getString("apellido")
            +"Nombre"+rs.getString("nombre")
            +"DNI"+ rs.getInt("dni")
            +"Estado"+rs.getBoolean("estado"));
           
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*EL SUGERIDO QUE ESTA EN LA GUIA:
    
    public Alumno buscarAlumno(int id) {
47 Alumno alumno = null;
48 String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
49 PreparedStatement ps = null;
50 try {
51 ps = con.prepareStatement(sql);
52 ps.setInt(1,id );
53 ResultSet rs = ps.executeQuery();
54
55 if (rs.next()) {
56 alumno=new Alumno();
57 alumno.setIdAlumno(id);
58 alumno.setDni(rs.getInt("dni"));
59 alumno.setApellido(rs.getString("apellido"));
60 alumno.setNombre(rs.getString("nombre"));
61 alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
62 alumno.setEstado(true);
63
64
65 } else {
66 JOptionPane.showMessageDialog(null, "No existe el alumno");
67
68 ps.close();
69 } catch (SQLException ex) {
70 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage()); 71

}
72
73 return alumno;
74 }*/
    
}
