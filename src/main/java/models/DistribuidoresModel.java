package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DistribuidoresModel {
    private int idDistribuidores;
    private String razonSocial;
    private String descripcion;

    public DistribuidoresModel() {
    }

    public DistribuidoresModel(String razonSocial, String descripcion) {
        this.razonSocial = razonSocial;
        this.descripcion = descripcion;
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

    public void create(Connection connection, DistribuidoresModel distribuidor){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String insert = "INSERT INTO distribuidores"
                    + "(razonSocial, descripcion)"
                    + "VALUES"
                    + "('"
                    + distribuidor.getRazonSocial()
                    +"','"
                    + distribuidor.getDescripcion()
                    + "')";
            statement.executeUpdate(insert);
            System.out.println("Registro insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<DistribuidoresModel> findAll(Connection connection){
        try (Statement statement = connection.createStatement()) {
            List<DistribuidoresModel> distribuidoresModelList = new ArrayList<>();
            // Statement es para hacer las consultas
            String selectAll = "SELECT * FROM distribuidores";
            ResultSet resultSet = statement.executeQuery(selectAll);

            while (resultSet.next()){

                distribuidoresModelList.add(new DistribuidoresModel(
                        resultSet.getInt("idDistribuidor"),
                        resultSet.getString("razonSocial"),
                        resultSet.getString("descripcion")
                ));

                System.out.println(resultSet);
            }

            return distribuidoresModelList;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void findById(Connection connection, Integer id){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String selectWhere = "SELECT * FROM distribuidores WHERE idDistribuidor = " + id + " LIMIT 1";
            ResultSet resultSet = statement.executeQuery(selectWhere);

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

    public Connection connect(){
        Connection connection = null;
        String directorioActual = System.getProperty("user.dir");
        try {
            // Establecer la conexión a la base de datos SQLite
            String url = "jdbc:sqlite:" + directorioActual + "/src/main/database/database.db";
            connection = DriverManager.getConnection(url);

            // Verificar si la conexión fue exitosa
            if (connection != null) {
                return connection;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
