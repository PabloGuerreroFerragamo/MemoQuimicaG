/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Rec17
 */
public class ConexionBD {
    Connection cn;
    Statement st;
     // Funcion que va conectarse a mi bd de mysql
    public Connection conexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/memoramaquimica","root","");
            System.out.println("Se hizo la conexion exitosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado"); 
    }
}
