import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    public static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super("water", name, level, hp, food, sound);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with Surf");
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses 13 HP");
                enemy.setHp(enemy.getHp() - 13);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 8 HP");
                enemy.setHp(enemy.getHp() - 8);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 6 HP");
                enemy.setHp(enemy.getHp() - 6);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with HydroPump");
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses 18 HP");
                enemy.setHp(enemy.getHp() - 18);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 14 HP");
                enemy.setHp(enemy.getHp() - 14);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 11 HP");
                enemy.setHp(enemy.getHp() - 11);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with HydroCanon");
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 9 HP");
                enemy.setHp(enemy.getHp() - 9);
                break;
            case "grass":
                System.out.println(enemy.getName() + " loses 7 HP");
                enemy.setHp(enemy.getHp() - 7);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with RainDance");
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses 16 HP");
                enemy.setHp(enemy.getHp() - 16);
                break;
            case "electric":
                System.out.println("Has no effect on: " + enemy.getName());
                break;
            case "grass":
                System.out.println("Oh no, this attack boosts Grass type enemy's health");
                enemy.setHp(enemy.getHp() + 20);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 7 HP");
                enemy.setHp(enemy.getHp() - 7);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    List<String> getAttacks() {
        return attacks;
    }

}
