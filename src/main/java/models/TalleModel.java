package models;

public class TalleModel {
    private int idTalle;
    private String descripcion;

    public TalleModel() {
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
}
