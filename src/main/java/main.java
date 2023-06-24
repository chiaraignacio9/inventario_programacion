import models.*;
import views.Layout;

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
                //Se crea instancia de cada modelo
                EstadosModel estadosModel = new EstadosModel();
                TalleModel talleModel = new TalleModel();
                TiposArticuloModel tiposArticuloModel = new TiposArticuloModel();
                MarcaModel marcaModel = new MarcaModel();
                DistribuidoresModel distribuidoresModel = new DistribuidoresModel();
                ArticulosModel articulosModel = new ArticulosModel();
                StockModel stockModel = new StockModel();

                // Ahora se crean las tablas en el caso que no existan
                estadosModel.createTable(connection);
                talleModel.createTable(connection);
                tiposArticuloModel.createTable(connection);
                marcaModel.createTable(connection);
                distribuidoresModel.createTable(connection);
                articulosModel.createTable(connection);
                stockModel.createTable(connection);

                // Probando que se inserte correctamente en la tabla
                //distribuidoresModel.create(connection, new DistribuidoresModel( "Cabracuervo", "Nada"));

                // Probando la lectura a la tabla estados
                //estadosModel.findAll(connection);

                // Probando buscar por ID
                //estadosModel.findById(connection, 1);
                // Probando update estado
                //estadosModel.update(connection, new EstadosModel(1, "Sin stock"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Layout layout = new Layout();
        layout.setVisible(true);
    }
}
