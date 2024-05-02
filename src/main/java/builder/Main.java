package builder;

public class Main {
    public static void main(String[] args) {
       NyPizza nyPizza = new NyPizza.Builder().size(NyPizza.Size.SMALL).addTopping(Pizza.Topping.ONION).build();

    }
}
