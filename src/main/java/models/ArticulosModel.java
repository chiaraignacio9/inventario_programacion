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

    public ArticulosModel(int idTipoArticulo, String descripcion, int idMarca, float precio, int estado, int idDistribudor) {
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
            String selectAll = "SELECT a.precio, d.razonSocial as razonSocial, a.idArticulo,a.descripcion, IFNULL(m.nombre,'') as marca," +
                        "IFNULL(t.descripcion,'') as talle, IFNULL(ta.descripcion,'') as tipo, e.descripcion as estado " +
                        "FROM articulos a " +
                        "LEFT JOIN marcas m ON a.idMarca = m.idMarca " +
                        "LEFT JOIN distribuidores d ON a.idDistribuidor = d.idDistribuidor " +
                        "LEFT JOIN talles t ON a.idTalle = t.idTalle " +
                        "LEFT JOIN tiposArticulo ta ON a.idTipoArticulo = ta.idTipoArticulo " +
                        "LEFT JOIN estados e ON a.estado = e.idEstado";
            ResultSet resultSet = statement.executeQuery(selectAll);
            
            while (resultSet.next()){
                
                list.add(new ArticulosModelVM(
                    resultSet.getInt("idArticulo"),
                    resultSet.getString("descripcion"),
                    resultSet.getString("marca"),
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
                    + "(descripcion, idMarca, precio, estado, idDistribuidor)"
                    + "VALUES"
                    + "('"
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
