import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    String type;
    String name;


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy);

    public void solarBeam(Pokemon name, Pokemon enemy);

    public void leechSeed(Pokemon name, Pokemon enemy);

    public void leaveBlade(Pokemon name, Pokemon enemy);

    public String getType() {
        return type;
    }

}
