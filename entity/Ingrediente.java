package entity;

public class Ingrediente {
    protected String nombre;
    protected int cantidad;

    public Ingrediente(String nombre,int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Ingrediente [cantidad=" + cantidad + ", nombre=" + nombre + "]";
    }
}