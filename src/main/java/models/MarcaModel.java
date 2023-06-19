package models;

public class MarcaModel {
    private int idMarca;
    private String nombre;
    private String notas;

    public MarcaModel() {
    }

    public MarcaModel(int idMarca, String nombre, String notas) {
        this.idMarca = idMarca;
        this.nombre = nombre;
        this.notas = notas;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
