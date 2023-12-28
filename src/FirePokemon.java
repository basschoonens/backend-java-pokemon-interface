import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    String type = "fire";
    private static final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireFlash", "Flamethrower");

    String name;


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super("fire", name, level, hp, food, sound);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with Inferno");
        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + " loses 12 HP");
                enemy.setHp(enemy.getHp() - 12);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 9 HP");
                enemy.setHp(enemy.getHp() - 9);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 2 HP");
                enemy.setHp(enemy.getHp() - 2);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with PyroBall");
        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 13 HP");
                enemy.setHp(enemy.getHp() - 13);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 3 HP");
                enemy.setHp(enemy.getHp() - 3);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with FireLash");
        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + " loses 17 HP");
                enemy.setHp(enemy.getHp() - 17);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 12 HP");
                enemy.setHp(enemy.getHp() - 12);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 6 HP");
                enemy.setHp(enemy.getHp() - 6);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " hit " + enemy.getName() + " with FlameThrower");
        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + " loses 18 HP");
                enemy.setHp(enemy.getHp() - 18);
                break;
            case "water":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;
            case "electric":
                System.out.println(enemy.getName() + " loses 11 HP");
                enemy.setHp(enemy.getHp() - 11);
                break;
            case "fire":
                System.out.println(enemy.getName() + " loses 9 HP");
                enemy.setHp(enemy.getHp() - 9);
                break;
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
    }

    List<String> getAttacks() {
        return attacks;
    }


}
