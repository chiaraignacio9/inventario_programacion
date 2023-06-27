package Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TalleModel {
    private int idTalle;
    private String descripcion;

    public TalleModel() {
    }

    public TalleModel(String descripcion) {
        this.descripcion = descripcion;
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
    
    public void create(Connection connection, TalleModel talle){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String insert = "INSERT INTO talles"
                    + "(descripcion)"
                    + "VALUES"
                    + "('"                                        
                    + talle.getDescripcion()
                    + "')";
            statement.executeUpdate(insert);
            System.out.println("Registro insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public List<TalleModel> findAll(Connection connection){
        try (Statement statement = connection.createStatement()) {
            List<TalleModel> talleModelList = new ArrayList<>();
            // Statement es para hacer las consultas
            String selectAll = "SELECT * FROM talles";
            ResultSet resultSet = statement.executeQuery(selectAll);

            while (resultSet.next()){
                talleModelList.add(new TalleModel(
                        resultSet.getInt("idTalle"),                        
                        resultSet.getString("descripcion")
                ));                
            }

            return talleModelList;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteById(Connection connection, int id) {
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String delete = "DELETE FROM talles WHERE idTalle= " + id;
            statement.execute(delete);
            return;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Connection connection, TalleModel talleModel) {
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String update = "UPDATE talles SET descripcion = '"                                 
                    + talleModel.getDescripcion()
                    + "' WHERE idTalle = "
                    + talleModel.getIdTalle();
            statement.executeUpdate(update);    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String toString() {
        return descripcion;
    }
}
