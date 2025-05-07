/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa.refrijerante;

import coneccion.bdConexion;
/**
 *
 * @author maick
 */
public class EmpresaRefrijerante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bdConexion dbc = new bdConexion();
        dbc.conectar();
        
    }
    
}
