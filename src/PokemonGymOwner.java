//import java.util.List;
//
//public class PokemonGymOwner {
//
//    String name;
//    String town;
//    List<Pokemon> pokemons;
//
////    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
////    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getTown() {
//        return town;
//    }
//
//    public List<Pokemon> getPokemons() {
//        return pokemons;
//    }
//}

import java.util.List;

public class PokemonGymOwner {

    private String name;
    private String town;
    private List<Pokemon> pokemons;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        this.name = name;
        this.town = town;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
