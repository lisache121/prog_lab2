import ru.ifmo.se.pokemon.Type;

public class Torracat extends Litten{
    public Torracat(String name, int level) {
        super(name, level);
        setStats(65, 85, 50, 80, 50, 90);
        setType(Type.FIRE);
        setMove(new Facade(Type.NORMAL, 40, 50), new Confide(Type.NORMAL, 5, 7),
                new FireFang(Type.FIRE, 30, 40));
    }
}
