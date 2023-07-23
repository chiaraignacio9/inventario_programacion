package Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArticulosModel {
    private int idArticulo;
    private int idTipoArticulo;
    private String descripcion;    
    private float precio;
    private int estado;
    private int idDistribudor;
    private int idTalle;

    public ArticulosModel() {
    }

    public ArticulosModel(int idArticulo, int idTipoArticulo, String descripcion, float precio, int estado, int idDistribudor, int idTalle) {
        this.idArticulo = idArticulo;
        this.idTipoArticulo = idTipoArticulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.idDistribudor = idDistribudor;
        this.idTalle = idTalle;
    }

    public ArticulosModel(int idTipoArticulo, String descripcion, float precio, int estado, int idDistribudor, int idTalle) {
        this.idTipoArticulo = idTipoArticulo;
        this.descripcion = descripcion;        
        this.precio = precio;
        this.estado = estado;
        this.idDistribudor = idDistribudor;
        this.idTalle = idTalle;
    }

    public int getIdTalle() {
        return idTalle;
    }

    public void setIdTalle(int idTalle) {
        this.idTalle = idTalle;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdDistribudor() {
        return idDistribudor;
    }

    public void setIdDistribudor(int idDistribudor) {
        this.idDistribudor = idDistribudor;
    }

    public void createTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String createTableQuery = "CREATE TABLE IF NOT EXISTS articulos (" +
                    "idArticulo INTEGER PRIMARY KEY," +
                    "idTipoArticulo INTEGER," +
                    "descripcion TEXT," +
                    "idMarca INTEGER," +
                    "precio REAL," +
                    "estado INTEGER," +
                    "idTalle INTEGER" +
                    "idDistribuidor INTEGER," +
                    ")";
            statement.executeUpdate(createTableQuery);

            System.out.println("Tabla 'articulos' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<ArticulosModelVM> findAll(Connection connection){
        List<ArticulosModelVM> list = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String selectAll = "SELECT a.precio, d.razonSocial as razonSocial, a.idArticulo,a.descripcion," +
                        "IFNULL(t.descripcion,'') as talle, IFNULL(ta.descripcion,'') as tipo, e.descripcion as estado " +
                        "FROM articulos a " +
                        "INNER JOIN distribuidores d ON a.idDistribuidor = d.idDistribuidor " +
                        "INNER JOIN talles t ON a.idTalle = t.idTalle " +
                        "INNER JOIN tiposArticulo ta ON a.idTipoArticulo = ta.idTipoArticulo " +
                        "INNER JOIN estados e ON a.estado = e.idEstado";
            
            System.out.println(selectAll);
            
            
            ResultSet resultSet = statement.executeQuery(selectAll);
            
            while (resultSet.next()){                                                
                list.add(new ArticulosModelVM(
                    resultSet.getInt("idArticulo"),
                    resultSet.getString("descripcion"),                       
                    resultSet.getString("talle"),
                    resultSet.getString("tipo"),
                    resultSet.getString("estado"),
                    resultSet.getFloat("precio"),
                    resultSet.getString("razonSocial")                        
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void create(Connection connection, ArticulosModel articulo){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String insert = "INSERT INTO articulos"
                    + "(descripcion, precio, estado, idDistribuidor, idTIpoArticulo, idTalle)"
                    + "VALUES"
                    + "('"
                    + articulo.getDescripcion()                                        
                    +"','"
                    + articulo.getPrecio()
                    +"','"
                    + articulo.getEstado()
                    +"','"
                    + articulo.getIdDistribudor()                                        
                    +"','"
                    + articulo.getIdTipoArticulo()
                    +"','"
                    + articulo.getIdTalle()
                    + "')";
            statement.executeUpdate(insert);
            System.out.println("Registro insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(Connection connection, ArticulosModel articulo){
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String update = "UPDATE articulos SET " 
               + "idTipoArticulo = " + articulo.getIdTipoArticulo() + ", "
               + "descripcion = '" + articulo.getDescripcion() + "', "
               + "precio = " + articulo.getPrecio() + ", "
               + "estado = " + articulo.getEstado() + ", "
               + "idDistribuidor = " + articulo.getIdDistribudor() + ", "
               + "idTalle = " + articulo.getIdTalle() + " "
               + "WHERE idArticulo = " + articulo.getIdArticulo();

               statement.executeUpdate(update);   
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteById(Connection connection, int id) {
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String delete = "DELETE FROM articulos WHERE idArticulo = " + id;
            statement.execute(delete);
            return;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
