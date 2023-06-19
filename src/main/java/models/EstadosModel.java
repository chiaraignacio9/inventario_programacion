package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EstadosModel {
    private int idEstado;
    private String descripcion;

    public EstadosModel() {
    }

    public EstadosModel(int idEstado, String descripcion) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void createTable(Connection connection) throws SQLException {
        try (connection) {
            // Statement es para hacer las consultas
            Statement statement = connection.createStatement();

            String createTableQuery = "CREATE TABLE IF NOT EXISTS Estados ("
                    + "idEstado INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "descripcion TEXT NOT NULL)";
            statement.executeUpdate(createTableQuery);

            System.out.println("Tabla 'estados' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
