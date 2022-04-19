
import ru.ifmo.se.pokemon.Type;

public class Manectric extends Electrike {
    public Manectric(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(70, 75, 60, 105, 60, 105);
        setMove(new Scald(Type.FIRE, 35, 40), new Bubble(Type.WATER, 30, 40),
                new Rest(), new FocusBlast(Type.FIGHTING, 60, 35));
    }
}
