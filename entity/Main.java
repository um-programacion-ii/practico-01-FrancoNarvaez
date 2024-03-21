package entity;

public class Main {
    public static void main(String[] args){
        Ingrediente azucar = new Ingrediente("Azucar", 500);
        System.out.println(azucar);
        Ingrediente pan = new Ingrediente("Pan", 3);
        System.out.println(pan);
        Ingrediente huevo = new Ingrediente("Huevo", 12);
        System.out.println(huevo);
        Ingrediente arroz = new Ingrediente("Arroz", 100);
        System.out.println(arroz);

        Despensa despensa = new Despensa();

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