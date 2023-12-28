import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    public static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super("grass", name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with LeafStorm");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 13 HP");
                enemy.setHp(enemy.getHp() - 13);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 8 HP");
                enemy.setHp(enemy.getHp() - 8);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 6 HP");
                enemy.setHp(enemy.getHp() - 6);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 2 HP");
                enemy.setHp(enemy.getHp() - 2);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with SolarBeam");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 7 HP");
                enemy.setHp(enemy.getHp() - 7);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 4 HP");
                enemy.setHp(enemy.getHp() - 4);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with LeafStorm");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 14 HP");
                enemy.setHp(enemy.getHp() - 14);
                System.out.println(name.getName() + " takes from your HP and gains 14 HP to their health");
                name.setHp(name.getHp() + 14);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 12 HP");
                enemy.setHp(enemy.getHp() - 12);
                System.out.println(name.getName() + " takes from your HP and gains 12 HP to their health");
                name.setHp(name.getHp() + 12);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(name.getName() + " takes from your HP and gains 10 HP to their health");
                name.setHp(name.getHp() + 10);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 7 HP");
                enemy.setHp(enemy.getHp() - 7);
                System.out.println(name.getName() + " takes from your HP and gains 7 HP to their health");
                name.setHp(name.getHp() + 7);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println(" ");
        System.out.println(name.getName() + " now has " + name.getHp());
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with LeafStorm");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 18 HP");
                enemy.setHp(enemy.getHp() - 18);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 12 HP");
                enemy.setHp(enemy.getHp() - 12);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    List<String> getAttacks() {
        return attacks;
    }

}
