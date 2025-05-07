/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coneccion;
import java.sql.*;
/**
 *
 * @author maick
 */
public class bdConexion {
    static String url = "jdbc:mysql://localhost:3306/bd_empresa_svc_refrijera";
    static String user = "root";
    static String pass = "MyNewPass1";
    
    public static Connection conectar(){
        Connection con = null;
        try{
            con= DriverManager.getConnection(url,user,pass);
            System.out.println("Conexcion exitossa");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
