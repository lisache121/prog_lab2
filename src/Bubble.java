import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Bubble extends SpecialMove {
    public Bubble(Type type, double var1, double var2){
    };

    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect.flinch(var1);
    }
}
