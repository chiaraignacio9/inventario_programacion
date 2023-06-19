import models.EstadosModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        String directorioActual = System.getProperty("user.dir");


        try {
            // Establecer la conexión a la base de datos SQLite
            String url = "jdbc:sqlite:" + directorioActual + "/src/main/database/database.db";
            connection = DriverManager.getConnection(url);

            // Verificar si la conexión fue exitosa
            if (connection != null) {
                System.out.println("Conectado a la base de datos SQLite.");
                EstadosModel estadosModel = new EstadosModel();
                estadosModel.createTable(connection);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
