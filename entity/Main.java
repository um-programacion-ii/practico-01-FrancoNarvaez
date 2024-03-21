package entity;

public class Main {
    public static void main(String[] args){
        Ingrediente ingrediente = new Ingrediente("Azucar", 2);
        System.out.println(ingrediente);
        Ingrediente ingrediente1 = new Ingrediente("Pan", 3);
        System.out.println(ingrediente1);

        Despensa despensa = new Despensa();
        Ingrediente azucar = new Ingrediente("Azucar", 5);
        Ingrediente pan = new Ingrediente("Pan", 3);

        despensa.addIngrediente(azucar);
        despensa.addIngrediente(pan);

        despensa.getIngrediente("Azucar", 2);
        despensa.getIngrediente("Pan", 1);
        despensa.getIngrediente("Azucar", 4);
        despensa.getIngrediente("Pan", 3);

        HuevoDuro huevoDuro = new HuevoDuro();
        System.out.println(huevoDuro);

        ArrozConLeche arrozConLeche = new ArrozConLeche();
        System.out.println(arrozConLeche);

        Ensalada ensalada = new Ensalada();
        System.out.println(ensalada);
    }
}