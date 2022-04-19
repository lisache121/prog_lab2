import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {
    public FocusBlast(Type type, double v1, double v2) {};

    protected void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.SPECIAL_DEFENSE, -3);
    }
}
