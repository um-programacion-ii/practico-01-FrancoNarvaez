package entity;

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
