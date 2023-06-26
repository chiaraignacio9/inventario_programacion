package Models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StockModel {
    private int idArticulo;
    private int cantidad;
    private int idTalle;

    public StockModel() {
    }

    public StockModel(int idArticulo, int cantidad, int idTalle) {
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.idTalle = idTalle;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdTalle() {
        return idTalle;
    }

    public void setIdTalle(int idTalle) {
        this.idTalle = idTalle;
    }

    public void createTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String createTableQuery = "CREATE TABLE IF NOT EXISTS stock (" +
                    "idArticulo INTEGER," +
                    "cantidad INTEGER," +
                    "idTalle INTEGER," +
                    "FOREIGN KEY (idArticulo) REFERENCES articulos(idArticulo)," +
                    "FOREIGN KEY (idTalle) REFERENCES talles(idTalle)" +
                    ")";
            statement.executeUpdate(createTableQuery);

            System.out.println("Tabla 'stock' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
