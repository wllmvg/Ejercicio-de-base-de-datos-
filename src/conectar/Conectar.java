package conectar;


import java.sql.Connection;
import java.sql.DriverManager;



public class Conectar {
    
    
    public static final String URL = "jdbc:mysql://sql255.main-hosting.eu:3306/u268390930_bdCrud"; // localhost
    public static final String USER = "u268390930_usuario"; //root
    public static final String CLAVE = "Cristian2522*"; //""
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}