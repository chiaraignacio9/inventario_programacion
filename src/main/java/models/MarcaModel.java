package Models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MarcaModel {
    private int idMarca;
    private String nombre;
    private String notas;

    public MarcaModel() {
    }

    public MarcaModel(int idMarca, String nombre, String notas) {
        this.idMarca = idMarca;
        this.nombre = nombre;
        this.notas = notas;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void createTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String createTableQuery = "CREATE TABLE IF NOT EXISTS marcas ("
                    + "idMarca INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "nombre VARCHAR(127) NOT NULL,"
                    + "notas TEXT )";
            statement.executeUpdate(createTableQuery);

            System.out.println("Tabla 'marcas' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
