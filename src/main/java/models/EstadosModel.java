package models;

import java.sql.Connection;
import java.sql.ResultSet;
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
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String createTableQuery = "CREATE TABLE IF NOT EXISTS estados ("
                    + "idEstado INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "descripcion TEXT NOT NULL)";
            statement.execute(createTableQuery);

            System.out.println("Tabla 'estados' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(Connection connection, EstadosModel estado){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String insert = "INSERT INTO estados"
                    + "(descripcion)"
                    + "VALUES"
                    + "('"
                    + estado.getDescripcion()
                    + "')";
            statement.executeQuery(insert);

            System.out.println("Registro insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findAll(Connection connection){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String selectAll = "SELECT * FROM estados";
            ResultSet resultSet = statement.executeQuery(selectAll);

            while (resultSet.next()){
                System.out.println("ID: " + resultSet.getInt("idEstado") + " ; Descripcion: " + resultSet.getString("descripcion"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findById(Connection connection, Integer id){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String selectWhere = "SELECT * FROM estados WHERE idEstado = " + id + " LIMIT 1";
            ResultSet resultSet = statement.executeQuery(selectWhere);
            System.out.println("ID: " + resultSet.getInt("idEstado") + " ; Descripcion: " + resultSet.getString("descripcion"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Connection connection, EstadosModel estadosModel){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String update = "UPDATE estados SET descripcion = '" +
                    estadosModel.getDescripcion() +
                    "' WHERE idEstado = "
                    + estadosModel.getIdEstado();
            statement.executeUpdate(update);

            System.out.println("Registro con ID: " + estadosModel.getIdEstado() + " ha sido actualizado");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
