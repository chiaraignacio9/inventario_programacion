package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TiposArticuloModel {
    private int idTipoArticulo;
    private String descripcion;

    public TiposArticuloModel() {
    }

    public TiposArticuloModel(int idTipoArticulo, String descripcion) {
        this.idTipoArticulo = idTipoArticulo;
        this.descripcion = descripcion;
    }

    public int getIdTipoArticulo() {
        return idTipoArticulo;
    }

    public void setIdTipoArticulo(int idTipoArticulo) {
        this.idTipoArticulo = idTipoArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void createTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String createTableQuery = "CREATE TABLE IF NOT EXISTS tiposArticulo ("
                    + "idTipoArticulo INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "descripcion TEXT NOT NULL)";
            statement.executeUpdate(createTableQuery);

            System.out.println("Tabla 'tiposArticulo' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
