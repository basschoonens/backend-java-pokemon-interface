import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    public static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("ThunderPunch","ElectroBall","Thunder","VoltTackle");


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super("electric", name, level, hp, food, sound);
    }


    public void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" hit "+enemy.getName()+" with ThunderPunch");
        switch (enemy.getType()){
            case "water":
                System.out.println(enemy.getName()+" loses 12 HP");
                enemy.setHp(enemy.getHp()-12);
                break;
            case "grass":
                System.out.println(enemy.getName()+" loses 8 HP");
                enemy.setHp(enemy.getHp()-8);
                break;
            case "fire":
                System.out.println(enemy.getName()+" loses 6 HP");
                enemy.setHp(enemy.getHp()-6);
                break;
            default:
                System.out.println(enemy.getName()+" loses 2 HP");
                enemy.setHp(enemy.getHp()-2);
                break;
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" HP left");
    }

    public void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" hit "+enemy.getName()+" with ElectroBall");
        switch (enemy.getType()){
            case "water":
                System.out.println(enemy.getName()+" loses 10 HP");
                enemy.setHp(enemy.getHp()-10);
                break;
            case "grass":
                System.out.println(enemy.getName()+" loses 5 HP");
                enemy.setHp(enemy.getHp()-5);
                break;
            case "fire":
                System.out.println(enemy.getName()+" loses 3 HP");
                enemy.setHp(enemy.getHp()-3);
                break;
            default:
                System.out.println(enemy.getName()+" loses 1 HP");
                enemy.setHp(enemy.getHp()-1);
                break;
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" HP left");
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" hit "+enemy.getName()+" with Thunder");
        switch (enemy.getType()){
            case "water":
                System.out.println(enemy.getName()+" loses 15 HP");
                enemy.setHp(enemy.getHp()-15);
                break;
            case "grass":
                System.out.println(enemy.getName()+" loses 11 HP");
                enemy.setHp(enemy.getHp()-11);
                break;
            case "fire":
                System.out.println(enemy.getName()+" loses 8 HP");
                enemy.setHp(enemy.getHp()-8);
                break;
            default:
                System.out.println(enemy.getName()+" loses 6 HP");
                enemy.setHp(enemy.getHp()-6);
                break;
        }
        System.out.println(name.getName()+" receives a huge HP boost");
        name.setHp(name.getHp()+30);
        System.out.println(name.getName()+" now has a whopping "+name.getHp()+"HP");
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" HP left");
    }
    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" hit "+enemy.getName()+" with VoltTackle");
        switch (enemy.getType()){
            case "water":
                System.out.println(enemy.getName()+" loses 10 HP");
                enemy.setHp(enemy.getHp()-10);
                break;
            case "grass":
                System.out.println(enemy.getName()+" loses 8 HP");
                enemy.setHp(enemy.getHp()-8);
                break;
            case "fire":
                System.out.println(enemy.getName()+" loses 6 HP");
                enemy.setHp(enemy.getHp()-6);
                break;
            default:
                System.out.println(enemy.getName()+" loses 4 HP");
                enemy.setHp(enemy.getHp()-4);
                break;
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" HP left");
    }

    List<String> getAttacks() {
        return attacks;
    }

}