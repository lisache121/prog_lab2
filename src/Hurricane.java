import ru.ifmo.se.pokemon.*;

public class Hurricane extends SpecialMove {
    public Hurricane(Type type, double v1, double v2) {};
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.burn(pokemon);
    }
}
