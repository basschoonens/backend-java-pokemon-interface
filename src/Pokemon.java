import java.util.List;
import java.util.Scanner;

public abstract class Pokemon {

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    String name;
    int level;
    int hp;
    String food;
    String sound;

}
