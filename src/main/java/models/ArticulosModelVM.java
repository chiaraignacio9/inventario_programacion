package Models;

public class ArticulosModelVM{
    
    private int idArticulo;
    private String descripcion;
    private String talle;
    private String tipo;
    private String estado;
    private float precio;
    private String distribuidor;

    public ArticulosModelVM(int idArticulo, String descripcion, String talle, String tipo, String estado, float precio,String distribuidor) {
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.talle = talle;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
        this.distribuidor = distribuidor;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }
    
}
