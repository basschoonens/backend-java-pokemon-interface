import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    public static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("Thunderpunch","ElectroBall","Thunder","VoltTackle");


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }


    public void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+"hit"+enemy.getName()+"with Thunderpunch");
        switch (enemy.getType()){
            case "water": {
                System.out.println(enemy.getName()+"loses 30 HP");
                enemy.setHp(enemy.getHp()-30);
            }
        }
    }

    void electroBall(Pokemon name, Pokemon enemy);

    void thunder(Pokemon name, Pokemon enemy);

    void voltTackle(Pokemon name, Pokemon enemy);

    List<String> getAttacks() {
        return attacks;
    }

}
