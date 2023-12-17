import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    public static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("LeafStorm","SolarBeam","LeechSeed","LeaveBlade");


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super("grass", name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with LeafStorm");
    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with SolarBeam");
    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with LeechSeed");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with LeaveBlade");
    }

    List<String> getAttacks() {
        return attacks;
    }

}
