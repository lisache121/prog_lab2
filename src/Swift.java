import ru.ifmo.se.pokemon.*;

public class Swift extends SpecialMove {
    public Swift(Type var1, double var2, double var4) {
    };

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.poison(pokemon);
    }
}
