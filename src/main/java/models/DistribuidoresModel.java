package Models;

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

    public void deleteById(Connection connection, Integer id){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String delete = "DELETE FROM distribuidores WHERE idDistribuidor = " + id;
            statement.execute(delete);
            return;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Connection connection, DistribuidoresModel distribuidoresModel){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String update = "UPDATE distribuidores SET razonSocial = '" +
                    distribuidoresModel.getRazonSocial() +
                    "', descripcion = '"
                    + distribuidoresModel.getDescripcion()
                    + "' WHERE idDistribuidor = "
                    + distribuidoresModel.getIdDistribuidores();
            statement.executeUpdate(update);    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String toString() {
        return razonSocial;
    }

}
