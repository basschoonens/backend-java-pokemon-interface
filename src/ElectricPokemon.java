import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    String type;
    String name;


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    void thunderPunch(Pokemon name, Pokemon enemy);

    void electroBall(Pokemon name, Pokemon enemy);

    void thunder(Pokemon name, Pokemon enemy);

    void voltTackle(Pokemon name, Pokemon enemy);

    public String getType() {
        return type;
    }
}
