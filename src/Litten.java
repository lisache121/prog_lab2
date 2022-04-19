import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Litten extends Pokemon {
    public Litten(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(45, 65, 40, 60, 40, 70);
        setMove(new Facade(Type.NORMAL, 35, 50), new Confide(Type.NORMAL, 10, 10));
    }
}
