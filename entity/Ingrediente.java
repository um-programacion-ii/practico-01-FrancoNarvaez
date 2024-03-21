package entity;

public class Ingrediente {
    private String nombre;
    private int cantidad;
    public Ingrediente(String nombre, int cantidad) {
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
    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }
    public void sacar(int cantidad) {
        if (this.cantidad < cantidad) {
            System.out.println("No hay suficiente cantidad de " + this.nombre);
        }
        else {this.cantidad -= cantidad;
    }
    }
    public void agregar(int cantidad) {
        this.cantidad += cantidad;
    }
    @Override
    public String toString() {
        return "Ingrediente [cantidad=" + cantidad + ", nombre=" + nombre + "]";
    }
}
class Receta {
    private int tiempoCoccion;
    private Ingrediente[] ingredientes;
    private String preparacion;
    public Receta(int tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }
    public String getPreparacion() {
        return preparacion;
    }

    @Override
    public String toString() {
        String ListIngredientes = "";
        for (Ingrediente ingrediente : ingredientes) {
            ListIngredientes += "\n" + ingrediente;
        }
        return "Receta: \nTiempo de coccion: " + tiempoCoccion + "\nIngredientes: " + ListIngredientes + "\nPreparacion: " + preparacion;
    }
}