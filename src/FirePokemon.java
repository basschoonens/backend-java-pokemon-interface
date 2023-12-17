import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    String type = "fire";
    private static final List<String> attacks = Arrays.asList("Inferno","PyroBall","FireFlash","Flamethrower");

    String name;


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super("fire", name, level, hp, food, sound);
    }

    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with Inferno");
    }

    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with PyroBall");
    }

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with FireLash");
    }

    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with FlameThrower");
    }

    List<String> getAttacks() {
        return attacks;
    }


}
