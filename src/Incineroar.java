import ru.ifmo.se.pokemon.Type;

public class Incineroar extends Torracat{
    public Incineroar(String name, int level) {
        super(name, level);
        setStats(95, 115, 90, 80, 90, 60);
        setType(Type.FIRE, Type.DARK);
        setMove(new Facade(Type.NORMAL, 40, 50), new Confide(Type.NORMAL, 5, 7),
                new FireFang(Type.FIRE, 30, 40), new Hurricane(Type.FLYING, 50, 30));
    }
}
