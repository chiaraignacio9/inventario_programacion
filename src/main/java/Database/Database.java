/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 54263
 */
public class Database {
    
    public Connection conectar(){
        Connection connection = null;

        String directorioActual = System.getProperty("user.dir");

        try {
            // Establecer la conexión a la base de datos SQLite
            String url = "jdbc:sqlite:" + directorioActual + "/src/main/java/Database/database.db";
            connection = DriverManager.getConnection(url);
            // Verificar si la conexión fue exitosa
            if (connection != null) {
                System.out.println("Conectado a la base de datos SQLite.");
                return connection;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
}
