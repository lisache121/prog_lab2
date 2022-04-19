import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald(Type type, double var2, double var4) {
    };
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.burn(pokemon);
    }
}
