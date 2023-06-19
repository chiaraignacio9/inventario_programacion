package models;

public class StockModel {
    private int idArticulo;
    private int cantidad;
    private int idTalle;

    public StockModel() {
    }

    public StockModel(int idArticulo, int cantidad, int idTalle) {
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.idTalle = idTalle;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdTalle() {
        return idTalle;
    }

    public void setIdTalle(int idTalle) {
        this.idTalle = idTalle;
    }
}
