import java.util.List;

public class WaterPokemon extends Pokemon{

    String type;
    String name;

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    void surf(Pokemon name, Pokemon enemy);

    void hydroPump(Pokemon name, Pokemon enemy);

    void hydroCanon(Pokemon name, Pokemon enemy);

    void rainDance(Pokemon name, Pokemon enemy);


}
