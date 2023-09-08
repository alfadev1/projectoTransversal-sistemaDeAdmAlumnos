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
import java.util.Date;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
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
        int llave=id;
        String sql="SELECT*  FROM `alumno` WHERE id=llave";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
           ResultSet rs= ps.executeQuery();
           While (rs.next()){
            System.out.println("Apellido"+rs.getString("apellido")
            +"Nombre"+rs.getString("nombre")
            +"DNI"+ rs.getInt("dni")
            +"Estado"+rs.getBoolean("estado"));
           
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
