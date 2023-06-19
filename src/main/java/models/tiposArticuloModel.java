package models;

public class tiposArticuloModel {
    private int idTipoArticulo;
    private String descripcion;

    public tiposArticuloModel() {
    }

    public tiposArticuloModel(int idTipoArticulo, String descripcion) {
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
}
