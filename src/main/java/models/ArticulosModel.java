package models;

public class ArticulosModel {
    private int idArticulo;
    private int idTipoArticulo;
    private String descripcion;
    private int idMarca;
    private float precio;
    private int estado;
    private int idCategoria;
    private int idDistribudor;

    public ArticulosModel() {
    }

    public ArticulosModel(int idArticulo, int idTipoArticulo, String descripcion, int idMarca, float precio, int estado, int idCategoria, int idDistribudor) {
        this.idArticulo = idArticulo;
        this.idTipoArticulo = idTipoArticulo;
        this.descripcion = descripcion;
        this.idMarca = idMarca;
        this.precio = precio;
        this.estado = estado;
        this.idCategoria = idCategoria;
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

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdDistribudor() {
        return idDistribudor;
    }

    public void setIdDistribudor(int idDistribudor) {
        this.idDistribudor = idDistribudor;
    }
}
