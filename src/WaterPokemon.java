import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    public static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf","HydroPump","HydroCanon","RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super("water", name, level, hp, food, sound);
    }

    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with Surf");
    }
    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with HydroPump");
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with HydroCanon");
    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with RainDance");
    }

    List<String> getAttacks() {
        return attacks;
    }

}
