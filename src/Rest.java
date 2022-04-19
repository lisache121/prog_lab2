import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 1, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        System.out.println(pokemon.toString() + " пора спать");
        Effect.sleep(pokemon);
    }
}
