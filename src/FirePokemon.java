import java.util.List;

public class FirePokemon extends Pokemon{

    String type;
    String name;


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    void inferno(Pokemon name, Pokemon enemy);

    void pyroBall(Pokemon name, Pokemon enemy);

    void fireLash(Pokemon name, Pokemon enemy);

    void flameThrower(Pokemon name, Pokemon enemy);

    public String getType() {
        return type;
    }

}
