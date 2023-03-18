/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariamysqlnube;
import java.sql.*;

public class ConexionMySQL
{
    Connection conn;
    
    public Connection open() throws ClassNotFoundException, SQLException{
        //Dario: aquí cambié el user y password para acceder con mi base de datos
        /*Ale: Hagan un usuario en sql server con las caracteristicas en este archivo, para que no
               la estemos cambiando a cada rato que subamos cambios al repo */

        String user = "uqenl9dmhjxy2uts";
        String password = "J16jbcwhwp5Dn6u1UqCK";
        String url = "jdbc:mysql://uqenl9dmhjxy2uts:J16jbcwhwp5Dn6u1UqCK@bksmcbwyzyex8dopzftg-mysql.services.clever-cloud.com:3306/bksmcbwyzyex8dopzftg";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        conn = DriverManager.getConnection(url, user, password);
        
        return conn;
    } 
    
    public void close() throws Exception{
        
        if(conn != null){
            
            conn.close();
            System.out.println("Cerrado");
        }
        else{
            System.out.println("Something have been happened");
        }
    }
}
