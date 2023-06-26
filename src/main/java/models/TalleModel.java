package Models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TalleModel {
    private int idTalle;
    private String descripcion;

    public TalleModel() {
    }

    public TalleModel(int idTalle, String descripcion) {
        this.idTalle = idTalle;
        this.descripcion = descripcion;
    }

    public int getIdTalle() {
        return idTalle;
    }

    public void setIdTalle(int idTalle) {
        this.idTalle = idTalle;
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
            String createTableQuery = "CREATE TABLE IF NOT EXISTS talles ("
                    + "idTalle INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "descripcion TEXT NOT NULL)";
            statement.executeUpdate(createTableQuery);

            System.out.println("Tabla 'talles' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
