import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Regice extends Pokemon{
    public Regice(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setStats(80, 50, 100, 100, 200, 50);
        setMove(new Swift(Type.NORMAL, 30, 50), new Confide(Type.NORMAL, 5, 5),
                new XScissor(Type.BUG, 30, 40));
    }
}
