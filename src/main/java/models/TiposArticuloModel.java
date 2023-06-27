package Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<TiposArticuloModel> findAll(Connection connection){
        try (Statement statement = connection.createStatement()) {
            List<TiposArticuloModel> articuloModels = new ArrayList<>();
            // Statement es para hacer las consultas
            String selectAll = "SELECT * FROM tiposArticulo";
            ResultSet resultSet = statement.executeQuery(selectAll);

            while (resultSet.next()){
                articuloModels.add(new TiposArticuloModel(
                        resultSet.getInt("idTipoArticulo"),                        
                        resultSet.getString("descripcion")
                ));

                System.out.println(resultSet);
            }

            return articuloModels;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
}
