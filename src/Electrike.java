import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Electrike extends Pokemon{
    public Electrike(String name, int level){
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(40, 45, 40, 65, 40, 65);
        setMove(new Scald(Type.FIRE, 30, 30), new Bubble(Type.WATER, 20, 40), new Rest());
    }
}
