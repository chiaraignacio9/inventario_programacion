package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DistribuidoresModel {
    private int idDistribuidores;
    private String razonSocial;
    private String descripcion;

    public DistribuidoresModel() {
    }

    public DistribuidoresModel(int idDistribuidores, String razonSocial, String descripcion) {
        this.idDistribuidores = idDistribuidores;
        this.razonSocial = razonSocial;
        this.descripcion = descripcion;
    }

    public int getIdDistribuidores() {
        return idDistribuidores;
    }

    public void setIdDistribuidores(int idDistribuidores) {
        this.idDistribuidores = idDistribuidores;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void createTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {            // Statement es para hacer las consultas
            String createTableQuery = "CREATE TABLE IF NOT EXISTS distribuidores ("
                    + "idDistribuidor INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "razonSocial VARCHAR(127) NOT NULL,"
                    + "descripcion VARCHAR(127))";
            statement.executeUpdate(createTableQuery);
            System.out.println("Tabla 'distribuidores' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
