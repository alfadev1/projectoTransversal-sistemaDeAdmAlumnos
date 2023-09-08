/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appgestionuniversidad;


import java.sql.PreparedStatement;
import AccesoADatos.Conexion;
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
    }
    
}
