package models;

public class DistribuidoresModel {
    private int idDistribuidores;
    private String razonSocial;
    private String descripcion;

    public DistribuidoresModel() {
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
}
