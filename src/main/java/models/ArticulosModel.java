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
    private int idMarca;
    private float precio;
    private int estado;
    private int idDistribudor;

    public ArticulosModel() {
    }

    public ArticulosModel(int idArticulo, int idTipoArticulo, String descripcion, int idMarca, float precio, int estado, int idDistribudor) {
        this.idArticulo = idArticulo;
        this.idTipoArticulo = idTipoArticulo;
        this.descripcion = descripcion;
        this.idMarca = idMarca;
        this.precio = precio;
        this.estado = estado;
        this.idDistribudor = idDistribudor;
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

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
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
                    "idDistribuidor INTEGER," +
                    "FOREIGN KEY (idMarca) REFERENCES marcas(id)," +
                    "FOREIGN KEY (estado) REFERENCES estados(id)," +
                    "FOREIGN KEY (idDistribudor) REFERENCES distribuidores(id)," +
                    "FOREIGN KEY (idTipoArticulo) REFERENCES tiposArticulo(id)" +
                    ")";
            statement.executeUpdate(createTableQuery);

            System.out.println("Tabla 'articulos' creada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Object> findAll(Connection connection){
        List<Object> list = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            // Statement es para hacer las consultas
            String selectAll = "SELECT articulos.*, marcas.nombre as marca,"
                    + "talles.descripcion as talle, tiposArticulo.descripcion as tipo "
                    + "FROM articulos "
                    + "INNER JOIN marcas ON articulos.idMarca = marcas.idMarca "
                    + "INNER JOIN talles ON articulos.idTalle = talles.idTalle "
                    + "INNER JOIN tiposArticulo ON articulos.idTipoArticulo = tiposArticulo.idTipoArticulo "
                    + "INNER JOIN estados ON articulo.estado = estados.idEstado";
            ResultSet resultSet = statement.executeQuery(selectAll);
            
            while (resultSet.next()){
                
                Object[] obj = {
                    resultSet.getInt("idArticulo"),
                    resultSet.getString("descripcion"),
                    resultSet.getString("marca"),
                    resultSet.getString("talle"),
                    resultSet.getString("tipo"),
                    resultSet.getString("estado"),
                    resultSet.getFloat("precio")
                };
                
                list.add(obj);
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
                    + "(idTipoArticulo, descripcion, idMarca, precio, estado, idDistribuidor)"
                    + "VALUES"
                    + "('"
                    + articulo.getIdTipoArticulo()
                    +"','"
                    + articulo.getDescripcion()
                    +"','"
                    + articulo.getIdMarca()
                    +"','"
                    + articulo.getPrecio()
                    +"','"
                    + articulo.getEstado()
                    +"','"
                    + articulo.getIdDistribudor()                    
                    + "')";
            statement.executeUpdate(insert);
            System.out.println("Registro insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
